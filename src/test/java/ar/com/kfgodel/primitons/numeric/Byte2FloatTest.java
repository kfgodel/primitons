package ar.com.kfgodel.primitons.numeric;

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
public class Byte2FloatTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a byte to float primiton", () -> {
      context().byte2float(()-> Byteton::toFloat);

      describe("when used", () -> {
        context().floatOutput(()-> context().byte2float().apply(context().byteInput()));

        it("converts a primitive byte into a primitive float",()->{
          context().byteInput(()-> (byte)10);
          assertThat(context().floatOutput()).isEqualTo(10f);
        });

        it("converts the maximum byte into an float value",()->{
          context().byteInput(()-> Byte.MAX_VALUE);
          assertThat(context().floatOutput()).isEqualTo(127f);
        });

        it("converts the minimum byte into an float",()->{
          context().byteInput(()-> Byte.MIN_VALUE);
          assertThat(context().floatOutput()).isEqualTo(-128f);
        });

      });

    });

  }
}