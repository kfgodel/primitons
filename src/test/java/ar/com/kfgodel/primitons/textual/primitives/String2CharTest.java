package ar.com.kfgodel.primitons.textual.primitives;

import ar.com.dgarcia.javaspec.api.JavaSpec;
import ar.com.dgarcia.javaspec.api.JavaSpecRunner;
import ar.com.kfgodel.primitons.PrimitonTestContext;
import ar.com.kfgodel.primitons.api.basic.Strington;
import ar.com.kfgodel.primitons.api.exceptions.UnmappableException;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * This class verifies the conversion from a string to char
 * Date: 24/03/19 - 16:38
 */
@RunWith(JavaSpecRunner.class)
public class String2CharTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a String to char primiton", () -> {
      context().string2Char(()-> Strington::toChar);

      describe("when used", () -> {
        context().charOutput(()-> context().string2Char().apply(context().stringInput()));

        it("converts a String character into a primitive char",()->{
          context().stringInput(()-> "a");
          assertThat(context().charOutput()).isEqualTo('a');
        });

        itThrows(UnmappableException.class, "if string input has more than a single letter",()->{
          context().stringInput(()-> "ab");
          context().charOutput(); // Excercise
        }, e->{
          assertThat(e).hasMessage("Value[ab] is not convertible to type [char]");
        });

        itThrows(UnmappableException.class, "if string input is empty",()->{
          context().stringInput(()-> "");
          context().charOutput(); // Excercise
        }, e->{
          assertThat(e).hasMessage("Value[] is not convertible to type [char]");
        });

        itThrows(UnmappableException.class, "if the input is null",()->{
          context().stringInput(()-> null);
          context().charOutput(); // Excercise
        }, e->{
          assertThat(e).hasMessage("Value[null] is not convertible to type [char]");
        });

      });
    });
  }
}
