package ar.com.kfgodel.primitons.numeric.interboxing;

import ar.com.kfgodel.primitons.PrimitonTestContext;
import ar.com.kfgodel.primitons.api.boxed.BoxedShorton;
import info.kfgodel.jspek.api.JavaSpec;
import info.kfgodel.jspek.api.JavaSpecRunner;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * This type verifies the behavior of a numeric conversion
 * Date: 01/08/17 - 20:22
 */
@RunWith(JavaSpecRunner.class)
public class BoxedShort2BoxedDoubleTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a Short to Double primiton", () -> {
      context().boxedShort2BoxedDouble(()-> BoxedShorton::toBoxedDouble);

      describe("when used", () -> {
        context().doubleOutput(()-> context().boxedShort2BoxedDouble().apply(context().shortInput()));

        it("converts a Short into a Double",()->{
          context().shortInput(()-> Short.valueOf((short)54));
          assertThat(context().doubleOutput()).isEqualTo(Double.valueOf(54d));
        });

        it("converts the maximum short into a double value",()->{
          context().shortInput(()-> Short.valueOf(Short.MAX_VALUE));
          assertThat(context().doubleOutput()).isEqualTo(Double.valueOf(32767d));
        });

        it("converts the minimum short into a double",()->{
          context().shortInput(()-> Short.valueOf(Short.MIN_VALUE));
          assertThat(context().doubleOutput()).isEqualTo(Double.valueOf(-32768d));
        });

        it("converts null to null",()->{
          assertThat(context().boxedShort2BoxedDouble().apply(null)).isNull();
        });

      });

    });

  }
}