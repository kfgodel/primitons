package ar.com.kfgodel.primitons.numeric.interboxing;

import ar.com.kfgodel.primitons.PrimitonTestContext;
import ar.com.kfgodel.primitons.api.boxed.BoxedLongton;
import info.kfgodel.jspek.api.JavaSpec;
import info.kfgodel.jspek.api.JavaSpecRunner;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * This type verifies the behavior of a numeric conversion
 * Date: 01/08/17 - 20:22
 */
@RunWith(JavaSpecRunner.class)
public class BoxedLong2BoxedFloatTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a Long to Float primiton", () -> {
      context().boxedLong2BoxedFloat(()-> BoxedLongton::toBoxedFloat);

      describe("when used", () -> {
        context().floatOutput(()-> context().boxedLong2BoxedFloat().apply(context().longInput()));

        it("converts a Long into a Float",()->{
          context().longInput(()-> Long.valueOf(1200L));
          assertThat(context().floatOutput()).isEqualTo(Float.valueOf(1200f));
        });

        it("converts the maximum long into a float value losing precision",()->{
          context().longInput(()-> Long.valueOf(Long.MAX_VALUE));
          assertThat(context().floatOutput()).isEqualTo(Float.valueOf(9.223372E18f)); // High values of long lose precision converted to float
        });

        it("converts the minimum long into a float value losing precision",()->{
          context().longInput(()-> Long.valueOf(Long.MIN_VALUE));
          assertThat(context().floatOutput()).isEqualTo(Float.valueOf(-9.223372E18f)); // Very low values of long lose precision converted to float
        });

        it("converts null to null",()->{
          assertThat(context().boxedLong2BoxedFloat().apply(null)).isNull();
        });

      });

    });

  }
}