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
public class BoxedByte2BoxedFloatTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a Byte to Float primiton", () -> {
      context().boxedByte2BoxedFloat(()-> BoxedByteton::toBoxedFloat);

      describe("when used", () -> {
        context().floatOutput(()-> context().boxedByte2BoxedFloat().apply(context().byteInput()));

        it("converts a Byte into a Float",()->{
          context().byteInput(()-> Byte.valueOf((byte)10));
          assertThat(context().floatOutput()).isEqualTo(Float.valueOf(10f));
        });

        it("converts the maximum byte into an float value",()->{
          context().byteInput(()-> Byte.valueOf(Byte.MAX_VALUE));
          assertThat(context().floatOutput()).isEqualTo(Float.valueOf(127f));
        });

        it("converts the minimum byte into an float",()->{
          context().byteInput(()-> Byte.valueOf(Byte.MIN_VALUE));
          assertThat(context().floatOutput()).isEqualTo(Float.valueOf(-128f));
        });

        it("converts null to null",()->{
          assertThat(context().boxedByte2BoxedFloat().apply(null)).isNull();
        });

      });

    });

  }
}