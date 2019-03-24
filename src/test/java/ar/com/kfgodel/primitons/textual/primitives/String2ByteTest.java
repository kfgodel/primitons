package ar.com.kfgodel.primitons.textual.primitives;

import ar.com.dgarcia.javaspec.api.JavaSpec;
import ar.com.dgarcia.javaspec.api.JavaSpecRunner;
import ar.com.kfgodel.primitons.PrimitonTestContext;
import ar.com.kfgodel.primitons.api.basic.Strington;
import ar.com.kfgodel.primitons.api.exceptions.UnmappableException;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * This class verifies the conversion from a string to byte
 * Date: 24/03/19 - 16:38
 */
@RunWith(JavaSpecRunner.class)
public class String2ByteTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a String to byte primiton", () -> {
      context().string2Byte(()-> Strington::toByte);

      describe("when used", () -> {
        context().byteOutput(()-> context().string2Byte().apply(context().stringInput()));

        it("converts a String number into a primitive byte",()->{
          context().stringInput(()-> "127");
          assertThat(context().byteOutput()).isEqualTo((byte)127);
        });

        itThrows(UnmappableException.class, "if string input is not a number",()->{
          context().stringInput(()-> "NaN");
          context().byteOutput(); // Excercise
        }, e->{
          assertThat(e).hasMessage("Value[NaN] is not convertible to type [byte]: For input string: \"NaN\"");
        });

        itThrows(UnmappableException.class, "if the string is bigger than byte",()->{
          context().stringInput(()-> "128");
          context().byteOutput(); // Excercise
        }, e->{
          assertThat(e).hasMessage("Value[128] is not convertible to type [byte]: Value out of range. Value:\"128\" Radix:10");
        });

        itThrows(UnmappableException.class, "if the string is smaller than byte",()->{
          context().stringInput(()-> "-129");
          context().byteOutput(); // Excercise
        }, e->{
          assertThat(e).hasMessage("Value[-129] is not convertible to type [byte]: Value out of range. Value:\"-129\" Radix:10");
        });

        itThrows(UnmappableException.class, "if the input is null",()->{
          context().stringInput(()-> null);
          context().byteOutput(); // Excercise
        }, e->{
          assertThat(e).hasMessage("Value[null] is not convertible to type [byte]: null");
        });

      });
    });
  }
}
