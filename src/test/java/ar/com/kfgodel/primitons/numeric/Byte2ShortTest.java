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
public class Byte2ShortTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a byte to short primiton", () -> {
      context().byte2short(()-> Byteton::toShort);

      describe("when used", () -> {
        context().shortOutput(()-> context().byte2short().apply(context().byteInput()));

        it("converts a primitive byte into a primitive short",()->{
          context().byteInput(()-> (byte)3);
          assertThat(context().shortOutput()).isEqualTo((short)3);
        });

        it("converts the maximum byte into a short value",()->{
          context().byteInput(()-> Byte.MAX_VALUE);
          assertThat(context().shortOutput()).isEqualTo((short)127);
        });

        it("converts the minimum byte into a short",()->{
          context().byteInput(()-> Byte.MIN_VALUE);
          assertThat(context().shortOutput()).isEqualTo((short)-128);
        });

      });

    });

  }
}