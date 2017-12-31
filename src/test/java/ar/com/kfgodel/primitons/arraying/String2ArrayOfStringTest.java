package ar.com.kfgodel.primitons.arraying;

import ar.com.dgarcia.javaspec.api.JavaSpec;
import ar.com.dgarcia.javaspec.api.JavaSpecRunner;
import ar.com.kfgodel.primitons.PrimitonTestContext;
import ar.com.kfgodel.primitons.api.basic.Strington;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Verifies the basic conversions for basic to array conversion
 * Created by kfgodel on 30/12/17.
 */
@RunWith(JavaSpecRunner.class)
public class String2ArrayOfStringTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a string to array of string primiton", () -> {
      context().string2ArrayOfString(()-> Strington::toArray);

      describe("when used", () -> {
        context().stringArrayOutput(()-> context().string2ArrayOfString().apply(context().stringInput()));

        it("converts the given string into an array containing that string",()->{
          context().stringInput(()-> "asda");
          assertThat(context().stringArrayOutput()).isEqualTo(new String[]{"asda"});
        });

      });

    });

  }
}