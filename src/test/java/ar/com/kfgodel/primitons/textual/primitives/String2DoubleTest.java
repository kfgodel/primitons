package ar.com.kfgodel.primitons.textual.primitives;

import ar.com.kfgodel.primitons.PrimitonTestContext;
import ar.com.kfgodel.primitons.api.basic.Strington;
import ar.com.kfgodel.primitons.api.exceptions.UnmappableException;
import info.kfgodel.jspek.api.JavaSpec;
import info.kfgodel.jspek.api.JavaSpecRunner;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * This class verifies the conversion from a string to double
 * Date: 24/03/19 - 16:38
 */
@RunWith(JavaSpecRunner.class)
public class String2DoubleTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a String to double primiton", () -> {
      context().string2Double(()-> Strington::toDouble);

      describe("when used", () -> {
        context().doubleOutput(()-> context().string2Double().apply(context().stringInput()));

        it("converts a String number into a primitive double",()->{
          context().stringInput(()-> "12.34");
          assertThat(context().doubleOutput()).isEqualTo(12.34);
        });

        it("converts 'Nan' to its value",()->{
          context().stringInput(()-> "NaN");
          assertThat(context().doubleOutput()).isEqualTo(Double.NaN);
        });

        itThrows(UnmappableException.class, "if string input is not a number",()->{
          context().stringInput(()-> "not a number");
          context().doubleOutput(); // Excercise
        }, e->{
          assertThat(e).hasMessage("Value[not a number] is not convertible to type [double]: For input string: \"not a number\"");
        });

        it("converts a string bigger than the maximum representable number into an infinity",()->{
          context().stringInput(()-> Double.MAX_VALUE + "1");
          assertThat(context().doubleOutput()).isEqualTo(Double.POSITIVE_INFINITY);
        });

        it("converts a string smaller than the minimum representable number into 0",()->{
          context().stringInput(()-> Double.MIN_VALUE + "1");
          assertThat(context().doubleOutput()).isEqualTo(0.0);
        });

        itThrows(UnmappableException.class, "if the input is null",()->{
          context().stringInput(()-> null);
          context().doubleOutput(); // Excercise
        }, e->{
          assertThat(e).hasMessage("Value[null] is not convertible to type [double]: null");
        });

      });
    });
  }
}
