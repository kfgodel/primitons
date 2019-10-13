package ar.com.kfgodel.primitons.numeric;

import ar.com.kfgodel.primitons.PrimitonTestContext;
import ar.com.kfgodel.primitons.api.basic.Longton;
import info.kfgodel.jspek.api.JavaSpec;
import info.kfgodel.jspek.api.JavaSpecRunner;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * This type verifies the behavior of a numeric conversion
 * Date: 01/08/17 - 20:22
 */
@RunWith(JavaSpecRunner.class)
public class Long2FloatTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a long to float primiton", () -> {
      context().long2float(()-> Longton::toFloat);

      describe("when used", () -> {
        context().floatOutput(()-> context().long2float().apply(context().longInput()));

        it("converts a primitive long into a primitive float",()->{
          context().longInput(()-> 1200L);
          assertThat(context().floatOutput()).isEqualTo(1200f);
        });

        it("converts the maximum long into a float value losing precision",()->{
          context().longInput(()-> Long.MAX_VALUE);
          assertThat(context().floatOutput()).isEqualTo(9.223372E18f); // High values of long lose precision converted to float
        });

        it("converts the minimum long into a float value losing precision",()->{
          context().longInput(()-> Long.MIN_VALUE);
          assertThat(context().floatOutput()).isEqualTo(-9.223372E18f); // Very low values of long lose precision converted to float
        });

      });

    });

  }
}