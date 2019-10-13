package ar.com.kfgodel.primitons.boxing;

import ar.com.kfgodel.primitons.PrimitonTestContext;
import ar.com.kfgodel.primitons.api.basic.Shorton;
import info.kfgodel.jspek.api.JavaSpec;
import info.kfgodel.jspek.api.JavaSpecRunner;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Date: 05/08/17 - 18:11
 */
@RunWith(JavaSpecRunner.class)
public class ShortToBoxedShortTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a short to Short primiton", () -> {
      context().short2boxedShort(()-> Shorton::toBoxedShort);

      describe("when used", () -> {
        context().shortOutput(()-> context().short2boxedShort().apply(context().shortInput()));

        it("converts the primitive short into its object counterpart",()->{
          context().shortInput(()-> (short)120);
          assertThat(context().shortOutput()).isEqualTo(Short.valueOf((short)120));
        });

      });
    });

  }
}