package ar.com.kfgodel.primitons.numeric;

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
public class Float2ByteTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a float to byte primiton", () -> {
      context().float2byte(()-> Floaton::toByte);

      describe("when used", () -> {
        context().byteOutput(()-> context().float2byte().apply(context().floatInput()));

        it("converts a primitive float into a primitive byte",()->{
          context().floatInput(()-> 98.1f);
          assertThat(context().byteOutput()).isEqualTo((byte)98);
        });

        it("converts the maximum byte value without truncation",()->{
          context().floatInput(()-> 127f);
          assertThat(context().byteOutput()).isEqualTo(Byte.MAX_VALUE);
        });

        it("converts the minimum byte value without truncation",()->{
          context().floatInput(()-> -128f);
          assertThat(context().byteOutput()).isEqualTo(Byte.MIN_VALUE);
        });
        
        it("converts any value bigger than maximum byte with truncation",()->{
          context().floatInput(()-> Float.MAX_VALUE);
          assertThat(context().byteOutput()).isEqualTo((byte)-1); //Most significant bits are lost
        });

        it("converts any value smaller than minimum byte with truncation",()->{
          context().floatInput(()-> Float.MIN_VALUE);
          assertThat(context().byteOutput()).isEqualTo((byte)0); //Most significant bits are lost
        });

      });

    });
  }
}