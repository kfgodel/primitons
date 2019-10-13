package ar.com.kfgodel.primitons.numeric.interboxing;

import ar.com.kfgodel.primitons.PrimitonTestContext;
import ar.com.kfgodel.primitons.api.boxed.BoxedIntegerton;
import info.kfgodel.jspek.api.JavaSpec;
import info.kfgodel.jspek.api.JavaSpecRunner;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Verifies the basic conversions for int to long conversions
 * Created by kfgodel on 03/07/17.
 */
@RunWith(JavaSpecRunner.class)
public class BoxedInteger2BoxedLongTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("an Integer to Long primiton", () -> {
      context().boxedInteger2BoxedLong(()-> BoxedIntegerton::toBoxedLong);

      describe("when used", () -> {
        context().longOutput(()-> context().boxedInteger2BoxedLong().apply(context().intInput()));

        it("converts an Integer into a Long",()->{
          context().intInput(()-> Integer.valueOf(1));
          assertThat(context().longOutput()).isEqualTo(Long.valueOf(1L));
        });

        it("converts the maximum int into a long",()->{
          context().intInput(()-> Integer.valueOf(Integer.MAX_VALUE));
          assertThat(context().longOutput()).isEqualTo(Long.valueOf(2147483647L));
        });

        it("converts the minimum int into a long",()->{
          context().intInput(()-> Integer.valueOf(Integer.MIN_VALUE));
          assertThat(context().longOutput()).isEqualTo(Long.valueOf(-2147483648L));
        });

        it("converts null to null",()->{
          assertThat(context().boxedInteger2BoxedLong().apply(null)).isNull();
        });

      });

    });

  }
}