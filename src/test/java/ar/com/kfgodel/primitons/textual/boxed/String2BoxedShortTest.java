package ar.com.kfgodel.primitons.textual.boxed;

import ar.com.kfgodel.primitons.PrimitonTestContext;
import ar.com.kfgodel.primitons.api.basic.Strington;
import ar.com.kfgodel.primitons.api.exceptions.UnmappableException;
import info.kfgodel.jspek.api.JavaSpec;
import info.kfgodel.jspek.api.JavaSpecRunner;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * This class verifies the conversion from a string to Short
 * Date: 24/03/19 - 16:38
 */
@RunWith(JavaSpecRunner.class)
public class String2BoxedShortTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a String to Short primiton", () -> {
      context().string2BoxedShort(()-> Strington::toBoxedShort);

      describe("when used", () -> {
        context().shortOutput(()-> context().string2BoxedShort().apply(context().stringInput()));

        it("converts a String number into a Short",()->{
          context().stringInput(()-> "127");
          assertThat(context().shortOutput()).isEqualTo(Short.valueOf((short)127));
        });

        itThrows(UnmappableException.class, "if string input is not a number",()->{
          context().stringInput(()-> "NaN");
          context().shortOutput(); // Excercise
        }, e->{
          assertThat(e).hasMessage("Value[NaN] is not convertible to type [class java.lang.Short]: For input string: \"NaN\"");
        });

        itThrows(UnmappableException.class, "if the string is bigger than short",()->{
          context().stringInput(()-> "32768");
          context().shortOutput(); // Excercise
        }, e->{
          assertThat(e).hasMessage("Value[32768] is not convertible to type [class java.lang.Short]: Value out of range. Value:\"32768\" Radix:10");
        });

        itThrows(UnmappableException.class, "if the string is smaller than short",()->{
          context().stringInput(()-> "-32769");
          context().shortOutput(); // Excercise
        }, e->{
          assertThat(e).hasMessage("Value[-32769] is not convertible to type [class java.lang.Short]: Value out of range. Value:\"-32769\" Radix:10");
        });

        it("converts 'null' into null",()->{
          context().stringInput(()-> "null");
          assertThat(context().shortOutput()).isNull();
        });
        it("converts null into null",()->{
          context().stringInput(()-> null);
          assertThat(context().shortOutput()).isNull();
        });

      });
    });
  }
}
