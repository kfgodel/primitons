package ar.com.kfgodel.primitons.numeric.boxing;

import ar.com.kfgodel.primitons.PrimitonTestContext;
import ar.com.kfgodel.primitons.api.basic.Longton;
import info.kfgodel.jspek.api.JavaSpec;
import info.kfgodel.jspek.api.JavaSpecRunner;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * This type verifies the behavior of the long to short converter
 * Created by kfgodel on 03/07/17.
 */
@RunWith(JavaSpecRunner.class)
public class Long2BoxedShortTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a long to Short primiton", () -> {
      context().long2BoxedShort(()-> Longton::toBoxedShort);

      describe("when used", () -> {
        context().shortOutput(()-> context().long2BoxedShort().apply(context().longInput()));

        it("converts a primitive long into a Short",()->{
          context().longInput(()-> 18L);
          assertThat(context().shortOutput()).isEqualTo(Short.valueOf((short)18));
        });

        it("converts the maximum short value without truncation",()->{
          context().longInput(()-> 32767L);
          assertThat(context().shortOutput()).isEqualTo(Short.valueOf(Short.MAX_VALUE));
        });

        it("converts the minimum short value without truncation",()->{
          context().longInput(()-> -32768L);
          assertThat(context().shortOutput()).isEqualTo(Short.valueOf(Short.MIN_VALUE));
        });
        
        it("converts any value bigger than maximum short with truncation",()->{
          context().longInput(()-> Long.MAX_VALUE);
          assertThat(context().shortOutput()).isEqualTo(Short.valueOf((short)-1)); //Most significant bits are lost
        });

        it("converts any value smaller than minimum short with truncation",()->{
          context().longInput(()-> Long.MIN_VALUE);
          assertThat(context().shortOutput()).isEqualTo(Short.valueOf((short)0)); //Most significant bits are lost
        });

      });

    });
  }
}