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
public class BoxedLong2DoubleTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a Long to double primiton", () -> {
      context().boxedLong2Double(()-> BoxedLongton::toDouble);

      describe("when used", () -> {
        context().doubleOutput(()-> context().boxedLong2Double().apply(context().longInput()));

        it("converts a Long into a primitive double",()->{
          context().longInput(()-> Long.valueOf(7689L));
          assertThat(context().doubleOutput()).isEqualTo(7689d);
        });

        it("converts the maximum long into a double value losing precision",()->{
          context().longInput(()-> Long.valueOf(Long.MAX_VALUE));
          assertThat(context().doubleOutput()).isEqualTo(9223372036854775807d); // High values of long lose precision converted to double
        });

        it("converts the minimum long into a double losing precision",()->{
          context().longInput(()-> Long.valueOf(Long.MIN_VALUE));
          assertThat(context().doubleOutput()).isEqualTo(-9.223372036854776E18d); // Very low values of long lose precision converted to double
        });

        itThrows(UnmappableException.class, "if value is null",()->{
          context().boxedLong2Double().apply(null);
        }, e ->{
          assertThat(e).hasMessage("Value[null] is not convertible to type [double]");
        });

      });

    });

  }
}