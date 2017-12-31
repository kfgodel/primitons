package ar.com.kfgodel.primitons.arraying;

import ar.com.dgarcia.javaspec.api.JavaSpec;
import ar.com.dgarcia.javaspec.api.JavaSpecRunner;
import ar.com.kfgodel.primitons.PrimitonTestContext;
import ar.com.kfgodel.primitons.api.boxed.BoxedShorton;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Verifies the basic conversions for basic to array conversion
 * Created by kfgodel on 30/12/17.
 */
@RunWith(JavaSpecRunner.class)
public class BoxedShort2ArrayOfBoxedShortTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a short to array of short primiton", () -> {
      context().boxedShort2ArrayOfBoxedShort(()-> BoxedShorton::toArray);

      describe("when used", () -> {
        context().boxedShortArrayOutput(()-> context().boxedShort2ArrayOfBoxedShort().apply(context().shortInput()));

        it("converts the given short into an array containing that short",()->{
          context().shortInput(()-> (short)25);
          assertThat(context().boxedShortArrayOutput()).isEqualTo(new Short[]{25});
        });

      });

    });

  }
}