package ar.com.kfgodel.primitons.textual.boxed;

import ar.com.kfgodel.primitons.PrimitonTestContext;
import ar.com.kfgodel.primitons.api.basic.Strington;
import ar.com.kfgodel.primitons.api.exceptions.UnmappableException;
import info.kfgodel.jspek.api.JavaSpec;
import info.kfgodel.jspek.api.JavaSpecRunner;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * This class verifies the conversion from a string to Integer
 * Date: 24/03/19 - 16:38
 */
@RunWith(JavaSpecRunner.class)
public class String2BoxedIntegerTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a String to Integer primiton", () -> {
      context().string2BoxedInteger(()-> Strington::toBoxedInteger);

      describe("when used", () -> {
        context().intOutput(()-> context().string2BoxedInteger().apply(context().stringInput()));

        it("converts a String number into an Integer",()->{
          context().stringInput(()-> "127");
          assertThat(context().intOutput()).isEqualTo(Integer.valueOf(127));
        });

        itThrows(UnmappableException.class, "if string input is not a number",()->{
          context().stringInput(()-> "NaN");
          context().intOutput(); // Excercise
        }, e->{
          assertThat(e).hasMessage("Value[NaN] is not convertible to type [class java.lang.Integer]: For input string: \"NaN\"");
        });

        itThrows(UnmappableException.class, "if the string is bigger than int",()->{
          context().stringInput(()-> "2147483648");
          context().intOutput(); // Excercise
        }, e->{
          assertThat(e).hasMessage("Value[2147483648] is not convertible to type [class java.lang.Integer]: For input string: \"2147483648\"");
        });

        itThrows(UnmappableException.class, "if the string is smaller than int",()->{
          context().stringInput(()-> "-2147483649");
          context().intOutput(); // Excercise
        }, e->{
          assertThat(e).hasMessage("Value[-2147483649] is not convertible to type [class java.lang.Integer]: For input string: \"-2147483649\"");
        });

        it("converts 'null' into null",()->{
          context().stringInput(()-> "null");
          assertThat(context().intOutput()).isNull();
        });
        it("converts null into null",()->{
          context().stringInput(()-> null);
          assertThat(context().intOutput()).isNull();
        });

      });
    });
  }
}
