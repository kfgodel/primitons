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
public class BoxedByte2BoxedShortTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a Byte to short primiton", () -> {
      context().boxedByte2BoxedShort(()-> BoxedByteton::toBoxedShort);

      describe("when used", () -> {
        context().shortOutput(()-> context().boxedByte2BoxedShort().apply(context().byteInput()));

        it("converts a Byte into a Short",()->{
          context().byteInput(()-> Byte.valueOf((byte)3));
          assertThat(context().shortOutput()).isEqualTo(Short.valueOf((short)3));
        });

        it("converts the maximum byte into a short value",()->{
          context().byteInput(()-> Byte.valueOf(Byte.MAX_VALUE));
          assertThat(context().shortOutput()).isEqualTo(Short.valueOf((short)127));
        });

        it("converts the minimum byte into a short",()->{
          context().byteInput(()-> Byte.valueOf(Byte.MIN_VALUE));
          assertThat(context().shortOutput()).isEqualTo(Short.valueOf((short)-128));
        });

        it("converts null to null",()->{
          assertThat(context().boxedByte2BoxedShort().apply(null)).isNull();
        });

      });

    });

  }
}