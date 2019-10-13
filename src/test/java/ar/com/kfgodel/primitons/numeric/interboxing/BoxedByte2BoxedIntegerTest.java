package ar.com.kfgodel.primitons.numeric.interboxing;

import ar.com.kfgodel.primitons.PrimitonTestContext;
import ar.com.kfgodel.primitons.api.boxed.BoxedByteton;
import info.kfgodel.jspek.api.JavaSpec;
import info.kfgodel.jspek.api.JavaSpecRunner;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * This type verifies the behavior of a numeric conversion
 * Date: 01/08/17 - 20:22
 */
@RunWith(JavaSpecRunner.class)
public class BoxedByte2BoxedIntegerTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a Byte to Integer primiton", () -> {
      context().boxedByte2BoxedInteger(()-> BoxedByteton::toBoxedInteger);

      describe("when used", () -> {
        context().intOutput(()-> context().boxedByte2BoxedInteger().apply(context().byteInput()));

        it("converts a Byte into a Integer",()->{
          context().byteInput(()-> Byte.valueOf((byte)9));
          assertThat(context().intOutput()).isEqualTo(Integer.valueOf(9));
        });

        it("converts the maximum byte into an int value",()->{
          context().byteInput(()-> Byte.valueOf(Byte.MAX_VALUE));
          assertThat(context().intOutput()).isEqualTo(Integer.valueOf(127));
        });

        it("converts the minimum byte into an int",()->{
          context().byteInput(()-> Byte.valueOf(Byte.MIN_VALUE));
          assertThat(context().intOutput()).isEqualTo(Integer.valueOf(-128));
        });

        it("converts null to null",()->{
          assertThat(context().boxedByte2BoxedInteger().apply(null)).isNull();
        });

      });

    });

  }
}