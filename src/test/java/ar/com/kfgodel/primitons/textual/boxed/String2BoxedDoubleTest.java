package ar.com.kfgodel.primitons.textual.boxed;

import ar.com.kfgodel.primitons.PrimitonTestContext;
import ar.com.kfgodel.primitons.api.basic.Strington;
import ar.com.kfgodel.primitons.api.exceptions.UnmappableException;
import info.kfgodel.jspek.api.JavaSpec;
import info.kfgodel.jspek.api.JavaSpecRunner;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * This class verifies the conversion from a string to Double
 * Date: 24/03/19 - 16:38
 */
@RunWith(JavaSpecRunner.class)
public class String2BoxedDoubleTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a String to Double primiton", () -> {
      context().string2BoxedDouble(()-> Strington::toBoxedDouble);

      describe("when used", () -> {
        context().doubleOutput(()-> context().string2BoxedDouble().apply(context().stringInput()));

        it("converts a String number into a Double",()->{
          context().stringInput(()-> "12.34");
          assertThat(context().doubleOutput()).isEqualTo(Double.valueOf(12.34));
        });

        it("converts 'Nan' to its value",()->{
          context().stringInput(()-> "NaN");
          assertThat(context().doubleOutput()).isEqualTo(Double.valueOf(Double.NaN));
        });

        itThrows(UnmappableException.class, "if string input is not a number",()->{
          context().stringInput(()-> "not a number");
          context().doubleOutput(); // Excercise
        }, e->{
          assertThat(e).hasMessage("Value[not a number] is not convertible to type [class java.lang.Double]: For input string: \"not a number\"");
        });

        it("converts a string bigger than the maximum representable number into an infinity",()->{
          context().stringInput(()-> Double.MAX_VALUE + "1");
          assertThat(context().doubleOutput()).isEqualTo(Double.valueOf(Double.POSITIVE_INFINITY));
        });

        it("converts a string smaller than the minimum representable number into 0",()->{
          context().stringInput(()-> Double.MIN_VALUE + "1");
          assertThat(context().doubleOutput()).isEqualTo(Double.valueOf(0.0));
        });

        it("converts 'null' into null",()->{
          context().stringInput(()-> "null");
          assertThat(context().doubleOutput()).isNull();
        });
        it("converts null into null",()->{
          context().stringInput(()-> null);
          assertThat(context().doubleOutput()).isNull();
        });

      });
    });
  }
}
