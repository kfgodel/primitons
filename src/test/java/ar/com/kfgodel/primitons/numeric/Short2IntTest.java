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
public class Short2IntTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a short to int primiton", () -> {
      context().short2int(()-> Shorton::toInt);

      describe("when used", () -> {
        context().intOutput(()-> context().short2int().apply(context().shortInput()));

        it("converts a primitive short into a primitive int",()->{
          context().shortInput(()-> (short)45);
          assertThat(context().intOutput()).isEqualTo(45);
        });

        it("converts the maximum short into an int value",()->{
          context().shortInput(()-> Short.MAX_VALUE);
          assertThat(context().intOutput()).isEqualTo(32767);
        });

        it("converts the minimum short into an int",()->{
          context().shortInput(()-> Short.MIN_VALUE);
          assertThat(context().intOutput()).isEqualTo(-32768);
        });

      });

    });

  }
}