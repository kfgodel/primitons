package ar.com.kfgodel.primitons.numeric.interboxing;

import ar.com.kfgodel.primitons.PrimitonTestContext;
import ar.com.kfgodel.primitons.api.boxed.BoxedIntegerton;
import info.kfgodel.jspek.api.JavaSpec;
import info.kfgodel.jspek.api.JavaSpecRunner;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * This type verifies the behavior of the int to byte converter
 * Created by kfgodel on 03/07/17.
 */
@RunWith(JavaSpecRunner.class)
public class BoxedInteger2BoxedByteTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a Integer to Byte primiton", () -> {
      context().boxedInteger2BoxedByte(()-> BoxedIntegerton::toBoxedByte);

      describe("when used", () -> {
        context().byteOutput(()-> context().boxedInteger2BoxedByte().apply(context().intInput()));

        it("converts an Integer into a Byte",()->{
          context().intInput(()-> Integer.valueOf(101));
          assertThat(context().byteOutput()).isEqualTo(Byte.valueOf((byte)101));
        });

        it("converts the maximum byte value without truncation",()->{
          context().intInput(()-> Integer.valueOf(127));
          assertThat(context().byteOutput()).isEqualTo(Byte.valueOf(Byte.MAX_VALUE));
        });

        it("converts the minimum byte value without truncation",()->{
          context().intInput(()-> Integer.valueOf(-128));
          assertThat(context().byteOutput()).isEqualTo(Byte.valueOf(Byte.MIN_VALUE));
        });
        
        it("converts any value bigger than maximum byte with truncation",()->{
          context().intInput(()-> Integer.valueOf(Integer.MAX_VALUE));
          assertThat(context().byteOutput()).isEqualTo(Byte.valueOf((byte)-1)); //Most significant bits are lost
        });

        it("converts any value smaller than minimum byte with truncation",()->{
          context().intInput(()-> Integer.valueOf(Integer.MIN_VALUE));
          assertThat(context().byteOutput()).isEqualTo(Byte.valueOf((byte)0)); //Most significant bits are lost
        });

        it("converts null to null",()->{
          assertThat(context().boxedInteger2BoxedByte().apply(null)).isNull();
        });

      });

    });
  }
}