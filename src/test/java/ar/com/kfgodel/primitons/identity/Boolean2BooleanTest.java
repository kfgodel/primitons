package ar.com.kfgodel.primitons.identity;

import ar.com.kfgodel.primitons.PrimitonTestContext;
import ar.com.kfgodel.primitons.api.basic.Booleanton;
import info.kfgodel.jspek.api.JavaSpec;
import info.kfgodel.jspek.api.JavaSpecRunner;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Verifies the identity function for primitive type
 * Created by kfgodel on 23/07/17.
 */
@RunWith(JavaSpecRunner.class)
public class Boolean2BooleanTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a boolean to boolean primiton", () -> {
      context().boolean2boolean(()-> Booleanton::identity);

      describe("when used", () -> {
        context().booleanOutput(()-> context().boolean2boolean().apply(context().booleanInput()));

        it("returns true when true is passed",()->{
          context().booleanInput(()-> true);
          assertThat(context().booleanOutput()).isEqualTo(true);
        });

        it("returns false when false is passed",()->{
          context().booleanInput(()-> false);
          assertThat(context().booleanOutput()).isEqualTo(false);
        });

      });
    });
  }
}