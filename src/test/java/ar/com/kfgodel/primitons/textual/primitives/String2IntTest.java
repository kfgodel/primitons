package ar.com.kfgodel.primitons.textual.primitives;

import ar.com.kfgodel.primitons.PrimitonTestContext;
import ar.com.kfgodel.primitons.api.basic.Strington;
import ar.com.kfgodel.primitons.api.exceptions.UnmappableException;
import info.kfgodel.jspek.api.JavaSpec;
import info.kfgodel.jspek.api.JavaSpecRunner;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * This class verifies the conversion from a string to int
 * Date: 24/03/19 - 16:38
 */
@RunWith(JavaSpecRunner.class)
public class String2IntTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a String to int primiton", () -> {
      context().string2Int(()-> Strington::toInt);

      describe("when used", () -> {
        context().intOutput(()-> context().string2Int().apply(context().stringInput()));

        it("converts a String number into a primitive int",()->{
          context().stringInput(()-> "127");
          assertThat(context().intOutput()).isEqualTo(127);
        });

        itThrows(UnmappableException.class, "if string input is not a number",()->{
          context().stringInput(()-> "NaN");
          context().intOutput(); // Excercise
        }, e->{
          assertThat(e).hasMessage("Value[NaN] is not convertible to type [int]: For input string: \"NaN\"");
        });

        itThrows(UnmappableException.class, "if the string is bigger than int",()->{
          context().stringInput(()-> "2147483648");
          context().intOutput(); // Excercise
        }, e->{
          assertThat(e).hasMessage("Value[2147483648] is not convertible to type [int]: For input string: \"2147483648\"");
        });

        itThrows(UnmappableException.class, "if the string is smaller than int",()->{
          context().stringInput(()-> "-2147483649");
          context().intOutput(); // Excercise
        }, e->{
          assertThat(e).hasMessage("Value[-2147483649] is not convertible to type [int]: For input string: \"-2147483649\"");
        });

        itThrows(UnmappableException.class, "if the input is null",()->{
          context().stringInput(()-> null);
          context().intOutput(); // Excercise
        }, e->{
          assertThat(e).hasMessage("Value[null] is not convertible to type [int]: null");
        });

      });
    });
  }
}
