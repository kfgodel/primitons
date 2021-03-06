package ar.com.kfgodel.primitons.arraying;

import ar.com.kfgodel.primitons.PrimitonTestContext;
import ar.com.kfgodel.primitons.api.basic.Doubleton;
import info.kfgodel.jspek.api.JavaSpec;
import info.kfgodel.jspek.api.JavaSpecRunner;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Verifies the basic conversions for basic to array conversion
 * Created by kfgodel on 30/12/17.
 */
@RunWith(JavaSpecRunner.class)
public class Double2ArrayOfDoubleTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a double to array of double primiton", () -> {
      context().double2ArrayOfDouble(()-> Doubleton::toArray);

      describe("when used", () -> {
        context().doubleArrayOutput(()-> context().double2ArrayOfDouble().apply(context().doubleInput()));

        it("converts the given value into an array containing that value",()->{
          context().doubleInput(()-> 1.0);
          assertThat(context().doubleArrayOutput()).isEqualTo(new double[]{1.0});
        });

      });

    });

  }
}