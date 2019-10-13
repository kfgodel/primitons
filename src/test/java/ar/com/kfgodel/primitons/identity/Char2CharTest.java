package ar.com.kfgodel.primitons.identity;

import ar.com.kfgodel.primitons.PrimitonTestContext;
import ar.com.kfgodel.primitons.api.basic.Charton;
import info.kfgodel.jspek.api.JavaSpec;
import info.kfgodel.jspek.api.JavaSpecRunner;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * This type verifies the identiy function
 * Date: 29/07/17 - 14:58
 */
@RunWith(JavaSpecRunner.class)
public class Char2CharTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a char to char primiton", () -> {
      context().char2char(()-> Charton::identity);

      describe("when used", () -> {
        context().charOutput(()-> context().char2char().apply(context().charInput()));

        it("returns same value as given",()->{
          context().charInput(()-> 'a');
          assertThat(context().charOutput()).isEqualTo('a');
        });

      });
    });
  }
}