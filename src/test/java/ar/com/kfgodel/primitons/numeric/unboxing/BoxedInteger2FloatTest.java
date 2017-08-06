package ar.com.kfgodel.primitons.numeric.unboxing;

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
public class BoxedInteger2FloatTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a Integer to float primiton", () -> {
      context().boxedInteger2Float(()-> BoxedIntegerton::toFloat);

      describe("when used", () -> {
        context().floatOutput(()-> context().boxedInteger2Float().apply(context().intInput()));

        it("converts a Integer into a primitive float",()->{
          context().intInput(()-> Integer.valueOf(109));
          assertThat(context().floatOutput()).isEqualTo(109f);
        });

        it("converts the maximum int into a float value losing precision",()->{
          context().intInput(()-> Integer.valueOf(Integer.MAX_VALUE));
          assertThat(context().floatOutput()).isEqualTo(2.14748365E9f);
        });

        it("converts the minimum int into a float value losing precision",()->{
          context().intInput(()-> Integer.valueOf(Integer.MIN_VALUE));
          assertThat(context().floatOutput()).isEqualTo(-2.14748365E9f);
        });

        itThrows(UnmappableException.class, "if value is null",()->{
          context().boxedInteger2Float().apply(null);
        }, e ->{
          assertThat(e).hasMessage("Value[null] is not convertible to type [float]");
        });

      });

    });

  }
}