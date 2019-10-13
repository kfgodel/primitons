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
 * Date: 24/03/19 - 18:01
 */
@RunWith(JavaSpecRunner.class)
public class StringToPrimitonConversionTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("primiton", () -> {
      Primiton.types().primitiveTypes()
        .filter(type -> !type.equals(void.class))
        .forEach(primitiveType -> {

        it("has a conversion function from String to " + primitiveType.getSimpleName(), () -> {
          Optional converter = Primiton.converterFrom(String.class, primitiveType);
          assertThat(converter.isPresent()).isTrue();
        });

        Class boxedType = Primiton.types().boxedFor(primitiveType).get();
        it("has a conversion function from String to " + boxedType.getSimpleName(),()->{
          Optional<Function> converter = Primiton.converterFrom(String.class, boxedType);
          assertThat(converter.isPresent()).isTrue();
        });

        it("converts a 'null' string into a " + boxedType.getSimpleName() + " null value",()->{
          Optional<Function> converter = Primiton.converterFrom(String.class, boxedType);
          assertThat(converter.get().apply("null")).isNull();
          assertThat(converter.get().apply(null)).isNull();
        });
      });

      it("has no converter from String to void",()->{
        Optional converter = Primiton.converterFrom(String.class, void.class);
        assertThat(converter.isAbsent()).isTrue();
      });
    });
  }
}
