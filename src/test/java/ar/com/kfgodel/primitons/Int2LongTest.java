package ar.com.kfgodel.primitons;

import ar.com.dgarcia.javaspec.api.JavaSpec;
import ar.com.dgarcia.javaspec.api.JavaSpecRunner;
import ar.com.kfgodel.primitons.api.basic.Inton;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Verifies the basic conversions for int to long conversions
 * Created by kfgodel on 03/07/17.
 */
@RunWith(JavaSpecRunner.class)
public class Int2LongTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("an int to long primiton", () -> {
      context().int2Long(()-> Inton::toLong);

      describe("when used", () -> {
        context().longOutput(()-> context().int2Long().applyAsLong(context().intInput()));

        it("converts a primitive int into a primitive long",()->{
          context().intInput(()-> 1);
          assertThat(context().longOutput()).isEqualTo(1L);
        });

        it("converts the maximum int into a long",()->{
          context().intInput(()-> Integer.MAX_VALUE);
          assertThat(context().longOutput()).isEqualTo(2147483647L);
        });

        it("converts the minimum int into a long",()->{
          context().intInput(()-> Integer.MIN_VALUE);
          assertThat(context().longOutput()).isEqualTo(-2147483648L);
        });

      });

    });

  }
}