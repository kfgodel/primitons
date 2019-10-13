package ar.com.kfgodel.primitons.identity;

import ar.com.kfgodel.nary.api.optionals.Optional;
import ar.com.kfgodel.primitons.PrimitonTestContext;
import ar.com.kfgodel.primitons.api.Primiton;
import info.kfgodel.jspek.api.JavaSpec;
import info.kfgodel.jspek.api.JavaSpecRunner;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * This type verifies the identity function existence for all the primitive types
 */
@RunWith(JavaSpecRunner.class)
public class IdentityTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("primiton", () -> {
      Primiton.types().allTypes()
        .forEach(primitiveType -> {
          it("has an identity function for " + primitiveType.getSimpleName()  ,()->{
            Optional converter = Primiton.converterFrom(primitiveType, primitiveType);
            assertThat(converter.isPresent()).isTrue();
          });
        });
    });

  }
}