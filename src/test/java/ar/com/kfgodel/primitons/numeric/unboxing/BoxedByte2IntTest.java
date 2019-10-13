package ar.com.kfgodel.primitons.numeric.unboxing;

import ar.com.kfgodel.primitons.PrimitonTestContext;
import ar.com.kfgodel.primitons.api.boxed.BoxedByteton;
import ar.com.kfgodel.primitons.api.exceptions.UnmappableException;
import info.kfgodel.jspek.api.JavaSpec;
import info.kfgodel.jspek.api.JavaSpecRunner;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * This type verifies the behavior of a numeric conversion
 * Date: 01/08/17 - 20:22
 */
@RunWith(JavaSpecRunner.class)
public class BoxedByte2IntTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a Byte to int primiton", () -> {
      context().boxedByte2Int(()-> BoxedByteton::toInt);

      describe("when used", () -> {
        context().intOutput(()-> context().boxedByte2Int().apply(context().byteInput()));

        it("converts a Byte into a primitive int",()->{
          context().byteInput(()-> Byte.valueOf((byte)76));
          assertThat(context().intOutput()).isEqualTo(76);
        });

        it("converts the maximum Byte into a int value",()->{
          context().byteInput(()-> Byte.valueOf(Byte.MAX_VALUE));
          assertThat(context().intOutput()).isEqualTo(127);
        });

        it("converts the minimum Byte into a int",()->{
          context().byteInput(()-> Byte.valueOf(Byte.MIN_VALUE));
          assertThat(context().intOutput()).isEqualTo(-128);
        });

        itThrows(UnmappableException.class, "if value is null",()->{
          context().boxedByte2Int().apply(null);
        }, e ->{
          assertThat(e).hasMessage("Value[null] is not convertible to type [int]");
        });

      });

    });

  }
}