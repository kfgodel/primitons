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
public class Long2BoxedDoubleTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a long to Double primiton", () -> {
      context().long2BoxedDouble(()-> Longton::toBoxedDouble);

      describe("when used", () -> {
        context().doubleOutput(()-> context().long2BoxedDouble().apply(context().longInput()));

        it("converts a primitive long into a Double",()->{
          context().longInput(()-> 65L);
          assertThat(context().doubleOutput()).isEqualTo(Double.valueOf(65d));
        });

        it("converts the maximum long into a double value losing precision",()->{
          context().longInput(()-> Long.MAX_VALUE);
          assertThat(context().doubleOutput()).isEqualTo(Double.valueOf(9223372036854775807d)); // High values of long lose precision converted to double
        });

        it("converts the minimum long into a double losing precision",()->{
          context().longInput(()-> Long.MIN_VALUE);
          assertThat(context().doubleOutput()).isEqualTo(Double.valueOf(-9.223372036854776E18d)); // Very low values of long lose precision converted to double
        });

      });

    });

  }
}