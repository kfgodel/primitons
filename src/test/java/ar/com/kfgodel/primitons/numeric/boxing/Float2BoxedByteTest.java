package ar.com.kfgodel.primitons.numeric.boxing;

import ar.com.kfgodel.primitons.PrimitonTestContext;
import ar.com.kfgodel.primitons.api.basic.Floaton;
import info.kfgodel.jspek.api.JavaSpec;
import info.kfgodel.jspek.api.JavaSpecRunner;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * This type verifies the behavior of the float to byte converter
 * Created by kfgodel on 03/07/17.
 */
@RunWith(JavaSpecRunner.class)
public class Float2BoxedByteTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a float to Byte primiton", () -> {
      context().float2BoxedByte(()-> Floaton::toBoxedByte);

      describe("when used", () -> {
        context().byteOutput(()-> context().float2BoxedByte().apply(context().floatInput()));

        it("converts a primitive float into a Byte",()->{
          context().floatInput(()-> 98.1f);
          assertThat(context().byteOutput()).isEqualTo(Byte.valueOf((byte)98));
        });

        it("converts the maximum byte value without truncation",()->{
          context().floatInput(()-> 127f);
          assertThat(context().byteOutput()).isEqualTo(Byte.valueOf(Byte.MAX_VALUE));
        });

        it("converts the minimum byte value without truncation",()->{
          context().floatInput(()-> -128f);
          assertThat(context().byteOutput()).isEqualTo(Byte.valueOf(Byte.MIN_VALUE));
        });
        
        it("converts any value bigger than maximum byte with truncation",()->{
          context().floatInput(()-> Float.MAX_VALUE);
          assertThat(context().byteOutput()).isEqualTo(Byte.valueOf((byte)-1)); //Most significant bits are lost
        });

        it("converts any value smaller than minimum byte with truncation",()->{
          context().floatInput(()-> Float.MIN_VALUE);
          assertThat(context().byteOutput()).isEqualTo(Byte.valueOf((byte)0)); //Most significant bits are lost
        });

      });

    });
  }
}