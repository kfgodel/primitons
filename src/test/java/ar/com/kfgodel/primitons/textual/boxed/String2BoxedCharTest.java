package ar.com.kfgodel.primitons.textual.boxed;

import ar.com.kfgodel.primitons.PrimitonTestContext;
import ar.com.kfgodel.primitons.api.basic.Strington;
import ar.com.kfgodel.primitons.api.exceptions.UnmappableException;
import info.kfgodel.jspek.api.JavaSpec;
import info.kfgodel.jspek.api.JavaSpecRunner;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * This class verifies the conversion from a string to Character
 * Date: 24/03/19 - 16:38
 */
@RunWith(JavaSpecRunner.class)
public class String2BoxedCharTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a String to Character primiton", () -> {
      context().string2BoxedCharacter(()-> Strington::toBoxedCharacter);

      describe("when used", () -> {
        context().charOutput(()-> context().string2BoxedCharacter().apply(context().stringInput()));

        it("converts a String character into a Character",()->{
          context().stringInput(()-> "a");
          assertThat(context().charOutput()).isEqualTo(Character.valueOf('a'));
        });

        itThrows(UnmappableException.class, "if string input has more than a single letter",()->{
          context().stringInput(()-> "ab");
          context().charOutput(); // Excercise
        }, e->{
          assertThat(e).hasMessage("Value[ab] is not convertible to type [class java.lang.Character]");
        });

        itThrows(UnmappableException.class, "if string input is empty",()->{
          context().stringInput(()-> "");
          context().charOutput(); // Excercise
        }, e->{
          assertThat(e).hasMessage("Value[] is not convertible to type [class java.lang.Character]");
        });

        it("converts 'null' into null",()->{
          context().stringInput(()-> "null");
          assertThat(context().charOutput()).isNull();
        });
        it("converts null into null",()->{
          context().stringInput(()-> null);
          assertThat(context().charOutput()).isNull();
        });

      });
    });
  }
}
