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
public class BoxedInteger2BoxedDoubleTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a Integer to Double primiton", () -> {
      context().boxedInteger2BoxedDouble(()-> BoxedIntegerton::toBoxedDouble);

      describe("when used", () -> {
        context().doubleOutput(()-> context().boxedInteger2BoxedDouble().apply(context().intInput()));

        it("converts an Integer into a Double",()->{
          context().intInput(()-> Integer.valueOf(120));
          assertThat(context().doubleOutput()).isEqualTo(Double.valueOf(120d));
        });

        it("converts the maximum int into an double value",()->{
          context().intInput(()-> Integer.valueOf(Integer.MAX_VALUE));
          assertThat(context().doubleOutput()).isEqualTo(Double.valueOf(2.147483647E9d));
        });

        it("converts the minimum int into an double",()->{
          context().intInput(()-> Integer.valueOf(Integer.MIN_VALUE));
          assertThat(context().doubleOutput()).isEqualTo(Double.valueOf(-2.147483648E9d));
        });

        it("converts null to null",()->{
          assertThat(context().boxedInteger2BoxedDouble().apply(null)).isNull();
        });

      });

    });

  }
}