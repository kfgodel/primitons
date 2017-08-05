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
public class Float2LongTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a float to long primiton", () -> {
      context().float2long(()-> Floaton::toLong);

      describe("when used", () -> {
        context().longOutput(()-> context().float2long().apply(context().floatInput()));

        it("converts a primitive float into a primitive long",()->{
          context().floatInput(()->4687452.46874654f);
          assertThat(context().longOutput()).isEqualTo(4687452L);
        });

        it("converts the maximum float into an long value losing precision",()->{
          context().floatInput(()-> Float.MAX_VALUE);
          assertThat(context().longOutput()).isEqualTo(Long.MAX_VALUE);
        });

        it("converts the minimum float into an long value losing precision",()->{
          context().floatInput(()-> Float.MIN_VALUE);
          assertThat(context().longOutput()).isEqualTo(0L);
        });

      });

    });

  }
}