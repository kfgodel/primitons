package ar.com.kfgodel.primitons.numeric;

import ar.com.kfgodel.primitons.PrimitonTestContext;
import ar.com.kfgodel.primitons.api.basic.Inton;
import info.kfgodel.jspek.api.JavaSpec;
import info.kfgodel.jspek.api.JavaSpecRunner;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * This type verifies the behavior of the int to byte converter
 * Created by kfgodel on 03/07/17.
 */
@RunWith(JavaSpecRunner.class)
public class Int2ByteTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a int to byte primiton", () -> {
      context().int2byte(()-> Inton::toByte);

      describe("when used", () -> {
        context().byteOutput(()-> context().int2byte().apply(context().intInput()));

        it("converts a primitive int into a primitive byte",()->{
          context().intInput(()-> 101);
          assertThat(context().byteOutput()).isEqualTo((byte)101);
        });

        it("converts the maximum byte value without truncation",()->{
          context().intInput(()-> 127);
          assertThat(context().byteOutput()).isEqualTo(Byte.MAX_VALUE);
        });

        it("converts the minimum byte value without truncation",()->{
          context().intInput(()-> -128);
          assertThat(context().byteOutput()).isEqualTo(Byte.MIN_VALUE);
        });
        
        it("converts any value bigger than maximum byte with truncation",()->{
          context().intInput(()-> Integer.MAX_VALUE);
          assertThat(context().byteOutput()).isEqualTo((byte)-1); //Most significant bits are lost
        });

        it("converts any value smaller than minimum byte with truncation",()->{
          context().intInput(()-> Integer.MIN_VALUE);
          assertThat(context().byteOutput()).isEqualTo((byte)0); //Most significant bits are lost
        });

      });

    });
  }
}