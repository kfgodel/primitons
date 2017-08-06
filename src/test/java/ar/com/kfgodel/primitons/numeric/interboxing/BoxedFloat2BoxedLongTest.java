package ar.com.kfgodel.primitons.numeric.interboxing;

import ar.com.dgarcia.javaspec.api.JavaSpec;
import ar.com.dgarcia.javaspec.api.JavaSpecRunner;
import ar.com.kfgodel.primitons.PrimitonTestContext;
import ar.com.kfgodel.primitons.api.boxed.BoxedFloaton;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * This type verifies the behavior of a numeric conversion
 * Date: 01/08/17 - 20:22
 */
@RunWith(JavaSpecRunner.class)
public class BoxedFloat2BoxedLongTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a Float to Long primiton", () -> {
      context().boxedFloat2BoxedLong(()-> BoxedFloaton::toBoxedLong);

      describe("when used", () -> {
        context().longOutput(()-> context().boxedFloat2BoxedLong().apply(context().floatInput()));

        it("converts a Float into a Long",()->{
          context().floatInput(()-> Float.valueOf(4687452.46874654f));
          assertThat(context().longOutput()).isEqualTo(Long.valueOf(4687452L));
        });

        it("converts the maximum float into an long value losing precision",()->{
          context().floatInput(()-> Float.valueOf(Float.MAX_VALUE));
          assertThat(context().longOutput()).isEqualTo(Long.valueOf(Long.MAX_VALUE));
        });

        it("converts the minimum float into an long value losing precision",()->{
          context().floatInput(()-> Float.valueOf(Float.MIN_VALUE));
          assertThat(context().longOutput()).isEqualTo(Long.valueOf(0L));
        });

        it("converts null to null",()->{
          assertThat(context().boxedFloat2BoxedLong().apply(null)).isNull();
        });

      });

    });

  }
}