package ar.com.kfgodel.primitons.numeric.boxing;

import ar.com.kfgodel.primitons.PrimitonTestContext;
import ar.com.kfgodel.primitons.api.basic.Shorton;
import info.kfgodel.jspek.api.JavaSpec;
import info.kfgodel.jspek.api.JavaSpecRunner;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * This type verifies the behavior of a numeric conversion
 * Date: 01/08/17 - 20:22
 */
@RunWith(JavaSpecRunner.class)
public class Short2BoxedDoubleTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a short to Double primiton", () -> {
      context().short2BoxedDouble(()-> Shorton::toBoxedDouble);

      describe("when used", () -> {
        context().doubleOutput(()-> context().short2BoxedDouble().apply(context().shortInput()));

        it("converts a primitive short into a Double",()->{
          context().shortInput(()-> (short)54);
          assertThat(context().doubleOutput()).isEqualTo(Double.valueOf(54d));
        });

        it("converts the maximum short into a double value",()->{
          context().shortInput(()-> Short.MAX_VALUE);
          assertThat(context().doubleOutput()).isEqualTo(Double.valueOf(32767d));
        });

        it("converts the minimum short into a double",()->{
          context().shortInput(()-> Short.MIN_VALUE);
          assertThat(context().doubleOutput()).isEqualTo(Double.valueOf(-32768d));
        });

      });

    });

  }
}