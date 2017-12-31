package ar.com.kfgodel.primitons.arraying;

import ar.com.dgarcia.javaspec.api.JavaSpec;
import ar.com.dgarcia.javaspec.api.JavaSpecRunner;
import ar.com.kfgodel.primitons.PrimitonTestContext;
import ar.com.kfgodel.primitons.api.basic.Longton;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Verifies the basic conversions for basic to array conversion
 * Created by kfgodel on 30/12/17.
 */
@RunWith(JavaSpecRunner.class)
public class Long2ArrayOfLongTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a long to array of long primiton", () -> {
      context().long2ArrayOfLong(()-> Longton::toArray);

      describe("when used", () -> {
        context().longArrayOutput(()-> context().long2ArrayOfLong().apply(context().longInput()));

        it("converts the given number into an array containing that number",()->{
          context().longInput(()-> 1L);
          assertThat(context().longArrayOutput()).isEqualTo(new long[]{1L});
        });

      });

    });

  }
}