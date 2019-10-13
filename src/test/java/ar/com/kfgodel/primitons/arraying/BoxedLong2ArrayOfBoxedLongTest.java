package ar.com.kfgodel.primitons.arraying;

import ar.com.kfgodel.primitons.PrimitonTestContext;
import ar.com.kfgodel.primitons.api.boxed.BoxedLongton;
import info.kfgodel.jspek.api.JavaSpec;
import info.kfgodel.jspek.api.JavaSpecRunner;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Verifies the basic conversions for basic to array conversion
 * Created by kfgodel on 30/12/17.
 */
@RunWith(JavaSpecRunner.class)
public class BoxedLong2ArrayOfBoxedLongTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a long to array of long primiton", () -> {
      context().boxedLong2ArrayOfBoxedLong(()-> BoxedLongton::toArray);

      describe("when used", () -> {
        context().boxedLongArrayOutput(()-> context().boxedLong2ArrayOfBoxedLong().apply(context().longInput()));

        it("converts the given long into an array containing that long",()->{
          context().longInput(()-> 123L);
          assertThat(context().boxedLongArrayOutput()).isEqualTo(new Long[]{123L});
        });

      });

    });

  }
}