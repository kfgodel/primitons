package ar.com.kfgodel.primitons.numeric;

import ar.com.kfgodel.primitons.PrimitonTestContext;
import ar.com.kfgodel.primitons.api.basic.Shorton;
import info.kfgodel.jspek.api.JavaSpec;
import info.kfgodel.jspek.api.JavaSpecRunner;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * This type verifies the behavior of the short to byte converter
 * Created by kfgodel on 03/07/17.
 */
@RunWith(JavaSpecRunner.class)
public class Short2ByteTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a short to byte primiton", () -> {
      context().short2byte(()-> Shorton::toByte);

      describe("when used", () -> {
        context().byteOutput(()-> context().short2byte().apply(context().shortInput()));

        it("converts a primitive short into a primitive byte",()->{
          context().shortInput(()-> (short)100);
          assertThat(context().byteOutput()).isEqualTo((byte)100);
        });

        it("converts the maximum byte value without truncation",()->{
          context().shortInput(()-> (short)127);
          assertThat(context().byteOutput()).isEqualTo(Byte.MAX_VALUE);
        });

        it("converts the minimum byte value without truncation",()->{
          context().shortInput(()-> (short)-128);
          assertThat(context().byteOutput()).isEqualTo(Byte.MIN_VALUE);
        });
        
        it("converts any value bigger than maximum byte with truncation",()->{
          context().shortInput(()-> Short.MAX_VALUE);
          assertThat(context().byteOutput()).isEqualTo((byte)-1); //Most significant bits are lost
        });

        it("converts any value smaller than minimum byte with truncation",()->{
          context().shortInput(()-> Short.MIN_VALUE);
          assertThat(context().byteOutput()).isEqualTo((byte)0); //Most significant bits are lost
        });

      });

    });
  }
}