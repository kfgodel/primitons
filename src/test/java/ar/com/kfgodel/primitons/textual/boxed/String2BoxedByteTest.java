package ar.com.kfgodel.primitons.textual.boxed;

import ar.com.kfgodel.primitons.PrimitonTestContext;
import ar.com.kfgodel.primitons.api.basic.Strington;
import ar.com.kfgodel.primitons.api.exceptions.UnmappableException;
import info.kfgodel.jspek.api.JavaSpec;
import info.kfgodel.jspek.api.JavaSpecRunner;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * This class verifies the conversion from a string to Byte
 * Date: 24/03/19 - 16:38
 */
@RunWith(JavaSpecRunner.class)
public class String2BoxedByteTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a String to Byte primiton", () -> {
      context().string2BoxedByte(()-> Strington::toBoxedByte);

      describe("when used", () -> {
        context().byteOutput(()-> context().string2BoxedByte().apply(context().stringInput()));

        it("converts a String number into a Byte",()->{
          context().stringInput(()-> "127");
          assertThat(context().byteOutput()).isEqualTo(Byte.valueOf((byte)127));
        });

        itThrows(UnmappableException.class, "if string input is not a number",()->{
          context().stringInput(()-> "NaN");
          context().byteOutput(); // Excercise
        }, e->{
          assertThat(e).hasMessage("Value[NaN] is not convertible to type [class java.lang.Byte]: For input string: \"NaN\"");
        });

        itThrows(UnmappableException.class, "if the string is bigger than byte",()->{
          context().stringInput(()-> "128");
          context().byteOutput(); // Excercise
        }, e->{
          assertThat(e).hasMessage("Value[128] is not convertible to type [class java.lang.Byte]: Value out of range. Value:\"128\" Radix:10");
        });

        itThrows(UnmappableException.class, "if the string is smaller than byte",()->{
          context().stringInput(()-> "-129");
          context().byteOutput(); // Excercise
        }, e->{
          assertThat(e).hasMessage("Value[-129] is not convertible to type [class java.lang.Byte]: Value out of range. Value:\"-129\" Radix:10");
        });

        it("converts 'null' into null",()->{
          context().stringInput(()-> "null");
          assertThat(context().byteOutput()).isNull();
        });
        it("converts null into null",()->{
          context().stringInput(()-> null);
          assertThat(context().byteOutput()).isNull();
        });

      });
    });
  }
}
