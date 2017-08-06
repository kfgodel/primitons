package ar.com.kfgodel.primitons.numbers;

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
public class BoxedByte2LongTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a Byte to long primiton", () -> {
      context().boxedByte2Long(()-> BoxedByteton::toLong);

      describe("when used", () -> {
        context().longOutput(()-> context().boxedByte2Long().apply(context().byteInput()));

        it("converts a Byte into a primitive long",()->{
          context().byteInput(()-> Byte.valueOf((byte)95));
          assertThat(context().longOutput()).isEqualTo(95L);
        });

        it("converts the maximum Byte into a long value",()->{
          context().byteInput(()-> Byte.valueOf(Byte.MAX_VALUE));
          assertThat(context().longOutput()).isEqualTo(127L);
        });

        it("converts the minimum Byte into a long",()->{
          context().byteInput(()-> Byte.valueOf(Byte.MIN_VALUE));
          assertThat(context().longOutput()).isEqualTo(-128L);
        });

        itThrows(UnmappableException.class, "if value is null",()->{
          context().boxedByte2Long().apply(null);
        }, e ->{
          assertThat(e).hasMessage("Value[null] is not convertible to type [long]");
        });

      });

    });

  }
}