package ar.com.kfgodel.primitons.identity;

import ar.com.dgarcia.javaspec.api.JavaSpec;
import ar.com.dgarcia.javaspec.api.JavaSpecRunner;
import ar.com.kfgodel.primitons.PrimitonTestContext;
import ar.com.kfgodel.primitons.api.basic.Shorton;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * This type verifies the identiy function
 * Date: 29/07/17 - 14:58
 */
@RunWith(JavaSpecRunner.class)
public class Short2ShortTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a short to short primiton", () -> {
      context().short2short(()-> Shorton::identity);

      describe("when used", () -> {
        context().shortOutput(()-> context().short2short().apply(context().shortInput()));

        it("returns same value as given",()->{
          context().shortInput(()-> (short)5);
          assertThat(context().shortOutput()).isEqualTo((short)5);
        });

      });
    });
  }
}