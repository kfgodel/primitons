package ar.com.kfgodel.primitons.numeric.unboxing;

import ar.com.kfgodel.primitons.PrimitonTestContext;
import ar.com.kfgodel.primitons.api.boxed.BoxedShorton;
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
public class BoxedShort2ByteTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a Short to byte primiton", () -> {
      context().boxedShort2Byte(()-> BoxedShorton::toByte);

      describe("when used", () -> {
        context().byteOutput(()-> context().boxedShort2Byte().apply(context().shortInput()));

        it("converts a Short into a primitive byte",()->{
          context().shortInput(()-> Short.valueOf((short)-2));
          assertThat(context().byteOutput()).isEqualTo((byte)-2);
        });

        it("converts the maximum Byte into a byte value without truncation",()->{
          context().shortInput(()-> Short.valueOf((short)127));
          assertThat(context().byteOutput()).isEqualTo(Byte.MAX_VALUE);
        });

        it("converts the minimum Byte into a byte value without truncation",()->{
          context().shortInput(()-> Short.valueOf((short)-128));
          assertThat(context().byteOutput()).isEqualTo(Byte.MIN_VALUE);
        });

        it("converts any value bigger than maximum Byte into a byte value with truncation",()->{
          context().shortInput(()-> Short.valueOf(Short.MAX_VALUE));
          assertThat(context().byteOutput()).isEqualTo((byte)-1);
        });

        it("converts any value smaller than minimum Byte into a byte value with truncation",()->{
          context().shortInput(()-> Short.valueOf(Short.MIN_VALUE));
          assertThat(context().byteOutput()).isEqualTo((byte)0);
        });

        itThrows(UnmappableException.class, "if value is null",()->{
          context().boxedShort2Byte().apply(null);
        }, e ->{
          assertThat(e).hasMessage("Value[null] is not convertible to type [byte]");
        });

      });

    });

  }
}