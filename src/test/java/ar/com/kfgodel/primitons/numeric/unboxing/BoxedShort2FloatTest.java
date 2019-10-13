package ar.com.kfgodel.primitons.numeric.unboxing;

import ar.com.kfgodel.primitons.PrimitonTestContext;
import ar.com.kfgodel.primitons.api.boxed.BoxedShorton;
import ar.com.kfgodel.primitons.api.exceptions.UnmappableException;
import info.kfgodel.jspek.api.JavaSpec;
import info.kfgodel.jspek.api.JavaSpecRunner;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * This type verifies the behavior of a numeric conversion
 * Date: 01/08/17 - 20:22
 */
@RunWith(JavaSpecRunner.class)
public class BoxedShort2FloatTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a Short to float primiton", () -> {
      context().boxedShort2Float(()-> BoxedShorton::toFloat);

      describe("when used", () -> {
        context().floatOutput(()-> context().boxedShort2Float().apply(context().shortInput()));

        it("converts a Short into a primitive float",()->{
          context().shortInput(()-> Short.valueOf((short)96));
          assertThat(context().floatOutput()).isEqualTo(96f);
        });

        it("converts the maximum Short into a float value",()->{
          context().shortInput(()-> Short.valueOf(Short.MAX_VALUE));
          assertThat(context().floatOutput()).isEqualTo(32767f);
        });

        it("converts the minimum Short into a float",()->{
          context().shortInput(()-> Short.valueOf(Short.MIN_VALUE));
          assertThat(context().floatOutput()).isEqualTo(-32768f);
        });

        itThrows(UnmappableException.class, "if value is null",()->{
          context().boxedShort2Float().apply(null);
        }, e ->{
          assertThat(e).hasMessage("Value[null] is not convertible to type [float]");
        });

      });

    });

  }
}