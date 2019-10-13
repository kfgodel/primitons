package ar.com.kfgodel.primitons.numeric.interboxing;

import ar.com.kfgodel.primitons.PrimitonTestContext;
import ar.com.kfgodel.primitons.api.boxed.BoxedFloaton;
import info.kfgodel.jspek.api.JavaSpec;
import info.kfgodel.jspek.api.JavaSpecRunner;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * This type verifies the behavior of the float to short converter
 * Created by kfgodel on 03/07/17.
 */
@RunWith(JavaSpecRunner.class)
public class BoxedFloat2BoxedShortTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a Float to Short primiton", () -> {
      context().boxedFloat2BoxedShort(()-> BoxedFloaton::toBoxedShort);

      describe("when used", () -> {
        context().shortOutput(()-> context().boxedFloat2BoxedShort().apply(context().floatInput()));

        it("converts a Float into a Short",()->{
          context().floatInput(()-> Float.valueOf(246.9f));
          assertThat(context().shortOutput()).isEqualTo(Short.valueOf((short)246));
        });

        it("converts the maximum short value without truncation",()->{
          context().floatInput(()-> Float.valueOf(32767f));
          assertThat(context().shortOutput()).isEqualTo(Short.valueOf(Short.MAX_VALUE));
        });

        it("converts the minimum short value without truncation",()->{
          context().floatInput(()-> Float.valueOf(-32768f));
          assertThat(context().shortOutput()).isEqualTo(Short.valueOf(Short.MIN_VALUE));
        });
        
        it("converts any value bigger than maximum short with truncation",()->{
          context().floatInput(()-> Float.valueOf(Float.MAX_VALUE));
          assertThat(context().shortOutput()).isEqualTo(Short.valueOf((short)-1)); //Most significant bits are lost
        });

        it("converts any value smaller than minimum short with truncation",()->{
          context().floatInput(()-> Float.valueOf(Float.MIN_VALUE));
          assertThat(context().shortOutput()).isEqualTo(Short.valueOf((short)0)); //Most significant bits are lost
        });

        it("converts null to null",()->{
          assertThat(context().boxedFloat2BoxedShort().apply(null)).isNull();
        });

      });

    });
  }
}