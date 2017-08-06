package ar.com.kfgodel.primitons.numeric.unboxing;

import ar.com.dgarcia.javaspec.api.JavaSpec;
import ar.com.dgarcia.javaspec.api.JavaSpecRunner;
import ar.com.kfgodel.primitons.PrimitonTestContext;
import ar.com.kfgodel.primitons.api.boxed.BoxedByteton;
import ar.com.kfgodel.primitons.api.exceptions.UnmappableException;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * This type verifies the behavior of a numeric conversion
 * Date: 01/08/17 - 20:22
 */
@RunWith(JavaSpecRunner.class)
public class BoxedByte2DoubleTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a Byte to double primiton", () -> {
      context().boxedByte2Double(()-> BoxedByteton::toDouble);

      describe("when used", () -> {
        context().doubleOutput(()-> context().boxedByte2Double().apply(context().byteInput()));

        it("converts a Byte into a primitive double",()->{
          context().byteInput(()-> Byte.valueOf((byte)73));
          assertThat(context().doubleOutput()).isEqualTo(73d);
        });

        it("converts the maximum Byte into a double value",()->{
          context().byteInput(()-> Byte.valueOf(Byte.MAX_VALUE));
          assertThat(context().doubleOutput()).isEqualTo(127d);
        });

        it("converts the minimum Byte into a double",()->{
          context().byteInput(()-> Byte.valueOf(Byte.MIN_VALUE));
          assertThat(context().doubleOutput()).isEqualTo(-128d);
        });

        itThrows(UnmappableException.class, "if value is null",()->{
          context().boxedByte2Double().apply(null);
        }, e ->{
          assertThat(e).hasMessage("Value[null] is not convertible to type [double]");
        });

      });

    });

  }
}