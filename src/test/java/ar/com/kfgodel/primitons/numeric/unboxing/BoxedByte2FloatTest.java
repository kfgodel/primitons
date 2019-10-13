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
public class BoxedByte2FloatTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a Byte to float primiton", () -> {
      context().boxedByte2Float(()-> BoxedByteton::toFloat);

      describe("when used", () -> {
        context().floatOutput(()-> context().boxedByte2Float().apply(context().byteInput()));

        it("converts a Byte into a primitive float",()->{
          context().byteInput(()-> Byte.valueOf((byte)89));
          assertThat(context().floatOutput()).isEqualTo(89f);
        });

        it("converts the maximum Byte into a float value",()->{
          context().byteInput(()-> Byte.valueOf(Byte.MAX_VALUE));
          assertThat(context().floatOutput()).isEqualTo(127f);
        });

        it("converts the minimum Byte into a float",()->{
          context().byteInput(()-> Byte.valueOf(Byte.MIN_VALUE));
          assertThat(context().floatOutput()).isEqualTo(-128f);
        });

        itThrows(UnmappableException.class, "if value is null",()->{
          context().boxedByte2Float().apply(null);
        }, e ->{
          assertThat(e).hasMessage("Value[null] is not convertible to type [float]");
        });

      });

    });

  }
}