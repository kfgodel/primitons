package ar.com.kfgodel.primitons.numeric.numbers;

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
public class BoxedByte2ShortTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a Byte to short primiton", () -> {
      context().boxedByte2Short(()-> BoxedByteton::toShort);

      describe("when used", () -> {
        context().shortOutput(()-> context().boxedByte2Short().apply(context().byteInput()));

        it("converts a Byte into a primitive short",()->{
          context().byteInput(()-> Byte.valueOf((byte)81));
          assertThat(context().shortOutput()).isEqualTo((short)81);
        });

        it("converts the maximum Byte into a short value",()->{
          context().byteInput(()-> Byte.valueOf(Byte.MAX_VALUE));
          assertThat(context().shortOutput()).isEqualTo((short)127);
        });

        it("converts the minimum Byte into a short",()->{
          context().byteInput(()-> Byte.valueOf(Byte.MIN_VALUE));
          assertThat(context().shortOutput()).isEqualTo((short)-128);
        });

        itThrows(UnmappableException.class, "if value is null",()->{
          context().boxedByte2Short().apply(null);
        }, e ->{
          assertThat(e).hasMessage("Value[null] is not convertible to type [short]");
        });

      });

    });

  }
}