package ar.com.kfgodel.primitons.boxing;

import ar.com.kfgodel.primitons.PrimitonTestContext;
import ar.com.kfgodel.primitons.api.basic.Inton;
import info.kfgodel.jspek.api.JavaSpec;
import info.kfgodel.jspek.api.JavaSpecRunner;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Date: 05/08/17 - 18:11
 */
@RunWith(JavaSpecRunner.class)
public class IntToBoxedIntegerTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a int to Integer primiton", () -> {
      context().int2boxedInteger(()-> Inton::toBoxedInteger);

      describe("when used", () -> {
        context().intOutput(()-> context().int2boxedInteger().apply(context().intInput()));

        it("converts the primitive int into its object counterpart",()->{
          context().intInput(()-> 123654);
          assertThat(context().intOutput()).isEqualTo(Integer.valueOf(123654));
        });

      });
    });

  }
}