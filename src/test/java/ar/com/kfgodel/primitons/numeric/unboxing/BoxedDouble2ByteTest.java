package ar.com.kfgodel.primitons.numeric.unboxing;

import ar.com.kfgodel.primitons.PrimitonTestContext;
import ar.com.kfgodel.primitons.api.boxed.BoxedDoubleton;
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
public class BoxedDouble2ByteTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a Double to byte primiton", () -> {
      context().boxedDouble2Byte(()-> BoxedDoubleton::toByte);

      describe("when used", () -> {
        context().byteOutput(()-> context().boxedDouble2Byte().apply(context().doubleInput()));

        it("converts a Double into a primitive byte",()->{
          context().doubleInput(()-> Double.valueOf(1.5d));
          assertThat(context().byteOutput()).isEqualTo((byte)1);
        });

        it("converts the maximum Byte into a byte value without truncation",()->{
          context().doubleInput(()-> Double.valueOf(127d));
          assertThat(context().byteOutput()).isEqualTo(Byte.MAX_VALUE);
        });

        it("converts the minimum Byte into a byte value without truncation",()->{
          context().doubleInput(()-> Double.valueOf(-128d));
          assertThat(context().byteOutput()).isEqualTo(Byte.MIN_VALUE);
        });

        it("converts any value bigger than maximum Byte into a byte value with precision loss",()->{
          context().doubleInput(()-> Double.MAX_VALUE);
          assertThat(context().byteOutput()).isEqualTo((byte)-1);
        });

        it("converts any value smaller than minimum Byte into a byte value with precision loss",()->{
          context().doubleInput(()-> Double.MIN_VALUE);
          assertThat(context().byteOutput()).isEqualTo((byte)0);
        });

        itThrows(UnmappableException.class, "if value is null",()->{
          context().boxedDouble2Byte().apply(null);
        }, e ->{
          assertThat(e).hasMessage("Value[null] is not convertible to type [byte]");
        });

      });

    });

  }
}