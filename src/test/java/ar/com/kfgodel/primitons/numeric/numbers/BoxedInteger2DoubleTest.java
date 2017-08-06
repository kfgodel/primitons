package ar.com.kfgodel.primitons.numeric.numbers;

import ar.com.dgarcia.javaspec.api.JavaSpec;
import ar.com.dgarcia.javaspec.api.JavaSpecRunner;
import ar.com.kfgodel.primitons.PrimitonTestContext;
import ar.com.kfgodel.primitons.api.boxed.BoxedIntegerton;
import ar.com.kfgodel.primitons.api.exceptions.UnmappableException;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * This type verifies the behavior of a numeric conversion
 * Date: 01/08/17 - 20:22
 */
@RunWith(JavaSpecRunner.class)
public class BoxedInteger2DoubleTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a Integer to double primiton", () -> {
      context().boxedInteger2Double(()-> BoxedIntegerton::toDouble);

      describe("when used", () -> {
        context().doubleOutput(()-> context().boxedInteger2Double().apply(context().intInput()));

        it("converts a Integer into a primitive double",()->{
          context().intInput(()-> Integer.valueOf(123));
          assertThat(context().doubleOutput()).isEqualTo(123d);
        });

        it("converts the maximum Integer into a double value",()->{
          context().intInput(()-> Integer.valueOf(Integer.MAX_VALUE));
          assertThat(context().doubleOutput()).isEqualTo(2.147483647E9d);
        });

        it("converts the minimum Integer into a double",()->{
          context().intInput(()-> Integer.valueOf(Integer.MIN_VALUE));
          assertThat(context().doubleOutput()).isEqualTo(-2.147483648E9d);
        });

        itThrows(UnmappableException.class, "if value is null",()->{
          context().boxedInteger2Double().apply(null);
        }, e ->{
          assertThat(e).hasMessage("Value[null] is not convertible to type [double]");
        });

      });

    });

  }
}