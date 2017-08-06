package ar.com.kfgodel.primitons.numeric.interboxing;

import ar.com.dgarcia.javaspec.api.JavaSpec;
import ar.com.dgarcia.javaspec.api.JavaSpecRunner;
import ar.com.kfgodel.primitons.PrimitonTestContext;
import ar.com.kfgodel.primitons.api.boxed.BoxedFloaton;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * This type verifies the behavior of a numeric conversion
 * Date: 01/08/17 - 20:22
 */
@RunWith(JavaSpecRunner.class)
public class BoxedFloat2BoxedDoubleTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a Float to Double primiton", () -> {
      context().boxedFloat2BoxedDouble(()-> BoxedFloaton::toBoxedDouble);

      describe("when used", () -> {
        context().doubleOutput(()-> context().boxedFloat2BoxedDouble().apply(context().floatInput()));

        it("converts a Float into a Double",()->{
          context().floatInput(()-> Float.valueOf(120.5f));
          assertThat(context().doubleOutput()).isEqualTo(Double.valueOf(120.5d));
        });

        it("converts the maximum float into an double value",()->{
          context().floatInput(()-> Float.valueOf(Float.MAX_VALUE));
          assertThat(context().doubleOutput()).isEqualTo(Double.valueOf(3.4028234663852886E38d));
        });

        it("converts the minimum float into an double",()->{
          context().floatInput(()-> Float.valueOf(Float.MIN_VALUE));
          assertThat(context().doubleOutput()).isEqualTo(Double.valueOf(1.401298464324817E-45d));
        });

        it("converts null to null",()->{
          assertThat(context().boxedFloat2BoxedDouble().apply(null)).isNull();
        });

      });

    });

  }
}