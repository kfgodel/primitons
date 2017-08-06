package ar.com.kfgodel.primitons.numeric.boxing;

import ar.com.dgarcia.javaspec.api.JavaSpec;
import ar.com.dgarcia.javaspec.api.JavaSpecRunner;
import ar.com.kfgodel.primitons.PrimitonTestContext;
import ar.com.kfgodel.primitons.api.basic.Inton;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * This type verifies the behavior of the int to short converter
 * Created by kfgodel on 03/07/17.
 */
@RunWith(JavaSpecRunner.class)
public class Int2BoxedShortTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a int to Short primiton", () -> {
      context().int2BoxedShort(()-> Inton::toBoxedShort);

      describe("when used", () -> {
        context().shortOutput(()-> context().int2BoxedShort().apply(context().intInput()));

        it("converts a primitive int into a Short",()->{
          context().intInput(()-> 78);
          assertThat(context().shortOutput()).isEqualTo(Short.valueOf((short)78));
        });

        it("converts the maximum short value without truncation",()->{
          context().intInput(()-> 32767);
          assertThat(context().shortOutput()).isEqualTo(Short.valueOf(Short.MAX_VALUE));
        });

        it("converts the minimum short value without truncation",()->{
          context().intInput(()-> -32768);
          assertThat(context().shortOutput()).isEqualTo(Short.valueOf(Short.MIN_VALUE));
        });
        
        it("converts any value bigger than maximum short with truncation",()->{
          context().intInput(()-> Integer.MAX_VALUE);
          assertThat(context().shortOutput()).isEqualTo(Short.valueOf((short)-1)); //Most significant bits are lost
        });

        it("converts any value smaller than minimum short with truncation",()->{
          context().intInput(()-> Integer.MIN_VALUE);
          assertThat(context().shortOutput()).isEqualTo(Short.valueOf((short)0)); //Most significant bits are lost
        });

      });

    });
  }
}