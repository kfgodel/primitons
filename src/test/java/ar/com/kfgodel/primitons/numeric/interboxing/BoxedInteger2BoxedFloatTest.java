package ar.com.kfgodel.primitons.numeric.interboxing;

import ar.com.dgarcia.javaspec.api.JavaSpec;
import ar.com.dgarcia.javaspec.api.JavaSpecRunner;
import ar.com.kfgodel.primitons.PrimitonTestContext;
import ar.com.kfgodel.primitons.api.boxed.BoxedIntegerton;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * This type verifies the behavior of a numeric conversion
 * Date: 01/08/17 - 20:22
 */
@RunWith(JavaSpecRunner.class)
public class BoxedInteger2BoxedFloatTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a Integer to Float primiton", () -> {
      context().boxedInteger2BoxedFloat(()-> BoxedIntegerton::toBoxedFloat);

      describe("when used", () -> {
        context().floatOutput(()-> context().boxedInteger2BoxedFloat().apply(context().intInput()));

        it("converts an Integer into a Float",()->{
          context().intInput(()-> Integer.valueOf(-4));
          assertThat(context().floatOutput()).isEqualTo(Float.valueOf(-4f));
        });

        it("converts the maximum int into a float value losing precision",()->{
          context().intInput(()-> Integer.valueOf(Integer.MAX_VALUE));
          assertThat(context().floatOutput()).isEqualTo(Float.valueOf(2.14748365E9f));
        });

        it("converts the minimum int into a float value losing precision",()->{
          context().intInput(()-> Integer.valueOf(Integer.MIN_VALUE));
          assertThat(context().floatOutput()).isEqualTo(Float.valueOf(-2.14748365E9f));
        });

        it("converts null to null",()->{
          assertThat(context().boxedInteger2BoxedFloat().apply(null)).isNull();
        });

      });

    });

  }
}