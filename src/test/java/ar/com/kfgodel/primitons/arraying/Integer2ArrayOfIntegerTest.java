package ar.com.kfgodel.primitons.arraying;

import ar.com.dgarcia.javaspec.api.JavaSpec;
import ar.com.dgarcia.javaspec.api.JavaSpecRunner;
import ar.com.kfgodel.primitons.PrimitonTestContext;
import ar.com.kfgodel.primitons.api.boxed.BoxedIntegerton;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Verifies the basic conversions for basic to array conversion
 * Created by kfgodel on 30/12/17.
 */
@RunWith(JavaSpecRunner.class)
public class Integer2ArrayOfIntegerTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a integer to array of integer primiton", () -> {
      context().boxedInteger2ArrayOfBoxedInteger(()-> BoxedIntegerton::toArray);

      describe("when used", () -> {
        context().boxedintegerArrayOutput(()-> context().boxedInteger2ArrayOfBoxedInteger().apply(context().intInput()));

        it("converts the given integer into an array containing that integer",()->{
          context().intInput(()-> 123);
          assertThat(context().boxedintegerArrayOutput()).isEqualTo(new Integer[]{123});
        });

      });

    });

  }
}