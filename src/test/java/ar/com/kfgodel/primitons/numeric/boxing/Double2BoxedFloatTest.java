package ar.com.kfgodel.primitons.numeric.boxing;

import ar.com.dgarcia.javaspec.api.JavaSpec;
import ar.com.dgarcia.javaspec.api.JavaSpecRunner;
import ar.com.kfgodel.primitons.PrimitonTestContext;
import ar.com.kfgodel.primitons.api.basic.Doubleton;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * This type verifies the behavior of a numeric conversion
 * Date: 01/08/17 - 20:22
 */
@RunWith(JavaSpecRunner.class)
public class Double2BoxedFloatTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a double to Float primiton", () -> {
      context().double2BoxedFloat(()-> Doubleton::toBoxedFloat);

      describe("when used", () -> {
        context().floatOutput(()-> context().double2BoxedFloat().apply(context().doubleInput()));

        it("converts a primitive double into a Float",()->{
          context().doubleInput(()-> -1.23d);
          assertThat(context().floatOutput()).isEqualTo(Float.valueOf(-1.23f));
        });

        it("converts the maximum float value without truncation",()->{
          context().doubleInput(()-> 0x1.fffffeP+127d);
          assertThat(context().floatOutput()).isEqualTo(Float.valueOf(Float.MAX_VALUE));
        });

        it("converts the minimum byte value without truncation",()->{
          context().doubleInput(()-> 0x0.000002P-126);
          assertThat(context().floatOutput()).isEqualTo(Float.valueOf(Float.MIN_VALUE));
        });

        it("converts the maximum double into a float value losing precision",()->{
          context().doubleInput(()-> Double.MAX_VALUE);
          assertThat(context().floatOutput()).isEqualTo(Float.valueOf(Float.POSITIVE_INFINITY));
        });

        it("converts the minimum double into a float value losing precision",()->{
          context().doubleInput(()-> Double.MIN_VALUE);
          assertThat(context().floatOutput()).isEqualTo(Float.valueOf(0f));
        });

      });

    });

  }
}