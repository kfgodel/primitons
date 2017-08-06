package ar.com.kfgodel.primitons.numeric.numbers;

import ar.com.dgarcia.javaspec.api.JavaSpec;
import ar.com.dgarcia.javaspec.api.JavaSpecRunner;
import ar.com.kfgodel.primitons.PrimitonTestContext;
import ar.com.kfgodel.primitons.api.boxed.BoxedIntegerton;
import ar.com.kfgodel.primitons.api.exceptions.UnmappableException;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * This type verifies the behavior of a numeric conversion
 * Date: 01/08/17 - 20:22
 */
@RunWith(JavaSpecRunner.class)
public class BoxedInteger2ByteTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a Integer to byte primiton", () -> {
      context().boxedInteger2Byte(()-> BoxedIntegerton::toByte);

      describe("when used", () -> {
        context().byteOutput(()-> context().boxedInteger2Byte().apply(context().intInput()));

        it("converts a Integer into a primitive byte",()->{
          context().intInput(()-> Integer.valueOf(3));
          assertThat(context().byteOutput()).isEqualTo((byte)3);
        });

        it("converts the maximum Byte into a byte value without truncation",()->{
          context().intInput(()-> Integer.valueOf(127));
          assertThat(context().byteOutput()).isEqualTo(Byte.MAX_VALUE);
        });

        it("converts the minimum Byte into a byte value without truncation",()->{
          context().intInput(()-> Integer.valueOf(-128));
          assertThat(context().byteOutput()).isEqualTo(Byte.MIN_VALUE);
        });

        it("converts any value bigger than maximum Byte into a byte value with truncation",()->{
          context().intInput(()-> Integer.valueOf(Integer.MAX_VALUE));
          assertThat(context().byteOutput()).isEqualTo((byte)-1);
        });

        it("converts any value smaller than minimum Byte into a byte value with truncation",()->{
          context().intInput(()-> Integer.valueOf(Integer.MIN_VALUE));
          assertThat(context().byteOutput()).isEqualTo((byte)0);
        });

        itThrows(UnmappableException.class, "if value is null",()->{
          context().boxedInteger2Byte().apply(null);
        }, e ->{
          assertThat(e).hasMessage("Value[null] is not convertible to type [byte]");
        });

      });

    });

  }
}