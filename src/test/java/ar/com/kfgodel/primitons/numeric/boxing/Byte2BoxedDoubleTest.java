package ar.com.kfgodel.primitons.numeric.boxing;

import ar.com.kfgodel.primitons.PrimitonTestContext;
import ar.com.kfgodel.primitons.api.basic.Byteton;
import info.kfgodel.jspek.api.JavaSpec;
import info.kfgodel.jspek.api.JavaSpecRunner;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Date: 06/08/17 - 16:43
 */
@RunWith(JavaSpecRunner.class)
public class Byte2BoxedDoubleTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a byte to Double primiton", () -> {
      context().byte2BoxedDouble(()-> Byteton::toBoxedDouble);

      describe("when used", () -> {
        context().doubleOutput(()-> context().byte2BoxedDouble().apply(context().byteInput()));

        it("converts a primitive byte into a primitive double",()->{
          context().byteInput(()-> (byte)73);
          assertThat(context().doubleOutput()).isEqualTo(Double.valueOf(73d));
        });

        it("converts the maximum byte into an double value",()->{
          context().byteInput(()-> Byte.MAX_VALUE);
          assertThat(context().doubleOutput()).isEqualTo(Double.valueOf(127d));
        });

        it("converts the minimum byte into an double",()->{
          context().byteInput(()-> Byte.MIN_VALUE);
          assertThat(context().doubleOutput()).isEqualTo(Double.valueOf(-128d));
        });

      });

    });

  }
}