package ar.com.kfgodel.primitons.arraying;

import ar.com.kfgodel.primitons.PrimitonTestContext;
import ar.com.kfgodel.primitons.api.basic.Inton;
import info.kfgodel.jspek.api.JavaSpec;
import info.kfgodel.jspek.api.JavaSpecRunner;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Verifies the basic conversions for basic to array conversion
 * Created by kfgodel on 30/12/17.
 */
@RunWith(JavaSpecRunner.class)
public class Int2ArrayOfIntTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a int to array of int primiton", () -> {
      context().int2ArrayOfInteger(()-> Inton::toArray);

      describe("when used", () -> {
        context().intArrayOutput(()-> context().int2ArrayOfInteger().apply(context().intInput()));

        it("converts the given value into an array containing that value",()->{
          context().intInput(()-> 1);
          assertThat(context().intArrayOutput()).isEqualTo(new int[]{1});
        });

      });

    });

  }
}