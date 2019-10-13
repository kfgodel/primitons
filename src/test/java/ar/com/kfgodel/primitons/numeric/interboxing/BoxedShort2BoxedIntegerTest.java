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
public class BoxedShort2BoxedIntegerTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a Short to Integer primiton", () -> {
      context().boxedShort2BoxedInteger(()-> BoxedShorton::toBoxedInteger);

      describe("when used", () -> {
        context().intOutput(()-> context().boxedShort2BoxedInteger().apply(context().shortInput()));

        it("converts a Short into a Integer",()->{
          context().shortInput(()-> Short.valueOf((short)45));
          assertThat(context().intOutput()).isEqualTo(Integer.valueOf(45));
        });

        it("converts the maximum short into an int value",()->{
          context().shortInput(()-> Short.valueOf(Short.MAX_VALUE));
          assertThat(context().intOutput()).isEqualTo(Integer.valueOf(32767));
        });

        it("converts the minimum short into an int",()->{
          context().shortInput(()-> Short.valueOf(Short.MIN_VALUE));
          assertThat(context().intOutput()).isEqualTo(Integer.valueOf(-32768));
        });

        it("converts null to null",()->{
          assertThat(context().boxedShort2BoxedInteger().apply(null)).isNull();
        });

      });

    });

  }
}