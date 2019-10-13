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
public class Short2BoxedIntegerTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a short to Integer primiton", () -> {
      context().short2BoxedInteger(()-> Shorton::toBoxedInteger);

      describe("when used", () -> {
        context().intOutput(()-> context().short2BoxedInteger().apply(context().shortInput()));

        it("converts a primitive short into a Integer",()->{
          context().shortInput(()-> (short)45);
          assertThat(context().intOutput()).isEqualTo(Integer.valueOf(45));
        });

        it("converts the maximum short into an int value",()->{
          context().shortInput(()-> Short.MAX_VALUE);
          assertThat(context().intOutput()).isEqualTo(Integer.valueOf(32767));
        });

        it("converts the minimum short into an int",()->{
          context().shortInput(()-> Short.MIN_VALUE);
          assertThat(context().intOutput()).isEqualTo(Integer.valueOf(-32768));
        });

      });

    });

  }
}