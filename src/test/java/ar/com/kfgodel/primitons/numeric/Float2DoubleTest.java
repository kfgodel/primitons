package ar.com.kfgodel.primitons.numeric;

import ar.com.dgarcia.javaspec.api.JavaSpec;
import ar.com.dgarcia.javaspec.api.JavaSpecRunner;
import ar.com.kfgodel.primitons.PrimitonTestContext;
import ar.com.kfgodel.primitons.api.basic.Floaton;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * This type verifies the behavior of a numeric conversion
 * Date: 01/08/17 - 20:22
 */
@RunWith(JavaSpecRunner.class)
public class Float2DoubleTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a float to double primiton", () -> {
      context().float2double(()-> Floaton::toDouble);

      describe("when used", () -> {
        context().doubleOutput(()-> context().float2double().apply(context().floatInput()));

        it("converts a primitive float into a primitive double",()->{
          context().floatInput(()-> 120.5f);
          assertThat(context().doubleOutput()).isEqualTo(120.5d);
        });

        it("converts the maximum float into an double value",()->{
          context().floatInput(()-> Float.MAX_VALUE);
          assertThat(context().doubleOutput()).isEqualTo(3.4028234663852886E38d);
        });

        it("converts the minimum float into an double",()->{
          context().floatInput(()-> Float.MIN_VALUE);
          assertThat(context().doubleOutput()).isEqualTo(1.401298464324817E-45d);
        });

      });

    });

  }
}