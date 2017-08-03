package ar.com.kfgodel.primitons.numeric;

import ar.com.dgarcia.javaspec.api.JavaSpec;
import ar.com.dgarcia.javaspec.api.JavaSpecRunner;
import ar.com.kfgodel.primitons.PrimitonTestContext;
import ar.com.kfgodel.primitons.api.basic.Inton;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * This type verifies the behavior of a numeric conversion
 * Date: 01/08/17 - 20:22
 */
@RunWith(JavaSpecRunner.class)
public class Int2DoubleTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a int to double primiton", () -> {
      context().int2double(()-> Inton::toDouble);

      describe("when used", () -> {
        context().doubleOutput(()-> context().int2double().apply(context().intInput()));

        it("converts a primitive int into a primitive double",()->{
          context().intInput(()-> 120);
          assertThat(context().doubleOutput()).isEqualTo(120d);
        });

        it("converts the maximum int into an double value",()->{
          context().intInput(()-> Integer.MAX_VALUE);
          assertThat(context().doubleOutput()).isEqualTo(2.147483647E9d);
        });

        it("converts the minimum int into an double",()->{
          context().intInput(()-> Integer.MIN_VALUE);
          assertThat(context().doubleOutput()).isEqualTo(-2.147483648E9d);
        });

      });

    });

  }
}