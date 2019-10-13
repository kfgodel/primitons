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
public class Byte2BoxedIntegerTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a byte to Integer primiton", () -> {
      context().byte2BoxedInteger(()-> Byteton::toBoxedInteger);

      describe("when used", () -> {
        context().intOutput(()-> context().byte2BoxedInteger().apply(context().byteInput()));

        it("converts a primitive byte into a primitive int",()->{
          context().byteInput(()-> (byte)9);
          assertThat(context().intOutput()).isEqualTo(Integer.valueOf(9));
        });

        it("converts the maximum byte into an int value",()->{
          context().byteInput(()-> Byte.MAX_VALUE);
          assertThat(context().intOutput()).isEqualTo(Integer.valueOf(127));
        });

        it("converts the minimum byte into an int",()->{
          context().byteInput(()-> Byte.MIN_VALUE);
          assertThat(context().intOutput()).isEqualTo(Integer.valueOf(-128));
        });

      });

    });

  }
}