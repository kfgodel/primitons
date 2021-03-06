package ar.com.kfgodel.primitons.numeric.boxing;

import ar.com.kfgodel.primitons.PrimitonTestContext;
import ar.com.kfgodel.primitons.api.basic.Floaton;
import info.kfgodel.jspek.api.JavaSpec;
import info.kfgodel.jspek.api.JavaSpecRunner;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * This type verifies the behavior of a numeric conversion
 * Date: 01/08/17 - 20:22
 */
@RunWith(JavaSpecRunner.class)
public class Float2BoxedLongTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a float to Long primiton", () -> {
      context().float2BoxedLong(()-> Floaton::toBoxedLong);

      describe("when used", () -> {
        context().longOutput(()-> context().float2BoxedLong().apply(context().floatInput()));

        it("converts a primitive float into a Long",()->{
          context().floatInput(()->4687452.46874654f);
          assertThat(context().longOutput()).isEqualTo(Long.valueOf(4687452L));
        });

        it("converts the maximum float into an long value losing precision",()->{
          context().floatInput(()-> Float.MAX_VALUE);
          assertThat(context().longOutput()).isEqualTo(Long.valueOf(Long.MAX_VALUE));
        });

        it("converts the minimum float into an long value losing precision",()->{
          context().floatInput(()-> Float.MIN_VALUE);
          assertThat(context().longOutput()).isEqualTo(Long.valueOf(0L));
        });

      });

    });

  }
}