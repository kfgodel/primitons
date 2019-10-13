package ar.com.kfgodel.primitons.textual.primitives;

import ar.com.kfgodel.primitons.PrimitonTestContext;
import ar.com.kfgodel.primitons.api.basic.Strington;
import ar.com.kfgodel.primitons.api.exceptions.UnmappableException;
import info.kfgodel.jspek.api.JavaSpec;
import info.kfgodel.jspek.api.JavaSpecRunner;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * This class verifies the conversion from a string to long
 * Date: 24/03/19 - 16:38
 */
@RunWith(JavaSpecRunner.class)
public class String2LongTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a String to long primiton", () -> {
      context().string2Long(()-> Strington::toLong);

      describe("when used", () -> {
        context().longOutput(()-> context().string2Long().apply(context().stringInput()));

        it("converts a String number into a primitive long",()->{
          context().stringInput(()-> "127");
          assertThat(context().longOutput()).isEqualTo(127L);
        });

        itThrows(UnmappableException.class, "if string input is not a number",()->{
          context().stringInput(()-> "NaN");
          context().longOutput(); // Excercise
        }, e->{
          assertThat(e).hasMessage("Value[NaN] is not convertible to type [long]: For input string: \"NaN\"");
        });

        itThrows(UnmappableException.class, "if the string is bigger than long",()->{
          context().stringInput(()-> "9223372036854775808");
          context().longOutput(); // Excercise
        }, e->{
          assertThat(e).hasMessage("Value[9223372036854775808] is not convertible to type [long]: For input string: \"9223372036854775808\"");
        });

        itThrows(UnmappableException.class, "if the string is smaller than long",()->{
          context().stringInput(()-> "-9223372036854775809");
          context().longOutput(); // Excercise
        }, e->{
          assertThat(e).hasMessage("Value[-9223372036854775809] is not convertible to type [long]: For input string: \"-9223372036854775809\"");
        });

        itThrows(UnmappableException.class, "if the input is null",()->{
          context().stringInput(()-> null);
          context().longOutput(); // Excercise
        }, e->{
          assertThat(e).hasMessage("Value[null] is not convertible to type [long]: null");
        });

      });
    });
  }
}
