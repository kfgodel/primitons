package ar.com.kfgodel.primitons.boxing;

import ar.com.dgarcia.javaspec.api.JavaSpec;
import ar.com.dgarcia.javaspec.api.JavaSpecRunner;
import ar.com.kfgodel.nary.api.optionals.Optional;
import ar.com.kfgodel.primitons.PrimitonTestContext;
import ar.com.kfgodel.primitons.api.Primiton;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * This class verifies that every boxable type has a boxing function
 * Date: 05/08/17 - 17:40
 */
@RunWith(JavaSpecRunner.class)
public class BoxingTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("primiton", () -> {
      Primiton.types().boxeableTypes()
        .forEach(unboxedType -> {
          Class<?> boxedType = Primiton.types().boxedFor(unboxedType).get();
          it("has a boxing function from " + unboxedType.getSimpleName() + " to " + boxedType.getSimpleName() ,()->{
            Optional converter = Primiton.converterFrom(unboxedType, boxedType);
            assertThat(converter.isPresent()).isTrue();
          });
        });
    });

  }
}