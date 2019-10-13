package ar.com.kfgodel.primitons.numeric.boxing;

import ar.com.kfgodel.primitons.PrimitonTestContext;
import ar.com.kfgodel.primitons.api.basic.Byteton;
import info.kfgodel.jspek.api.JavaSpec;
import info.kfgodel.jspek.api.JavaSpecRunner;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * This type verifies the behavior of a numeric conversion
 * Date: 01/08/17 - 20:22
 */
@RunWith(JavaSpecRunner.class)
public class Byte2BoxedFloatTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a byte to Float primiton", () -> {
      context().byte2BoxedFloat(()-> Byteton::toBoxedFloat);

      describe("when used", () -> {
        context().floatOutput(()-> context().byte2BoxedFloat().apply(context().byteInput()));

        it("converts a primitive byte into a primitive float",()->{
          context().byteInput(()-> (byte)10);
          assertThat(context().floatOutput()).isEqualTo(Float.valueOf(10f));
        });

        it("converts the maximum byte into an float value",()->{
          context().byteInput(()-> Byte.MAX_VALUE);
          assertThat(context().floatOutput()).isEqualTo(Float.valueOf(127f));
        });

        it("converts the minimum byte into an float",()->{
          context().byteInput(()-> Byte.MIN_VALUE);
          assertThat(context().floatOutput()).isEqualTo(Float.valueOf(-128f));
        });

      });

    });

  }
}