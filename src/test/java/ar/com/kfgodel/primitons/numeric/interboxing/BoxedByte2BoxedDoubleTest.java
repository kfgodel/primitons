package ar.com.kfgodel.primitons.numeric.interboxing;

import ar.com.kfgodel.primitons.PrimitonTestContext;
import ar.com.kfgodel.primitons.api.boxed.BoxedByteton;
import info.kfgodel.jspek.api.JavaSpec;
import info.kfgodel.jspek.api.JavaSpecRunner;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Date: 06/08/17 - 16:43
 */
@RunWith(JavaSpecRunner.class)
public class BoxedByte2BoxedDoubleTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a Byte to Double primiton", () -> {
      context().boxedByte2BoxedDouble(()-> BoxedByteton::toBoxedDouble);

      describe("when used", () -> {
        context().doubleOutput(()-> context().boxedByte2BoxedDouble().apply(context().byteInput()));

        it("converts a Byte into a Double",()->{
          context().byteInput(()-> Byte.valueOf((byte)73));
          assertThat(context().doubleOutput()).isEqualTo(Double.valueOf(73d));
        });

        it("converts the maximum byte into an double value",()->{
          context().byteInput(()-> Byte.valueOf(Byte.MAX_VALUE));
          assertThat(context().doubleOutput()).isEqualTo(Double.valueOf(127d));
        });

        it("converts the minimum byte into an double",()->{
          context().byteInput(()-> Byte.valueOf(Byte.MIN_VALUE));
          assertThat(context().doubleOutput()).isEqualTo(Double.valueOf(-128d));
        });

        it("converts null to null",()->{
          assertThat(context().boxedByte2BoxedDouble().apply(null)).isNull();
        });   
      });

    });

  }
}