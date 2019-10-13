package ar.com.kfgodel.primitons.boxing;

import ar.com.kfgodel.primitons.PrimitonTestContext;
import ar.com.kfgodel.primitons.api.basic.Doubleton;
import info.kfgodel.jspek.api.JavaSpec;
import info.kfgodel.jspek.api.JavaSpecRunner;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Date: 05/08/17 - 18:11
 */
@RunWith(JavaSpecRunner.class)
public class DoubleToBoxedDoubleTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a double to Character primiton", () -> {
      context().double2boxedDouble(()-> Doubleton::toBoxedDouble);

      describe("when used", () -> {
        context().doubleOutput(()-> context().double2boxedDouble().apply(context().doubleInput()));

        it("converts the primitive double into its object counterpart",()->{
          context().doubleInput(()-> 1.1d);
          assertThat(context().doubleOutput()).isEqualTo(Double.valueOf(1.1d));
        });

      });
    });

  }
}