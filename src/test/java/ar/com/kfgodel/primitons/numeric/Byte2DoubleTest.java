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
public class Byte2DoubleTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a byte to double primiton", () -> {
      context().byte2double(()-> Byteton::toDouble);

      describe("when used", () -> {
        context().doubleOutput(()-> context().byte2double().apply(context().byteInput()));

        it("converts a primitive byte into a primitive double",()->{
          context().byteInput(()-> (byte)73);
          assertThat(context().doubleOutput()).isEqualTo(73d);
        });

        it("converts the maximum byte into an double value",()->{
          context().byteInput(()-> Byte.MAX_VALUE);
          assertThat(context().doubleOutput()).isEqualTo(127d);
        });

        it("converts the minimum byte into an double",()->{
          context().byteInput(()-> Byte.MIN_VALUE);
          assertThat(context().doubleOutput()).isEqualTo(-128d);
        });

      });

    });

  }
}