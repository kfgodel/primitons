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
public class BoxedLong2BoxedDoubleTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a Long to Double primiton", () -> {
      context().boxedLong2BoxedDouble(()-> BoxedLongton::toBoxedDouble);

      describe("when used", () -> {
        context().doubleOutput(()-> context().boxedLong2BoxedDouble().apply(context().longInput()));

        it("converts a Long into a Double",()->{
          context().longInput(()-> Long.valueOf(65L));
          assertThat(context().doubleOutput()).isEqualTo(Double.valueOf(65d));
        });

        it("converts the maximum long into a double value losing precision",()->{
          context().longInput(()-> Long.valueOf(Long.MAX_VALUE));
          assertThat(context().doubleOutput()).isEqualTo(Double.valueOf(9223372036854775807d)); // High values of long lose precision converted to double
        });

        it("converts the minimum long into a double losing precision",()->{
          context().longInput(()-> Long.valueOf(Long.MIN_VALUE));
          assertThat(context().doubleOutput()).isEqualTo(Double.valueOf(-9.223372036854776E18d)); // Very low values of long lose precision converted to double
        });

        it("converts null to null",()->{
          assertThat(context().boxedLong2BoxedDouble().apply(null)).isNull();
        });

      });

    });

  }
}