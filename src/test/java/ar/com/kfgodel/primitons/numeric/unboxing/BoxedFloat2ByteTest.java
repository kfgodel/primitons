package ar.com.kfgodel.primitons.numeric.unboxing;

import ar.com.dgarcia.javaspec.api.JavaSpec;
import ar.com.dgarcia.javaspec.api.JavaSpecRunner;
import ar.com.kfgodel.primitons.PrimitonTestContext;
import ar.com.kfgodel.primitons.api.boxed.BoxedFloaton;
import ar.com.kfgodel.primitons.api.exceptions.UnmappableException;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * This type verifies the behavior of a numeric conversion
 * Date: 01/08/17 - 20:22
 */
@RunWith(JavaSpecRunner.class)
public class BoxedFloat2ByteTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a Float to byte primiton", () -> {
      context().boxedFloat2Byte(()-> BoxedFloaton::toByte);

      describe("when used", () -> {
        context().byteOutput(()-> context().boxedFloat2Byte().apply(context().floatInput()));

        it("converts a Float into a primitive byte",()->{
          context().floatInput(()-> Float.valueOf(7.5f));
          assertThat(context().byteOutput()).isEqualTo((byte)7);
        });

        it("converts the maximum Byte into a byte value without truncation",()->{
          context().floatInput(()-> Float.valueOf(127f));
          assertThat(context().byteOutput()).isEqualTo(Byte.MAX_VALUE);
        });

        it("converts the minimum Byte into a byte value without truncation",()->{
          context().floatInput(()-> Float.valueOf(-128f));
          assertThat(context().byteOutput()).isEqualTo(Byte.MIN_VALUE);
        });

        it("converts any value bigger than maximum Byte into a byte value with precision loss",()->{
          context().floatInput(()-> Float.MAX_VALUE);
          assertThat(context().byteOutput()).isEqualTo((byte)-1);
        });

        it("converts any value smaller than minimum Byte into a byte value with precision loss",()->{
          context().floatInput(()-> Float.MIN_VALUE);
          assertThat(context().byteOutput()).isEqualTo((byte)0);
        });

        itThrows(UnmappableException.class, "if value is null",()->{
          context().boxedFloat2Byte().apply(null);
        }, e ->{
          assertThat(e).hasMessage("Value[null] is not convertible to type [byte]");
        });

      });

    });

  }
}