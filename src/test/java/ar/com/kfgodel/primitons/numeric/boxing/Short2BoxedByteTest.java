package ar.com.kfgodel.primitons.numeric.boxing;

import ar.com.dgarcia.javaspec.api.JavaSpec;
import ar.com.dgarcia.javaspec.api.JavaSpecRunner;
import ar.com.kfgodel.primitons.PrimitonTestContext;
import ar.com.kfgodel.primitons.api.basic.Shorton;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * This type verifies the behavior of the short to byte converter
 * Created by kfgodel on 03/07/17.
 */
@RunWith(JavaSpecRunner.class)
public class Short2BoxedByteTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a short to Byte primiton", () -> {
      context().short2BoxedByte(()-> Shorton::toBoxedByte);

      describe("when used", () -> {
        context().byteOutput(()-> context().short2BoxedByte().apply(context().shortInput()));

        it("converts a primitive short into a Byte",()->{
          context().shortInput(()-> (short)100);
          assertThat(context().byteOutput()).isEqualTo(Byte.valueOf((byte)100));
        });

        it("converts the maximum byte value without truncation",()->{
          context().shortInput(()-> (short)127);
          assertThat(context().byteOutput()).isEqualTo(Byte.valueOf(Byte.MAX_VALUE));
        });

        it("converts the minimum byte value without truncation",()->{
          context().shortInput(()-> (short)-128);
          assertThat(context().byteOutput()).isEqualTo(Byte.valueOf(Byte.MIN_VALUE));
        });
        
        it("converts any value bigger than maximum byte with truncation",()->{
          context().shortInput(()-> Short.MAX_VALUE);
          assertThat(context().byteOutput()).isEqualTo(Byte.valueOf((byte)-1)); //Most significant bits are lost
        });

        it("converts any value smaller than minimum byte with truncation",()->{
          context().shortInput(()-> Short.MIN_VALUE);
          assertThat(context().byteOutput()).isEqualTo(Byte.valueOf((byte)0)); //Most significant bits are lost
        });

      });

    });
  }
}