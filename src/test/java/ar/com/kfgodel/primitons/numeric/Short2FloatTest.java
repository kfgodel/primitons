package ar.com.kfgodel.primitons.numeric;

import ar.com.kfgodel.primitons.PrimitonTestContext;
import ar.com.kfgodel.primitons.api.basic.Shorton;
import info.kfgodel.jspek.api.JavaSpec;
import info.kfgodel.jspek.api.JavaSpecRunner;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * This type verifies the behavior of a numeric conversion
 * Date: 01/08/17 - 20:22
 */
@RunWith(JavaSpecRunner.class)
public class Short2FloatTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a short to float primiton", () -> {
      context().short2float(()-> Shorton::toFloat);

      describe("when used", () -> {
        context().floatOutput(()-> context().short2float().apply(context().shortInput()));

        it("converts a primitive short into a primitive float",()->{
          context().shortInput(()-> (short)32);
          assertThat(context().floatOutput()).isEqualTo(32f);
        });

        it("converts the maximum short into an float value",()->{
          context().shortInput(()-> Short.MAX_VALUE);
          assertThat(context().floatOutput()).isEqualTo(32767f);
        });

        it("converts the minimum short into an float",()->{
          context().shortInput(()-> Short.MIN_VALUE);
          assertThat(context().floatOutput()).isEqualTo(-32768f);
        });

      });

    });

  }
}