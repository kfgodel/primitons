package ar.com.kfgodel.primitons.numeric.interboxing;

import ar.com.kfgodel.primitons.PrimitonTestContext;
import ar.com.kfgodel.primitons.api.boxed.BoxedDoubleton;
import info.kfgodel.jspek.api.JavaSpec;
import info.kfgodel.jspek.api.JavaSpecRunner;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * This type verifies the behavior of a numeric conversion
 * Date: 01/08/17 - 20:22
 */
@RunWith(JavaSpecRunner.class)
public class BoxedDouble2BoxedLongTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a Double to Long primiton", () -> {
      context().boxedDouble2BoxedLong(()-> BoxedDoubleton::toBoxedLong);

      describe("when used", () -> {
        context().longOutput(()-> context().boxedDouble2BoxedLong().apply(context().doubleInput()));

        it("converts a Double into a Long",()->{
          context().doubleInput(()-> Double.valueOf(31.8d));
          assertThat(context().longOutput()).isEqualTo(Long.valueOf(31L));
        });

        it("converts the maximum double into an long value losing precision",()->{
          context().doubleInput(()-> Double.valueOf(Double.MAX_VALUE));
          assertThat(context().longOutput()).isEqualTo(Long.valueOf(Long.MAX_VALUE));
        });

        it("converts the minimum double into an long value losing precision",()->{
          context().doubleInput(()-> Double.valueOf(Double.MIN_VALUE));
          assertThat(context().longOutput()).isEqualTo(Long.valueOf(0L));
        });

        it("converts null to null",()->{
          assertThat(context().boxedDouble2BoxedLong().apply(null)).isNull();
        });

      });

    });

  }
}