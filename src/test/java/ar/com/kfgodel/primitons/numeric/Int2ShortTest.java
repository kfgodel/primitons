package ar.com.kfgodel.primitons.numeric;

import ar.com.kfgodel.primitons.PrimitonTestContext;
import ar.com.kfgodel.primitons.api.basic.Inton;
import info.kfgodel.jspek.api.JavaSpec;
import info.kfgodel.jspek.api.JavaSpecRunner;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * This type verifies the behavior of the int to short converter
 * Created by kfgodel on 03/07/17.
 */
@RunWith(JavaSpecRunner.class)
public class Int2ShortTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a int to short primiton", () -> {
      context().int2short(()-> Inton::toShort);

      describe("when used", () -> {
        context().shortOutput(()-> context().int2short().apply(context().intInput()));

        it("converts a primitive int into a primitive short",()->{
          context().intInput(()-> 78);
          assertThat(context().shortOutput()).isEqualTo((short)78);
        });

        it("converts the maximum short value without truncation",()->{
          context().intInput(()-> 32767);
          assertThat(context().shortOutput()).isEqualTo(Short.MAX_VALUE);
        });

        it("converts the minimum short value without truncation",()->{
          context().intInput(()-> -32768);
          assertThat(context().shortOutput()).isEqualTo(Short.MIN_VALUE);
        });
        
        it("converts any value bigger than maximum short with truncation",()->{
          context().intInput(()-> Integer.MAX_VALUE);
          assertThat(context().shortOutput()).isEqualTo((short)-1); //Most significant bits are lost
        });

        it("converts any value smaller than minimum short with truncation",()->{
          context().intInput(()-> Integer.MIN_VALUE);
          assertThat(context().shortOutput()).isEqualTo((short)0); //Most significant bits are lost
        });

      });

    });
  }
}