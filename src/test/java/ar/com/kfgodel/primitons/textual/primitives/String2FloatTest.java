package ar.com.kfgodel.primitons.textual.primitives;

import ar.com.dgarcia.javaspec.api.JavaSpec;
import ar.com.dgarcia.javaspec.api.JavaSpecRunner;
import ar.com.kfgodel.primitons.PrimitonTestContext;
import ar.com.kfgodel.primitons.api.basic.Strington;
import ar.com.kfgodel.primitons.api.exceptions.UnmappableException;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * This class verifies the conversion from a string to float
 * Date: 24/03/19 - 16:38
 */
@RunWith(JavaSpecRunner.class)
public class String2FloatTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a String to float primiton", () -> {
      context().string2Float(()-> Strington::toFloat);

      describe("when used", () -> {
        context().floatOutput(()-> context().string2Float().apply(context().stringInput()));

        it("converts a String number into a primitive float",()->{
          context().stringInput(()-> "12.34");
          assertThat(context().floatOutput()).isEqualTo(12.34f);
        });

        it("converts 'Nan' to its value",()->{
          context().stringInput(()-> "NaN");
          assertThat(context().floatOutput()).isEqualTo(Float.NaN);
        });

        itThrows(UnmappableException.class, "if string input is not a number",()->{
          context().stringInput(()-> "not a number");
          context().floatOutput(); // Excercise
        }, e->{
          assertThat(e).hasMessage("Value[not a number] is not convertible to type [float]: For input string: \"not a number\"");
        });

        it("converts a string bigger than the maximum representable number into an infinity",()->{
          context().stringInput(()-> Float.MAX_VALUE + "1");
          assertThat(context().floatOutput()).isEqualTo(Float.POSITIVE_INFINITY);
        });

        it("converts a string smaller than the minimum representable number into 0",()->{
          context().stringInput(()-> Float.MIN_VALUE + "1");
          assertThat(context().floatOutput()).isEqualTo(0.0f);
        });

        itThrows(UnmappableException.class, "if the input is null",()->{
          context().stringInput(()-> null);
          context().floatOutput(); // Excercise
        }, e->{
          assertThat(e).hasMessage("Value[null] is not convertible to type [float]: null");
        });

      });
    });
  }
}
