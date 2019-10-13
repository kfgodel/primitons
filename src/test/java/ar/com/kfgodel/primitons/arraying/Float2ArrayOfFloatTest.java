package ar.com.kfgodel.primitons.arraying;

import ar.com.kfgodel.primitons.PrimitonTestContext;
import ar.com.kfgodel.primitons.api.basic.Floaton;
import info.kfgodel.jspek.api.JavaSpec;
import info.kfgodel.jspek.api.JavaSpecRunner;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Verifies the basic conversions for basic to array conversion
 * Created by kfgodel on 30/12/17.
 */
@RunWith(JavaSpecRunner.class)
public class Float2ArrayOfFloatTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a float to array of float primiton", () -> {
      context().float2ArrayOfFloat(()-> Floaton::toArray);

      describe("when used", () -> {
        context().floatArrayOutput(()-> context().float2ArrayOfFloat().apply(context().floatInput()));

        it("converts the given value into an array containing that value",()->{
          context().floatInput(()-> 1.0f);
          assertThat(context().floatArrayOutput()).isEqualTo(new float[]{1.0f});
        });

      });

    });

  }
}