package ar.com.kfgodel.primitons.numeric.boxing;

import ar.com.dgarcia.javaspec.api.JavaSpec;
import ar.com.dgarcia.javaspec.api.JavaSpecRunner;
import ar.com.kfgodel.primitons.PrimitonTestContext;
import ar.com.kfgodel.primitons.api.basic.Shorton;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * This type verifies the behavior of a numeric conversion
 * Date: 01/08/17 - 20:22
 */
@RunWith(JavaSpecRunner.class)
public class Short2BoxedFloatTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a short to Float primiton", () -> {
      context().short2BoxedFloat(()-> Shorton::toBoxedFloat);

      describe("when used", () -> {
        context().floatOutput(()-> context().short2BoxedFloat().apply(context().shortInput()));

        it("converts a primitive short into a Float",()->{
          context().shortInput(()-> (short)32);
          assertThat(context().floatOutput()).isEqualTo(Float.valueOf(32f));
        });

        it("converts the maximum short into an float value",()->{
          context().shortInput(()-> Short.MAX_VALUE);
          assertThat(context().floatOutput()).isEqualTo(Float.valueOf(32767f));
        });

        it("converts the minimum short into an float",()->{
          context().shortInput(()-> Short.MIN_VALUE);
          assertThat(context().floatOutput()).isEqualTo(Float.valueOf(-32768f));
        });

      });

    });

  }
}