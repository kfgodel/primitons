package ar.com.kfgodel.primitons.numeric;

import ar.com.dgarcia.javaspec.api.JavaSpec;
import ar.com.dgarcia.javaspec.api.JavaSpecRunner;
import ar.com.kfgodel.primitons.PrimitonTestContext;
import ar.com.kfgodel.primitons.api.basic.Shorton;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * This type verifies the behavior of a numeric conversion
 * Date: 01/08/17 - 20:22
 */
@RunWith(JavaSpecRunner.class)
public class Short2LongTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a short to long primiton", () -> {
      context().short2long(()-> Shorton::toLong);

      describe("when used", () -> {
        context().longOutput(()-> context().short2long().apply(context().shortInput()));

        it("converts a primitive short into a primitive long",()->{
          context().shortInput(()-> (short)26);
          assertThat(context().longOutput()).isEqualTo(26L);
        });

        it("converts the maximum short into an long value",()->{
          context().shortInput(()-> Short.MAX_VALUE);
          assertThat(context().longOutput()).isEqualTo(32767L);
        });

        it("converts the minimum short into an long",()->{
          context().shortInput(()-> Short.MIN_VALUE);
          assertThat(context().longOutput()).isEqualTo(-32768L);
        });

      });

    });

  }
}