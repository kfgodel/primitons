package ar.com.kfgodel.primitons.identity;

import ar.com.kfgodel.primitons.PrimitonTestContext;
import ar.com.kfgodel.primitons.api.basic.Floaton;
import info.kfgodel.jspek.api.JavaSpec;
import info.kfgodel.jspek.api.JavaSpecRunner;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * This type verifies the identiy function
 * Date: 29/07/17 - 14:58
 */
@RunWith(JavaSpecRunner.class)
public class Float2FloatTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a float to float primiton", () -> {
      context().float2float(()-> Floaton::identity);

      describe("when used", () -> {
        context().floatOutput(()-> context().float2float().apply(context().floatInput()));

        it("returns same value as given",()->{
          context().floatInput(()-> 2.5f);
          assertThat(context().floatOutput()).isEqualTo(2.5f);
        });

      });
    });
  }
}