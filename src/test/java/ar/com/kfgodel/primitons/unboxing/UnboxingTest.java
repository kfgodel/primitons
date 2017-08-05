package ar.com.kfgodel.primitons.unboxing;

import ar.com.dgarcia.javaspec.api.JavaSpec;
import ar.com.dgarcia.javaspec.api.JavaSpecRunner;
import ar.com.kfgodel.nary.api.optionals.Optional;
import ar.com.kfgodel.primitons.PrimitonTestContext;
import ar.com.kfgodel.primitons.api.Primiton;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * This class verifies that every boxed type has a un-boxing function
 * Date: 05/08/17 - 17:40
 */
@RunWith(JavaSpecRunner.class)
public class UnboxingTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("primiton", () -> {
      Primiton.types().boxed()
        .forEach(boxedType -> {
          Class<?> unboxedType = Primiton.types().unboxedFor(boxedType).get();
          it("has a un-boxing function from " + boxedType.getSimpleName() + " to " + unboxedType.getSimpleName() ,()->{
            Optional converter = Primiton.converterFrom(boxedType, unboxedType);
            assertThat(converter.isPresent()).isTrue();
          });
        });
    });

  }
}