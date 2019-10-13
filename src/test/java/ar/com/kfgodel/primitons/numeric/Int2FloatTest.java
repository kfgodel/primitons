package ar.com.kfgodel.primitons.numeric;

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
public class Int2FloatTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a int to float primiton", () -> {
      context().int2float(()-> Inton::toFloat);

      describe("when used", () -> {
        context().floatOutput(()-> context().int2float().apply(context().intInput()));

        it("converts a primitive int into a primitive float",()->{
          context().intInput(()-> -4);
          assertThat(context().floatOutput()).isEqualTo(-4f);
        });

        it("converts the maximum int into a float value losing precision",()->{
          context().intInput(()-> Integer.MAX_VALUE);
          assertThat(context().floatOutput()).isEqualTo(2.14748365E9f);
        });

        it("converts the minimum int into a float value losing precision",()->{
          context().intInput(()-> Integer.MIN_VALUE);
          assertThat(context().floatOutput()).isEqualTo(-2.14748365E9f);
        });

      });

    });

  }
}