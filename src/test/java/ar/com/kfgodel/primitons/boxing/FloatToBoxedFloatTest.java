package ar.com.kfgodel.primitons.boxing;

import ar.com.kfgodel.primitons.PrimitonTestContext;
import ar.com.kfgodel.primitons.api.basic.Floaton;
import info.kfgodel.jspek.api.JavaSpec;
import info.kfgodel.jspek.api.JavaSpecRunner;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Date: 05/08/17 - 18:11
 */
@RunWith(JavaSpecRunner.class)
public class FloatToBoxedFloatTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a float to Float primiton", () -> {
      context().float2boxedFloat(()-> Floaton::toBoxedFloat);

      describe("when used", () -> {
        context().floatOutput(()-> context().float2boxedFloat().apply(context().floatInput()));

        it("converts the primitive float into its object counterpart",()->{
          context().floatInput(()-> 2.4f);
          assertThat(context().floatOutput()).isEqualTo(Float.valueOf(2.4f));
        });

      });
    });

  }
}