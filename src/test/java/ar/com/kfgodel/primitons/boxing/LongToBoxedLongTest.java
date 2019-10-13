package ar.com.kfgodel.primitons.boxing;

import ar.com.kfgodel.primitons.PrimitonTestContext;
import ar.com.kfgodel.primitons.api.basic.Longton;
import info.kfgodel.jspek.api.JavaSpec;
import info.kfgodel.jspek.api.JavaSpecRunner;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Date: 05/08/17 - 18:11
 */
@RunWith(JavaSpecRunner.class)
public class LongToBoxedLongTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a long to Long primiton", () -> {
      context().long2boxedLong(()-> Longton::toBoxedLong);

      describe("when used", () -> {
        context().longOutput(()-> context().long2boxedLong().apply(context().longInput()));

        it("converts the primitive long into its object counterpart",()->{
          context().longInput(()-> 111222L);
          assertThat(context().longOutput()).isEqualTo(Long.valueOf(111222));
        });

      });
    });

  }
}