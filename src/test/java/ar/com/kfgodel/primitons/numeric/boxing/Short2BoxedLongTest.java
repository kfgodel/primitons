package ar.com.kfgodel.primitons.numeric.boxing;

import ar.com.kfgodel.primitons.PrimitonTestContext;
import ar.com.kfgodel.primitons.api.basic.Shorton;
import info.kfgodel.jspek.api.JavaSpec;
import info.kfgodel.jspek.api.JavaSpecRunner;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * This type verifies the behavior of a numeric conversion
 * Date: 01/08/17 - 20:22
 */
@RunWith(JavaSpecRunner.class)
public class Short2BoxedLongTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a short to Long primiton", () -> {
      context().short2BoxedLong(()-> Shorton::toBoxedLong);

      describe("when used", () -> {
        context().longOutput(()-> context().short2BoxedLong().apply(context().shortInput()));

        it("converts a primitive short into a Long",()->{
          context().shortInput(()-> (short)26);
          assertThat(context().longOutput()).isEqualTo(Long.valueOf(26L));
        });

        it("converts the maximum short into an long value",()->{
          context().shortInput(()-> Short.MAX_VALUE);
          assertThat(context().longOutput()).isEqualTo(Long.valueOf(32767L));
        });

        it("converts the minimum short into an long",()->{
          context().shortInput(()-> Short.MIN_VALUE);
          assertThat(context().longOutput()).isEqualTo(Long.valueOf(-32768L));
        });

      });

    });

  }
}