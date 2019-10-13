package ar.com.kfgodel.primitons.identity;

import ar.com.kfgodel.primitons.PrimitonTestContext;
import ar.com.kfgodel.primitons.api.basic.Longton;
import info.kfgodel.jspek.api.JavaSpec;
import info.kfgodel.jspek.api.JavaSpecRunner;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * This type verifies the identiy function
 * Date: 29/07/17 - 14:58
 */
@RunWith(JavaSpecRunner.class)
public class Long2LongTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a long to long primiton", () -> {
      context().long2long(()-> Longton::identity);

      describe("when used", () -> {
        context().longOutput(()-> context().long2long().apply(context().longInput()));

        it("returns same value as given",()->{
          context().longInput(()-> 7L);
          assertThat(context().longOutput()).isEqualTo(7L);
        });

      });
    });
  }
}