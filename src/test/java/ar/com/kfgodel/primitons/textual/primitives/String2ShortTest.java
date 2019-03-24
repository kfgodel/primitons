package ar.com.kfgodel.primitons.textual.primitives;

import ar.com.dgarcia.javaspec.api.JavaSpec;
import ar.com.dgarcia.javaspec.api.JavaSpecRunner;
import ar.com.kfgodel.primitons.PrimitonTestContext;
import ar.com.kfgodel.primitons.api.basic.Strington;
import ar.com.kfgodel.primitons.api.exceptions.UnmappableException;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * This class verifies the conversion from a string to short
 * Date: 24/03/19 - 16:38
 */
@RunWith(JavaSpecRunner.class)
public class String2ShortTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a String to short primiton", () -> {
      context().string2Short(()-> Strington::toShort);

      describe("when used", () -> {
        context().shortOutput(()-> context().string2Short().apply(context().stringInput()));

        it("converts a String number into a primitive short",()->{
          context().stringInput(()-> "127");
          assertThat(context().shortOutput()).isEqualTo((short)127);
        });

        itThrows(UnmappableException.class, "if string input is not a number",()->{
          context().stringInput(()-> "NaN");
          context().shortOutput(); // Excercise
        }, e->{
          assertThat(e).hasMessage("Value[NaN] is not convertible to type [short]: For input string: \"NaN\"");
        });

        itThrows(UnmappableException.class, "if the string is bigger than short",()->{
          context().stringInput(()-> "32768");
          context().shortOutput(); // Excercise
        }, e->{
          assertThat(e).hasMessage("Value[32768] is not convertible to type [short]: Value out of range. Value:\"32768\" Radix:10");
        });

        itThrows(UnmappableException.class, "if the string is smaller than short",()->{
          context().stringInput(()-> "-32769");
          context().shortOutput(); // Excercise
        }, e->{
          assertThat(e).hasMessage("Value[-32769] is not convertible to type [short]: Value out of range. Value:\"-32769\" Radix:10");
        });

        itThrows(UnmappableException.class, "if the input is null",()->{
          context().stringInput(()-> null);
          context().shortOutput(); // Excercise
        }, e->{
          assertThat(e).hasMessage("Value[null] is not convertible to type [short]: null");
        });

      });
    });
  }
}
