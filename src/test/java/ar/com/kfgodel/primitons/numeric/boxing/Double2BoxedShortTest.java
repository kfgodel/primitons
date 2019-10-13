package ar.com.kfgodel.primitons.numeric.boxing;

import ar.com.kfgodel.primitons.PrimitonTestContext;
import ar.com.kfgodel.primitons.api.basic.Doubleton;
import info.kfgodel.jspek.api.JavaSpec;
import info.kfgodel.jspek.api.JavaSpecRunner;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * This type verifies the behavior of the double to short converter
 * Created by kfgodel on 03/07/17.
 */
@RunWith(JavaSpecRunner.class)
public class Double2BoxedShortTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a double to Short primiton", () -> {
      context().double2BoxedShort(()-> Doubleton::toBoxedShort);

      describe("when used", () -> {
        context().shortOutput(()-> context().double2BoxedShort().apply(context().doubleInput()));

        it("converts a primitive double into a primitive short",()->{
          context().doubleInput(()-> 5246.9d);
          assertThat(context().shortOutput()).isEqualTo(Short.valueOf((short)5246));
        });

        it("converts the maximum short value without truncation",()->{
          context().doubleInput(()-> 32767d);
          assertThat(context().shortOutput()).isEqualTo(Short.valueOf(Short.MAX_VALUE));
        });

        it("converts the minimum short value without truncation",()->{
          context().doubleInput(()-> -32768d);
          assertThat(context().shortOutput()).isEqualTo(Short.valueOf(Short.MIN_VALUE));
        });
        
        it("converts any value bigger than maximum short with truncation",()->{
          context().doubleInput(()-> Double.MAX_VALUE);
          assertThat(context().shortOutput()).isEqualTo(Short.valueOf((short)-1)); //Most significant bits are lost
        });

        it("converts any value smaller than minimum short with truncation",()->{
          context().doubleInput(()-> Double.MIN_VALUE);
          assertThat(context().shortOutput()).isEqualTo(Short.valueOf((short)0)); //Most significant bits are lost
        });

      });

    });
  }
}