package ar.com.kfgodel.primitons.arraying;

import ar.com.dgarcia.javaspec.api.JavaSpec;
import ar.com.dgarcia.javaspec.api.JavaSpecRunner;
import ar.com.kfgodel.primitons.PrimitonTestContext;
import ar.com.kfgodel.primitons.api.boxed.BoxedDoubleton;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Verifies the basic conversions for basic to array conversion
 * Created by kfgodel on 30/12/17.
 */
@RunWith(JavaSpecRunner.class)
public class BoxedDouble2ArrayOfBoxedDoubleTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a double to array of double primiton", () -> {
      context().boxedDouble2ArrayOfBoxedDouble(()-> BoxedDoubleton::toArray);

      describe("when used", () -> {
        context().boxedDoubleArrayOutput(()-> context().boxedDouble2ArrayOfBoxedDouble().apply(context().doubleInput()));

        it("converts the given double into an array containing that double",()->{
          context().doubleInput(()-> 123.0);
          assertThat(context().boxedDoubleArrayOutput()).isEqualTo(new Double[]{123.0});
        });

      });

    });

  }
}