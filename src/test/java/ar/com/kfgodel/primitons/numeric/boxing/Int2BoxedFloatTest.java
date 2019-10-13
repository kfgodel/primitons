package ar.com.kfgodel.primitons.numeric.boxing;

import ar.com.kfgodel.primitons.PrimitonTestContext;
import ar.com.kfgodel.primitons.api.basic.Inton;
import info.kfgodel.jspek.api.JavaSpec;
import info.kfgodel.jspek.api.JavaSpecRunner;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * This type verifies the behavior of a numeric conversion
 * Date: 01/08/17 - 20:22
 */
@RunWith(JavaSpecRunner.class)
public class Int2BoxedFloatTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a int to Float primiton", () -> {
      context().int2BoxedFloat(()-> Inton::toBoxedFloat);

      describe("when used", () -> {
        context().floatOutput(()-> context().int2BoxedFloat().apply(context().intInput()));

        it("converts a primitive int into a Float",()->{
          context().intInput(()-> -4);
          assertThat(context().floatOutput()).isEqualTo(Float.valueOf(-4f));
        });

        it("converts the maximum int into a float value losing precision",()->{
          context().intInput(()-> Integer.MAX_VALUE);
          assertThat(context().floatOutput()).isEqualTo(Float.valueOf(2.14748365E9f));
        });

        it("converts the minimum int into a float value losing precision",()->{
          context().intInput(()-> Integer.MIN_VALUE);
          assertThat(context().floatOutput()).isEqualTo(Float.valueOf(-2.14748365E9f));
        });

      });

    });

  }
}