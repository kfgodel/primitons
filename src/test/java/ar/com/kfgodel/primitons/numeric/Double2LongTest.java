package ar.com.kfgodel.primitons.numeric;

import ar.com.kfgodel.primitons.PrimitonTestContext;
import ar.com.kfgodel.primitons.api.basic.Doubleton;
import info.kfgodel.jspek.api.JavaSpec;
import info.kfgodel.jspek.api.JavaSpecRunner;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * This type verifies the behavior of a numeric conversion
 * Date: 01/08/17 - 20:22
 */
@RunWith(JavaSpecRunner.class)
public class Double2LongTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a double to long primiton", () -> {
      context().double2long(()-> Doubleton::toLong);

      describe("when used", () -> {
        context().longOutput(()-> context().double2long().apply(context().doubleInput()));

        it("converts a primitive double into a primitive long",()->{
          context().doubleInput(()-> 31.8d);
          assertThat(context().longOutput()).isEqualTo(31L);
        });

        it("converts the maximum double into an long value losing precision",()->{
          context().doubleInput(()-> Double.MAX_VALUE);
          assertThat(context().longOutput()).isEqualTo(Long.MAX_VALUE);
        });

        it("converts the minimum double into an long value losing precision",()->{
          context().doubleInput(()-> Double.MIN_VALUE);
          assertThat(context().longOutput()).isEqualTo(0L);
        });

      });

    });

  }
}