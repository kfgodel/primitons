package ar.com.kfgodel.primitons.arraying;

import ar.com.kfgodel.primitons.PrimitonTestContext;
import ar.com.kfgodel.primitons.api.boxed.BoxedIntegerton;
import info.kfgodel.jspek.api.JavaSpec;
import info.kfgodel.jspek.api.JavaSpecRunner;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Verifies the basic conversions for basic to array conversion
 * Created by kfgodel on 30/12/17.
 */
@RunWith(JavaSpecRunner.class)
public class BoxedInteger2ArrayOfBoxedIntegerTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a integer to array of integer primiton", () -> {
      context().boxedInteger2ArrayOfBoxedInteger(()-> BoxedIntegerton::toArray);

      describe("when used", () -> {
        context().boxedIntegerArrayOutput(()-> context().boxedInteger2ArrayOfBoxedInteger().apply(context().intInput()));

        it("converts the given integer into an array containing that integer",()->{
          context().intInput(()-> 123);
          assertThat(context().boxedIntegerArrayOutput()).isEqualTo(new Integer[]{123});
        });

      });

    });

  }
}