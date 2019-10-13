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
public class Short2DoubleTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a short to double primiton", () -> {
      context().short2double(()-> Shorton::toDouble);

      describe("when used", () -> {
        context().doubleOutput(()-> context().short2double().apply(context().shortInput()));

        it("converts a primitive short into a primitive double",()->{
          context().shortInput(()-> (short)54);
          assertThat(context().doubleOutput()).isEqualTo(54d);
        });

        it("converts the maximum short into a double value",()->{
          context().shortInput(()-> Short.MAX_VALUE);
          assertThat(context().doubleOutput()).isEqualTo(32767d);
        });

        it("converts the minimum short into a double",()->{
          context().shortInput(()-> Short.MIN_VALUE);
          assertThat(context().doubleOutput()).isEqualTo(-32768d);
        });

      });

    });

  }
}