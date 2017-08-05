package ar.com.kfgodel.primitons.numeric;

import ar.com.dgarcia.javaspec.api.JavaSpec;
import ar.com.dgarcia.javaspec.api.JavaSpecRunner;
import ar.com.kfgodel.primitons.PrimitonTestContext;
import ar.com.kfgodel.primitons.api.basic.Doubleton;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * This type verifies the behavior of the double to short converter
 * Created by kfgodel on 03/07/17.
 */
@RunWith(JavaSpecRunner.class)
public class Double2ShortTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a double to short primiton", () -> {
      context().double2short(()-> Doubleton::toShort);

      describe("when used", () -> {
        context().shortOutput(()-> context().double2short().apply(context().doubleInput()));

        it("converts a primitive double into a primitive short",()->{
          context().doubleInput(()-> 5246.9d);
          assertThat(context().shortOutput()).isEqualTo((short)5246);
        });

        it("converts the maximum short value without truncation",()->{
          context().doubleInput(()-> 32767d);
          assertThat(context().shortOutput()).isEqualTo(Short.MAX_VALUE);
        });

        it("converts the minimum short value without truncation",()->{
          context().doubleInput(()-> -32768d);
          assertThat(context().shortOutput()).isEqualTo(Short.MIN_VALUE);
        });
        
        it("converts any value bigger than maximum short with truncation",()->{
          context().doubleInput(()-> Double.MAX_VALUE);
          assertThat(context().shortOutput()).isEqualTo((short)-1); //Most significant bits are lost
        });

        it("converts any value smaller than minimum short with truncation",()->{
          context().doubleInput(()-> Double.MIN_VALUE);
          assertThat(context().shortOutput()).isEqualTo((short)0); //Most significant bits are lost
        });

      });

    });
  }
}