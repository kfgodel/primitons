package ar.com.kfgodel.primitons.numeric.interboxing;

import ar.com.dgarcia.javaspec.api.JavaSpec;
import ar.com.dgarcia.javaspec.api.JavaSpecRunner;
import ar.com.kfgodel.primitons.PrimitonTestContext;
import ar.com.kfgodel.primitons.api.boxed.BoxedByteton;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * This type verifies the behavior of a numeric conversion
 * Date: 01/08/17 - 20:22
 */
@RunWith(JavaSpecRunner.class)
public class BoxedByte2BoxedLongTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a Byte to Long primiton", () -> {
      context().boxedByte2BoxedLong(()-> BoxedByteton::toBoxedLong);

      describe("when used", () -> {
        context().longOutput(()-> context().boxedByte2BoxedLong().apply(context().byteInput()));

        it("converts a Byte into a IntegerLong",()->{
          context().byteInput(()-> Byte.valueOf((byte)31));
          assertThat(context().longOutput()).isEqualTo(Long.valueOf(31L));
        });

        it("converts the maximum byte into an long value",()->{
          context().byteInput(()-> Byte.valueOf(Byte.MAX_VALUE));
          assertThat(context().longOutput()).isEqualTo(Long.valueOf(127L));
        });

        it("converts the minimum byte into an long",()->{
          context().byteInput(()-> Byte.valueOf(Byte.MIN_VALUE));
          assertThat(context().longOutput()).isEqualTo(Long.valueOf(-128L));
        });

        it("converts null to null",()->{
          assertThat(context().boxedByte2BoxedLong().apply(null)).isNull();
        });

      });

    });

  }
}