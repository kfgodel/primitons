package ar.com.kfgodel.primitons.arraying;

import ar.com.kfgodel.primitons.PrimitonTestContext;
import ar.com.kfgodel.primitons.api.boxed.BoxedFloaton;
import info.kfgodel.jspek.api.JavaSpec;
import info.kfgodel.jspek.api.JavaSpecRunner;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Verifies the basic conversions for basic to array conversion
 * Created by kfgodel on 30/12/17.
 */
@RunWith(JavaSpecRunner.class)
public class BoxedFloat2ArrayOfBoxedFloatTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a float to array of float primiton", () -> {
      context().boxedFloat2ArrayOfBoxedFloat(()-> BoxedFloaton::toArray);

      describe("when used", () -> {
        context().boxedFloatArrayOutput(()-> context().boxedFloat2ArrayOfBoxedFloat().apply(context().floatInput()));

        it("converts the given float into an array containing that float",()->{
          context().floatInput(()-> 123f);
          assertThat(context().boxedFloatArrayOutput()).isEqualTo(new Float[]{123f});
        });

      });

    });

  }
}