package ar.com.kfgodel.primitons.numeric.interboxing;

import ar.com.kfgodel.primitons.PrimitonTestContext;
import ar.com.kfgodel.primitons.api.boxed.BoxedLongton;
import info.kfgodel.jspek.api.JavaSpec;
import info.kfgodel.jspek.api.JavaSpecRunner;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * This type verifies the behavior of the long to byte converter
 * Created by kfgodel on 03/07/17.
 */
@RunWith(JavaSpecRunner.class)
public class BoxedLong2BoxedByteTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a Long to Byte primiton", () -> {
      context().boxedLong2BoxedByte(()-> BoxedLongton::toBoxedByte);

      describe("when used", () -> {
        context().byteOutput(()-> context().boxedLong2BoxedByte().apply(context().longInput()));

        it("converts a Long into a Byte",()->{
          context().longInput(()-> Long.valueOf(35L));
          assertThat(context().byteOutput()).isEqualTo(Byte.valueOf((byte)35));
        });

        it("converts the maximum byte value without truncation",()->{
          context().longInput(()-> Long.valueOf(127L));
          assertThat(context().byteOutput()).isEqualTo(Byte.valueOf(Byte.MAX_VALUE));
        });

        it("converts the minimum byte value without truncation",()->{
          context().longInput(()-> Long.valueOf(-128L));
          assertThat(context().byteOutput()).isEqualTo(Byte.valueOf(Byte.MIN_VALUE));
        });
        
        it("converts any value bigger than maximum byte with truncation",()->{
          context().longInput(()-> Long.valueOf(Long.MAX_VALUE));
          assertThat(context().byteOutput()).isEqualTo(Byte.valueOf((byte)-1)); //Most significant bits are lost
        });

        it("converts any value smaller than minimum byte with truncation",()->{
          context().longInput(()-> Long.valueOf(Long.MIN_VALUE));
          assertThat(context().byteOutput()).isEqualTo(Byte.valueOf((byte)0)); //Most significant bits are lost
        });

        it("converts null to null",()->{
          assertThat(context().boxedLong2BoxedByte().apply(null)).isNull();
        });

      });

    });
  }
}