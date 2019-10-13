package ar.com.kfgodel.primitons.boxing;

import ar.com.kfgodel.primitons.PrimitonTestContext;
import ar.com.kfgodel.primitons.api.basic.Charton;
import info.kfgodel.jspek.api.JavaSpec;
import info.kfgodel.jspek.api.JavaSpecRunner;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Date: 05/08/17 - 18:11
 */
@RunWith(JavaSpecRunner.class)
public class CharToBoxedCharacterTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a char to Character primiton", () -> {
      context().char2boxedCharacter(()-> Charton::toBoxedCharacter);

      describe("when used", () -> {
        context().charOutput(()-> context().char2boxedCharacter().apply(context().charInput()));

        it("converts the primitive char into its object counterpart",()->{
          context().charInput(()-> 'a');
          assertThat(context().charOutput()).isEqualTo(Character.valueOf('a'));
        });

      });
    });

  }
}