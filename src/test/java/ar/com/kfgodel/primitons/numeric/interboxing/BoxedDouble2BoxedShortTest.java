package ar.com.kfgodel.primitons.numeric.interboxing;

import ar.com.dgarcia.javaspec.api.JavaSpec;
import ar.com.dgarcia.javaspec.api.JavaSpecRunner;
import ar.com.kfgodel.primitons.PrimitonTestContext;
import ar.com.kfgodel.primitons.api.boxed.BoxedDoubleton;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * This type verifies the behavior of the double to short converter
 * Created by kfgodel on 03/07/17.
 */
@RunWith(JavaSpecRunner.class)
public class BoxedDouble2BoxedShortTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a Double to Short primiton", () -> {
      context().boxedDouble2BoxedShort(()-> BoxedDoubleton::toBoxedShort);

      describe("when used", () -> {
        context().shortOutput(()-> context().boxedDouble2BoxedShort().apply(context().doubleInput()));

        it("converts a Double into a Short",()->{
          context().doubleInput(()-> Double.valueOf(5246.9d));
          assertThat(context().shortOutput()).isEqualTo(Short.valueOf((short)5246));
        });

        it("converts the maximum short value without truncation",()->{
          context().doubleInput(()-> Double.valueOf(32767d));
          assertThat(context().shortOutput()).isEqualTo(Short.valueOf(Short.MAX_VALUE));
        });

        it("converts the minimum short value without truncation",()->{
          context().doubleInput(()-> Double.valueOf(-32768d));
          assertThat(context().shortOutput()).isEqualTo(Short.valueOf(Short.MIN_VALUE));
        });
        
        it("converts any value bigger than maximum short with truncation",()->{
          context().doubleInput(()-> Double.valueOf(Double.MAX_VALUE));
          assertThat(context().shortOutput()).isEqualTo(Short.valueOf((short)-1)); //Most significant bits are lost
        });

        it("converts any value smaller than minimum short with truncation",()->{
          context().doubleInput(()-> Double.valueOf(Double.MIN_VALUE));
          assertThat(context().shortOutput()).isEqualTo(Short.valueOf((short)0)); //Most significant bits are lost
        });

        it("converts null to null",()->{
          assertThat(context().boxedDouble2BoxedShort().apply(null)).isNull();
        });

      });

    });
  }
}