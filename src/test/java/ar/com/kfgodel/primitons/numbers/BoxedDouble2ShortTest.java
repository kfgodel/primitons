package ar.com.kfgodel.primitons.numbers;

import ar.com.dgarcia.javaspec.api.JavaSpec;
import ar.com.dgarcia.javaspec.api.JavaSpecRunner;
import ar.com.kfgodel.primitons.PrimitonTestContext;
import ar.com.kfgodel.primitons.api.boxed.BoxedDoubleton;
import ar.com.kfgodel.primitons.api.exceptions.UnmappableException;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * This type verifies the behavior of a numeric conversion
 * Date: 01/08/17 - 20:22
 */
@RunWith(JavaSpecRunner.class)
public class BoxedDouble2ShortTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a Double to short primiton", () -> {
      context().boxedDouble2Short(()-> BoxedDoubleton::toShort);

      describe("when used", () -> {
        context().shortOutput(()-> context().boxedDouble2Short().apply(context().doubleInput()));

        it("converts a Double into a primitive short",()->{
          context().doubleInput(()-> Double.valueOf(8.3d));
          assertThat(context().shortOutput()).isEqualTo((short)8);
        });

        it("converts the maximum short value without truncation",()->{
          context().doubleInput(()-> Double.valueOf(32767d));
          assertThat(context().shortOutput()).isEqualTo(Short.MAX_VALUE);
        });

        it("converts the minimum short value without truncation",()->{
          context().doubleInput(()-> Double.valueOf(-32768d));
          assertThat(context().shortOutput()).isEqualTo(Short.MIN_VALUE);
        });

        it("converts any value bigger than maximum short with truncation",()->{
          context().doubleInput(()-> Double.valueOf(Double.MAX_VALUE));
          assertThat(context().shortOutput()).isEqualTo((short)-1); //Most significant bits are lost
        });

        it("converts any value smaller than minimum short with truncation",()->{
          context().doubleInput(()-> Double.valueOf(Double.MIN_VALUE));
          assertThat(context().shortOutput()).isEqualTo((short)0); //Most significant bits are lost
        });
        
        itThrows(UnmappableException.class, "if value is null",()->{
          context().boxedDouble2Short().apply(null);
        }, e ->{
          assertThat(e).hasMessage("Value[null] is not convertible to type [short]");
        });

      });

    });

  }
}