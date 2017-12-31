package ar.com.kfgodel.primitons.arraying;

import ar.com.dgarcia.javaspec.api.JavaSpec;
import ar.com.dgarcia.javaspec.api.JavaSpecRunner;
import ar.com.kfgodel.primitons.PrimitonTestContext;
import ar.com.kfgodel.primitons.api.basic.Booleanton;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Verifies the basic conversions for basic to array conversion
 * Created by kfgodel on 30/12/2017.
 */
@RunWith(JavaSpecRunner.class)
public class Boolean2ArrayOfBooleanTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a boolean to array of boolean primiton", () -> {
      context().boolean2ArrayOfBoolean(()-> Booleanton::toArray);

      describe("when used", () -> {
        context().booleanArrayOutput(()-> context().boolean2ArrayOfBoolean().apply(context().booleanInput()));

        it("converts true into an array containing true",()->{
          context().booleanInput(()-> true);
          assertThat(context().booleanArrayOutput()).isEqualTo(new boolean[]{true});
        });

        it("converts false into an array containing false",()->{
          context().booleanInput(()-> false);
          assertThat(context().booleanArrayOutput()).isEqualTo(new boolean[]{false});
        });

      });

    });

  }
}