package ar.com.kfgodel.primitons.numeric.interboxing;

import ar.com.dgarcia.javaspec.api.JavaSpec;
import ar.com.dgarcia.javaspec.api.JavaSpecRunner;
import ar.com.kfgodel.primitons.PrimitonTestContext;
import ar.com.kfgodel.primitons.api.boxed.BoxedShorton;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * This type verifies the behavior of a numeric conversion
 * Date: 01/08/17 - 20:22
 */
@RunWith(JavaSpecRunner.class)
public class BoxedShort2BoxedFloatTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a Short to Float primiton", () -> {
      context().boxedShort2BoxedFloat(()-> BoxedShorton::toBoxedFloat);

      describe("when used", () -> {
        context().floatOutput(()-> context().boxedShort2BoxedFloat().apply(context().shortInput()));

        it("converts a Short into a Float",()->{
          context().shortInput(()-> Short.valueOf((short)32));
          assertThat(context().floatOutput()).isEqualTo(Float.valueOf(32f));
        });

        it("converts the maximum short into an float value",()->{
          context().shortInput(()-> Short.valueOf(Short.MAX_VALUE));
          assertThat(context().floatOutput()).isEqualTo(Float.valueOf(32767f));
        });

        it("converts the minimum short into an float",()->{
          context().shortInput(()-> Short.valueOf(Short.MIN_VALUE));
          assertThat(context().floatOutput()).isEqualTo(Float.valueOf(-32768f));
        });

        it("converts null to null",()->{
          assertThat(context().boxedShort2BoxedFloat().apply(null)).isNull();
        });

      });

    });

  }
}