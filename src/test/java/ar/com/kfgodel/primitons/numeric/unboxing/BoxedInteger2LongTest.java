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
public class BoxedInteger2LongTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a Integer to long primiton", () -> {
      context().boxedInteger2Long(()-> BoxedIntegerton::toLong);

      describe("when used", () -> {
        context().longOutput(()-> context().boxedInteger2Long().apply(context().intInput()));

        it("converts a Integer into a primitive long",()->{
          context().intInput(()-> Integer.valueOf(26));
          assertThat(context().longOutput()).isEqualTo(26L);
        });

        it("converts the maximum int into a long",()->{
          context().intInput(()-> Integer.valueOf(Integer.MAX_VALUE));
          assertThat(context().longOutput()).isEqualTo(2147483647L);
        });

        it("converts the minimum int into a long",()->{
          context().intInput(()-> Integer.valueOf(Integer.MIN_VALUE));
          assertThat(context().longOutput()).isEqualTo(-2147483648L);
        });

        itThrows(UnmappableException.class, "if value is null",()->{
          context().boxedInteger2Long().apply(null);
        }, e ->{
          assertThat(e).hasMessage("Value[null] is not convertible to type [long]");
        });

      });

    });

  }
}