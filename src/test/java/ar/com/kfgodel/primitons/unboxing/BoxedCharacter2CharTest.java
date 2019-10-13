package ar.com.kfgodel.primitons.unboxing;

import ar.com.kfgodel.primitons.PrimitonTestContext;
import ar.com.kfgodel.primitons.api.boxed.BoxedCharacterton;
import ar.com.kfgodel.primitons.api.exceptions.UnmappableException;
import info.kfgodel.jspek.api.JavaSpec;
import info.kfgodel.jspek.api.JavaSpecRunner;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Verifies the basic conversions for object to primitive conversion
 * Created by kfgodel on 23/07/17.
 */
@RunWith(JavaSpecRunner.class)
public class BoxedCharacter2CharTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a Character to char primiton", () -> {
      context().boxedCharacter2Char(()-> BoxedCharacterton::toChar);

      describe("when used", () -> {
        context().charOutput(()-> context().boxedCharacter2Char().apply(context().charInput()));

        it("converts the object to its primitive counterpart",()->{
          context().charInput(()-> Character.valueOf('d'));
          assertThat(context().charOutput()).isEqualTo('d');
        });

        itThrows(UnmappableException.class, "if value is null",()->{
          context().boxedCharacter2Char().apply(null);
        }, e ->{
          assertThat(e).hasMessage("Value[null] is not convertible to type [char]");
        });

      });

    });

  }
}