package ar.com.kfgodel.primitons.arraying;

import ar.com.dgarcia.javaspec.api.JavaSpec;
import ar.com.dgarcia.javaspec.api.JavaSpecRunner;
import ar.com.kfgodel.primitons.PrimitonTestContext;
import ar.com.kfgodel.primitons.api.boxed.BoxedCharacterton;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Verifies the basic conversions for basic to array conversion
 * Created by kfgodel on 30/12/17.
 */
@RunWith(JavaSpecRunner.class)
public class BoxedCharacter2ArrayOfBoxedCharacterTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a character to array of character primiton", () -> {
      context().boxedCharacter2ArrayOfBoxedCharacter(()-> BoxedCharacterton::toArray);

      describe("when used", () -> {
        context().boxedCharacterArrayOutput(()-> context().boxedCharacter2ArrayOfBoxedCharacter().apply(context().charInput()));

        it("converts the given character into an array containing that character",()->{
          context().charInput(()-> 'J');
          assertThat(context().boxedCharacterArrayOutput()).isEqualTo(new Character[]{'J'});
        });

      });

    });

  }
}