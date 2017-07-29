package ar.com.kfgodel.primitons.identity;

import ar.com.dgarcia.javaspec.api.JavaSpec;
import ar.com.dgarcia.javaspec.api.JavaSpecRunner;
import ar.com.kfgodel.primitons.PrimitonTestContext;
import ar.com.kfgodel.primitons.api.basic.Booleanton;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Verifies the identity function for primitive type
 * Created by kfgodel on 23/07/17.
 */
@RunWith(JavaSpecRunner.class)
public class PrimitiveBoolean2PrimitiveBooleanTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a boolean to boolean primiton", () -> {
      context().boolean2boolean(()-> Booleanton::identity);

      describe("when used", () -> {
        context().booleanOutput(()-> context().boolean2boolean().apply(context().booleanInput()));

        it("returns true when it's given",()->{
          context().booleanInput(()-> true);
          assertThat(context().booleanOutput()).isEqualTo(true);
        });

        it("returns false when it's given",()->{
          context().booleanInput(()-> false);
          assertThat(context().booleanOutput()).isEqualTo(false);
        });

      });
    });
  }
}