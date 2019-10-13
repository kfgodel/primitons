package ar.com.kfgodel.primitons.numeric.boxing;

import ar.com.kfgodel.primitons.PrimitonTestContext;
import ar.com.kfgodel.primitons.api.basic.Longton;
import info.kfgodel.jspek.api.JavaSpec;
import info.kfgodel.jspek.api.JavaSpecRunner;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * This type verifies the behavior of the long to byte converter
 * Created by kfgodel on 03/07/17.
 */
@RunWith(JavaSpecRunner.class)
public class Long2BoxedByteTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a long to Byte primiton", () -> {
      context().long2BoxedByte(()-> Longton::toBoxedByte);

      describe("when used", () -> {
        context().byteOutput(()-> context().long2BoxedByte().apply(context().longInput()));

        it("converts a primitive long into a Byte",()->{
          context().longInput(()-> 35L);
          assertThat(context().byteOutput()).isEqualTo(Byte.valueOf((byte)35));
        });

        it("converts the maximum byte value without truncation",()->{
          context().longInput(()-> 127L);
          assertThat(context().byteOutput()).isEqualTo(Byte.valueOf(Byte.MAX_VALUE));
        });

        it("converts the minimum byte value without truncation",()->{
          context().longInput(()-> -128L);
          assertThat(context().byteOutput()).isEqualTo(Byte.valueOf(Byte.MIN_VALUE));
        });
        
        it("converts any value bigger than maximum byte with truncation",()->{
          context().longInput(()-> Long.MAX_VALUE);
          assertThat(context().byteOutput()).isEqualTo(Byte.valueOf((byte)-1)); //Most significant bits are lost
        });

        it("converts any value smaller than minimum byte with truncation",()->{
          context().longInput(()-> Long.MIN_VALUE);
          assertThat(context().byteOutput()).isEqualTo(Byte.valueOf((byte)0)); //Most significant bits are lost
        });

      });

    });
  }
}