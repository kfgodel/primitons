package ar.com.kfgodel.primitons.numeric;

import ar.com.kfgodel.primitons.PrimitonTestContext;
import ar.com.kfgodel.primitons.api.basic.Floaton;
import info.kfgodel.jspek.api.JavaSpec;
import info.kfgodel.jspek.api.JavaSpecRunner;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * This type verifies the behavior of the float to short converter
 * Created by kfgodel on 03/07/17.
 */
@RunWith(JavaSpecRunner.class)
public class Float2ShortTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a float to short primiton", () -> {
      context().float2short(()-> Floaton::toShort);

      describe("when used", () -> {
        context().shortOutput(()-> context().float2short().apply(context().floatInput()));

        it("converts a primitive float into a primitive short",()->{
          context().floatInput(()-> 246.9f);
          assertThat(context().shortOutput()).isEqualTo((short)246);
        });

        it("converts the maximum short value without truncation",()->{
          context().floatInput(()-> 32767f);
          assertThat(context().shortOutput()).isEqualTo(Short.MAX_VALUE);
        });

        it("converts the minimum short value without truncation",()->{
          context().floatInput(()-> -32768f);
          assertThat(context().shortOutput()).isEqualTo(Short.MIN_VALUE);
        });
        
        it("converts any value bigger than maximum short with truncation",()->{
          context().floatInput(()-> Float.MAX_VALUE);
          assertThat(context().shortOutput()).isEqualTo((short)-1); //Most significant bits are lost
        });

        it("converts any value smaller than minimum short with truncation",()->{
          context().floatInput(()-> Float.MIN_VALUE);
          assertThat(context().shortOutput()).isEqualTo((short)0); //Most significant bits are lost
        });

      });

    });
  }
}