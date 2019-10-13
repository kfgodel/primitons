package ar.com.kfgodel.primitons.numeric.unboxing;

import ar.com.kfgodel.primitons.PrimitonTestContext;
import ar.com.kfgodel.primitons.api.boxed.BoxedDoubleton;
import ar.com.kfgodel.primitons.api.exceptions.UnmappableException;
import info.kfgodel.jspek.api.JavaSpec;
import info.kfgodel.jspek.api.JavaSpecRunner;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * This type verifies the behavior of a numeric conversion
 * Date: 01/08/17 - 20:22
 */
@RunWith(JavaSpecRunner.class)
public class BoxedDouble2FloatTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a Double to float primiton", () -> {
      context().boxedDouble2Float(()-> BoxedDoubleton::toFloat);

      describe("when used", () -> {
        context().floatOutput(()-> context().boxedDouble2Float().apply(context().doubleInput()));

        it("converts a Double into a primitive float",()->{
          context().doubleInput(()-> Double.valueOf(2.5d));
          assertThat(context().floatOutput()).isEqualTo(2.5f);
        });

        it("converts the maximum float value without truncation",()->{
          context().doubleInput(()-> Double.valueOf(0x1.fffffeP+127d));
          assertThat(context().floatOutput()).isEqualTo(Float.MAX_VALUE);
        });

        it("converts the minimum byte value without truncation",()->{
          context().doubleInput(()-> Double.valueOf(0x0.000002P-126));
          assertThat(context().floatOutput()).isEqualTo(Float.MIN_VALUE);
        });

        it("converts the maximum double into a float value losing precision",()->{
          context().doubleInput(()-> Double.valueOf(Double.MAX_VALUE));
          assertThat(context().floatOutput()).isEqualTo(Float.POSITIVE_INFINITY);
        });

        it("converts the minimum double into a float value losing precision",()->{
          context().doubleInput(()-> Double.valueOf(Double.MIN_VALUE));
          assertThat(context().floatOutput()).isEqualTo(0f);
        });

        itThrows(UnmappableException.class, "if value is null",()->{
          context().boxedDouble2Float().apply(null);
        }, e ->{
          assertThat(e).hasMessage("Value[null] is not convertible to type [float]");
        });

      });

    });

  }
}