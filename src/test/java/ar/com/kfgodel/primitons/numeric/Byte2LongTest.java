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
public class Byte2LongTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a byte to long primiton", () -> {
      context().byte2long(()-> Byteton::toLong);

      describe("when used", () -> {
        context().longOutput(()-> context().byte2long().apply(context().byteInput()));

        it("converts a primitive byte into a primitive long",()->{
          context().byteInput(()-> (byte)31);
          assertThat(context().longOutput()).isEqualTo(31L);
        });

        it("converts the maximum byte into an long value",()->{
          context().byteInput(()-> Byte.MAX_VALUE);
          assertThat(context().longOutput()).isEqualTo(127L);
        });

        it("converts the minimum byte into an long",()->{
          context().byteInput(()-> Byte.MIN_VALUE);
          assertThat(context().longOutput()).isEqualTo(-128L);
        });

      });

    });

  }
}