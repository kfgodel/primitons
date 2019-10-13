package ar.com.kfgodel.primitons.textual.boxed;

import ar.com.kfgodel.primitons.PrimitonTestContext;
import ar.com.kfgodel.primitons.api.basic.Strington;
import ar.com.kfgodel.primitons.api.exceptions.UnmappableException;
import info.kfgodel.jspek.api.JavaSpec;
import info.kfgodel.jspek.api.JavaSpecRunner;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * This class verifies the conversion from a string to Long
 * Date: 24/03/19 - 16:38
 */
@RunWith(JavaSpecRunner.class)
public class String2BoxedLongTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a String to Long primiton", () -> {
      context().string2BoxedLong(()-> Strington::toBoxedLong);

      describe("when used", () -> {
        context().longOutput(()-> context().string2BoxedLong().apply(context().stringInput()));

        it("converts a String number into a Long",()->{
          context().stringInput(()-> "127");
          assertThat(context().longOutput()).isEqualTo(Long.valueOf(127L));
        });

        itThrows(UnmappableException.class, "if string input is not a number",()->{
          context().stringInput(()-> "NaN");
          context().longOutput(); // Excercise
        }, e->{
          assertThat(e).hasMessage("Value[NaN] is not convertible to type [class java.lang.Long]: For input string: \"NaN\"");
        });

        itThrows(UnmappableException.class, "if the string is bigger than long",()->{
          context().stringInput(()-> "9223372036854775808");
          context().longOutput(); // Excercise
        }, e->{
          assertThat(e).hasMessage("Value[9223372036854775808] is not convertible to type [class java.lang.Long]: For input string: \"9223372036854775808\"");
        });

        itThrows(UnmappableException.class, "if the string is smaller than long",()->{
          context().stringInput(()-> "-9223372036854775809");
          context().longOutput(); // Excercise
        }, e->{
          assertThat(e).hasMessage("Value[-9223372036854775809] is not convertible to type [class java.lang.Long]: For input string: \"-9223372036854775809\"");
        });

        it("converts 'null' into null",()->{
          context().stringInput(()-> "null");
          assertThat(context().longOutput()).isNull();
        });
        it("converts null into null",()->{
          context().stringInput(()-> null);
          assertThat(context().longOutput()).isNull();
        });

      });
    });
  }
}
