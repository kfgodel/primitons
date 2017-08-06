package ar.com.kfgodel.primitons.numeric.numbers;

import ar.com.dgarcia.javaspec.api.JavaSpec;
import ar.com.dgarcia.javaspec.api.JavaSpecRunner;
import ar.com.kfgodel.primitons.PrimitonTestContext;
import ar.com.kfgodel.primitons.api.boxed.BoxedLongton;
import ar.com.kfgodel.primitons.api.exceptions.UnmappableException;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * This type verifies the behavior of a numeric conversion
 * Date: 01/08/17 - 20:22
 */
@RunWith(JavaSpecRunner.class)
public class BoxedLong2FloatTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a Long to float primiton", () -> {
      context().boxedLong2Float(()-> BoxedLongton::toFloat);

      describe("when used", () -> {
        context().floatOutput(()-> context().boxedLong2Float().apply(context().longInput()));

        it("converts a Long into a primitive float",()->{
          context().longInput(()-> Long.valueOf(45));
          assertThat(context().floatOutput()).isEqualTo(45f);
        });

        it("converts the maximum long into a float value losing precision",()->{
          context().longInput(()-> Long.valueOf(Long.MAX_VALUE));
          assertThat(context().floatOutput()).isEqualTo(9.223372E18f); // High values of long lose precision converted to float
        });

        it("converts the minimum long into a float value losing precision",()->{
          context().longInput(()-> Long.valueOf(Long.MIN_VALUE));
          assertThat(context().floatOutput()).isEqualTo(-9.223372E18f); // Very low values of long lose precision converted to float
        });

        itThrows(UnmappableException.class, "if value is null",()->{
          context().boxedLong2Float().apply(null);
        }, e ->{
          assertThat(e).hasMessage("Value[null] is not convertible to type [float]");
        });

      });

    });

  }
}