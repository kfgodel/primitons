package ar.com.kfgodel.primitons.arraying;

import ar.com.kfgodel.primitons.PrimitonTestContext;
import ar.com.kfgodel.primitons.api.basic.Charton;
import info.kfgodel.jspek.api.JavaSpec;
import info.kfgodel.jspek.api.JavaSpecRunner;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Verifies the basic conversions for basic to array conversion
 * Created by kfgodel on 30/12/17.
 */
@RunWith(JavaSpecRunner.class)
public class Char2ArrayOfCharTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a char to array of char primiton", () -> {
      context().char2ArrayOfChar(()-> Charton::toArray);

      describe("when used", () -> {
        context().charArrayOutput(()-> context().char2ArrayOfChar().apply(context().charInput()));

        it("converts the given value into an array containing that value",()->{
          context().charInput(()-> 'a');
          assertThat(context().charArrayOutput()).isEqualTo(new char[]{'a'});
        });

      });

    });

  }
}