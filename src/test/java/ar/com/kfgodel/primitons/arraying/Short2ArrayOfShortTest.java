package ar.com.kfgodel.primitons.arraying;

import ar.com.dgarcia.javaspec.api.JavaSpec;
import ar.com.dgarcia.javaspec.api.JavaSpecRunner;
import ar.com.kfgodel.primitons.PrimitonTestContext;
import ar.com.kfgodel.primitons.api.basic.Shorton;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Verifies the basic conversions for basic to array conversion
 * Created by kfgodel on 30/12/17.
 */
@RunWith(JavaSpecRunner.class)
public class Short2ArrayOfShortTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a short to array of short primiton", () -> {
      context().short2ArrayOfShort(()-> Shorton::toArray);

      describe("when used", () -> {
        context().shortArrayOutput(()-> context().short2ArrayOfShort().apply(context().shortInput()));

        it("converts the given number into an array containing that number",()->{
          context().shortInput(()-> (short)1);
          assertThat(context().shortArrayOutput()).isEqualTo(new short[]{1});
        });

      });

    });

  }
}