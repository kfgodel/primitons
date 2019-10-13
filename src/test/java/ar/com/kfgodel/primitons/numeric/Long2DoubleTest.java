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
public class Long2DoubleTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a long to double primiton", () -> {
      context().long2double(()-> Longton::toDouble);

      describe("when used", () -> {
        context().doubleOutput(()-> context().long2double().apply(context().longInput()));

        it("converts a primitive long into a primitive double",()->{
          context().longInput(()-> 65L);
          assertThat(context().doubleOutput()).isEqualTo(65d);
        });

        it("converts the maximum long into a double value losing precision",()->{
          context().longInput(()-> Long.MAX_VALUE);
          assertThat(context().doubleOutput()).isEqualTo(9223372036854775807d); // High values of long lose precision converted to double
        });

        it("converts the minimum long into a double losing precision",()->{
          context().longInput(()-> Long.MIN_VALUE);
          assertThat(context().doubleOutput()).isEqualTo(-9.223372036854776E18d); // Very low values of long lose precision converted to double
        });

      });

    });

  }
}