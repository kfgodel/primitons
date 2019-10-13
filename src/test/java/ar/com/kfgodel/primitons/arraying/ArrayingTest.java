package ar.com.kfgodel.primitons.arraying;

import ar.com.kfgodel.nary.api.optionals.Optional;
import ar.com.kfgodel.primitons.PrimitonTestContext;
import ar.com.kfgodel.primitons.api.Primiton;
import info.kfgodel.jspek.api.JavaSpec;
import info.kfgodel.jspek.api.JavaSpecRunner;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * This class verifies that every basic type has an arraying function
 * Date: 05/08/17 - 17:40
 */
@RunWith(JavaSpecRunner.class)
public class ArrayingTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("primiton", () -> {
      Primiton.types().arrayableTypes()
        .forEach(nonArrayType -> {
          Class<?> arrayType = Primiton.types().arrayTypeOf(nonArrayType);

          it("has an arraying function from " + nonArrayType.getSimpleName() + " to " + arrayType.getSimpleName() ,()->{
            Optional converter = Primiton.converterFrom(nonArrayType, arrayType);
            assertThat(converter.isPresent()).isTrue();
          });
        });
    });

  }
}