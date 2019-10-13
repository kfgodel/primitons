package ar.com.kfgodel.primitons.textual;

import ar.com.kfgodel.nary.api.optionals.Optional;
import ar.com.kfgodel.primitons.PrimitonTestContext;
import ar.com.kfgodel.primitons.api.Primiton;
import info.kfgodel.jspek.api.JavaSpec;
import info.kfgodel.jspek.api.JavaSpecRunner;
import org.junit.runner.RunWith;

import java.util.function.Function;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * This class verifies that every primiton has a string conversion (except Object)
 *
 * Date: 24/03/19 - 16:02
 */
@RunWith(JavaSpecRunner.class)
public class PrimitonToStringConversionTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("primiton", () -> {
      Primiton.types().primitiveTypes().forEach(primitiveType -> {

        it("has a conversion function from " + primitiveType.getSimpleName() + " to String" ,()->{
          Optional converter = Primiton.converterFrom(primitiveType, String.class);
          assertThat(converter.isPresent()).isTrue();
        });

        Class boxedType = Primiton.types().boxedFor(primitiveType).get();
        it("has a conversion function from " + boxedType.getSimpleName() + " to String" ,()->{
          Optional<Function> converter = Primiton.converterFrom(boxedType, String.class);
          assertThat(converter.isPresent()).isTrue();
        });

        it("converts a null " + boxedType.getSimpleName() + "into 'null' string",()->{
          Optional<Function> converter = Primiton.converterFrom(boxedType, String.class);
          assertThat(converter.get().apply(null)).isEqualTo("null");
        });
      });

      it("has a conversion from object to string ",()->{
        Optional converter = Primiton.converterFrom(Object.class, String.class);
        assertThat(converter.isPresent()).isTrue();
      });
    });
  }
}