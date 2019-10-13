package ar.com.kfgodel.primitons.numeric.interboxing;

import ar.com.kfgodel.primitons.PrimitonTestContext;
import ar.com.kfgodel.primitons.api.boxed.BoxedShorton;
import info.kfgodel.jspek.api.JavaSpec;
import info.kfgodel.jspek.api.JavaSpecRunner;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * This type verifies the behavior of the short to byte converter
 * Created by kfgodel on 03/07/17.
 */
@RunWith(JavaSpecRunner.class)
public class BoxedShort2BoxedByteTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a Short to Byte primiton", () -> {
      context().boxedShort2BoxedByte(()-> BoxedShorton::toBoxedByte);

      describe("when used", () -> {
        context().byteOutput(()-> context().boxedShort2BoxedByte().apply(context().shortInput()));

        it("converts a Short into a Byte",()->{
          context().shortInput(()-> Short.valueOf((short)100));
          assertThat(context().byteOutput()).isEqualTo(Byte.valueOf((byte)100));
        });

        it("converts the maximum byte value without truncation",()->{
          context().shortInput(()-> Short.valueOf((short)127));
          assertThat(context().byteOutput()).isEqualTo(Byte.valueOf(Byte.MAX_VALUE));
        });

        it("converts the minimum byte value without truncation",()->{
          context().shortInput(()-> Short.valueOf((short)-128));
          assertThat(context().byteOutput()).isEqualTo(Byte.valueOf(Byte.MIN_VALUE));
        });
        
        it("converts any value bigger than maximum byte with truncation",()->{
          context().shortInput(()-> Short.valueOf(Short.MAX_VALUE));
          assertThat(context().byteOutput()).isEqualTo(Byte.valueOf((byte)-1)); //Most significant bits are lost
        });

        it("converts any value smaller than minimum byte with truncation",()->{
          context().shortInput(()-> Short.valueOf(Short.MIN_VALUE));
          assertThat(context().byteOutput()).isEqualTo(Byte.valueOf((byte)0)); //Most significant bits are lost
        });

        it("converts null to null",()->{
          assertThat(context().boxedShort2BoxedByte().apply(null)).isNull();
        });

      });

    });
  }
}