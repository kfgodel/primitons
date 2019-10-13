package ar.com.kfgodel.primitons.numeric.interboxing;

import ar.com.kfgodel.primitons.PrimitonTestContext;
import ar.com.kfgodel.primitons.api.boxed.BoxedDoubleton;
import info.kfgodel.jspek.api.JavaSpec;
import info.kfgodel.jspek.api.JavaSpecRunner;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * This type verifies the behavior of a numeric conversion
 * Date: 01/08/17 - 20:22
 */
@RunWith(JavaSpecRunner.class)
public class BoxedDouble2BoxedFloatTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a Double to Float primiton", () -> {
      context().boxedDouble2BoxedFloat(()-> BoxedDoubleton::toBoxedFloat);

      describe("when used", () -> {
        context().floatOutput(()-> context().boxedDouble2BoxedFloat().apply(context().doubleInput()));

        it("converts a Double into a Float",()->{
          context().doubleInput(()-> Double.valueOf(-1.23d));
          assertThat(context().floatOutput()).isEqualTo(Float.valueOf(-1.23f));
        });

        it("converts the maximum float value without truncation",()->{
          context().doubleInput(()-> Double.valueOf(0x1.fffffeP+127d));
          assertThat(context().floatOutput()).isEqualTo(Float.valueOf(Float.MAX_VALUE));
        });

        it("converts the minimum byte value without truncation",()->{
          context().doubleInput(()-> Double.valueOf(0x0.000002P-126));
          assertThat(context().floatOutput()).isEqualTo(Float.valueOf(Float.MIN_VALUE));
        });

        it("converts the maximum double into a float value losing precision",()->{
          context().doubleInput(()-> Double.valueOf(Double.MAX_VALUE));
          assertThat(context().floatOutput()).isEqualTo(Float.valueOf(Float.POSITIVE_INFINITY));
        });

        it("converts the minimum double into a float value losing precision",()->{
          context().doubleInput(()-> Double.valueOf(Double.MIN_VALUE));
          assertThat(context().floatOutput()).isEqualTo(Float.valueOf(0f));
        });

        it("converts null to null",()->{
          assertThat(context().boxedDouble2BoxedFloat().apply(null)).isNull();
        });

      });

    });

  }
}