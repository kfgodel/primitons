package ar.com.kfgodel.primitons.numeric.boxing;

import ar.com.dgarcia.javaspec.api.JavaSpec;
import ar.com.dgarcia.javaspec.api.JavaSpecRunner;
import ar.com.kfgodel.primitons.PrimitonTestContext;
import ar.com.kfgodel.primitons.api.basic.Longton;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * This type verifies the behavior of a numeric conversion
 * Date: 01/08/17 - 20:22
 */
@RunWith(JavaSpecRunner.class)
public class Long2BoxedFloatTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a long to Float primiton", () -> {
      context().long2BoxedFloat(()-> Longton::toBoxedFloat);

      describe("when used", () -> {
        context().floatOutput(()-> context().long2BoxedFloat().apply(context().longInput()));

        it("converts a primitive long into a Float",()->{
          context().longInput(()-> 1200L);
          assertThat(context().floatOutput()).isEqualTo(Float.valueOf(1200f));
        });

        it("converts the maximum long into a float value losing precision",()->{
          context().longInput(()-> Long.MAX_VALUE);
          assertThat(context().floatOutput()).isEqualTo(Float.valueOf(9.223372E18f)); // High values of long lose precision converted to float
        });

        it("converts the minimum long into a float value losing precision",()->{
          context().longInput(()-> Long.MIN_VALUE);
          assertThat(context().floatOutput()).isEqualTo(Float.valueOf(-9.223372E18f)); // Very low values of long lose precision converted to float
        });

      });

    });

  }
}