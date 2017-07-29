package ar.com.kfgodel.primitons.identity;

import ar.com.dgarcia.javaspec.api.JavaSpec;
import ar.com.dgarcia.javaspec.api.JavaSpecRunner;
import ar.com.kfgodel.primitons.PrimitonTestContext;
import ar.com.kfgodel.primitons.api.basic.Inton;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * This type verifies the identiy function
 * Date: 29/07/17 - 14:58
 */
@RunWith(JavaSpecRunner.class)
public class Int2IntTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a int to int primiton", () -> {
      context().int2int(()-> Inton::identity);

      describe("when used", () -> {
        context().intOutput(()-> context().int2int().apply(context().intInput()));

        it("returns same value as given",()->{
          context().intInput(()-> 8);
          assertThat(context().intOutput()).isEqualTo(8);
        });

      });
    });
  }
}