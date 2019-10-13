package ar.com.kfgodel.primitons.numeric.interboxing;

import ar.com.kfgodel.primitons.PrimitonTestContext;
import ar.com.kfgodel.primitons.api.boxed.BoxedFloaton;
import info.kfgodel.jspek.api.JavaSpec;
import info.kfgodel.jspek.api.JavaSpecRunner;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * This type verifies the behavior of the float to byte converter
 * Created by kfgodel on 03/07/17.
 */
@RunWith(JavaSpecRunner.class)
public class BoxedFloat2BoxedByteTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a Float to Byte primiton", () -> {
      context().boxedFloat2BoxedByte(()-> BoxedFloaton::toBoxedByte);

      describe("when used", () -> {
        context().byteOutput(()-> context().boxedFloat2BoxedByte().apply(context().floatInput()));

        it("converts a Float into a Byte",()->{
          context().floatInput(()-> Float.valueOf(98.1f));
          assertThat(context().byteOutput()).isEqualTo(Byte.valueOf((byte)98));
        });

        it("converts the maximum byte value without truncation",()->{
          context().floatInput(()-> Float.valueOf(127f));
          assertThat(context().byteOutput()).isEqualTo(Byte.valueOf(Byte.MAX_VALUE));
        });

        it("converts the minimum byte value without truncation",()->{
          context().floatInput(()-> Float.valueOf(-128f));
          assertThat(context().byteOutput()).isEqualTo(Byte.valueOf(Byte.MIN_VALUE));
        });
        
        it("converts any value bigger than maximum byte with truncation",()->{
          context().floatInput(()-> Float.valueOf(Float.MAX_VALUE));
          assertThat(context().byteOutput()).isEqualTo(Byte.valueOf((byte)-1)); //Most significant bits are lost
        });

        it("converts any value smaller than minimum byte with truncation",()->{
          context().floatInput(()-> Float.valueOf(Float.MIN_VALUE));
          assertThat(context().byteOutput()).isEqualTo(Byte.valueOf((byte)0)); //Most significant bits are lost
        });

        it("converts null to null",()->{
          assertThat(context().boxedFloat2BoxedByte().apply(null)).isNull();
        });

      });

    });
  }
}