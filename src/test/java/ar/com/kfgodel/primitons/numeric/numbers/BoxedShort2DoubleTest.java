package ar.com.kfgodel.primitons.numeric.numbers;

import ar.com.dgarcia.javaspec.api.JavaSpec;
import ar.com.dgarcia.javaspec.api.JavaSpecRunner;
import ar.com.kfgodel.primitons.PrimitonTestContext;
import ar.com.kfgodel.primitons.api.boxed.BoxedShorton;
import ar.com.kfgodel.primitons.api.exceptions.UnmappableException;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * This type verifies the behavior of a numeric conversion
 * Date: 01/08/17 - 20:22
 */
@RunWith(JavaSpecRunner.class)
public class BoxedShort2DoubleTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a Short to double primiton", () -> {
      context().boxedShort2Double(()-> BoxedShorton::toDouble);

      describe("when used", () -> {
        context().doubleOutput(()-> context().boxedShort2Double().apply(context().shortInput()));

        it("converts a Short into a primitive double",()->{
          context().shortInput(()-> Short.valueOf((short)126));
          assertThat(context().doubleOutput()).isEqualTo(126d);
        });

        it("converts the maximum Short into a double value",()->{
          context().shortInput(()-> Short.valueOf(Short.MAX_VALUE));
          assertThat(context().doubleOutput()).isEqualTo(32767d);
        });

        it("converts the minimum Short into a double",()->{
          context().shortInput(()-> Short.valueOf(Short.MIN_VALUE));
          assertThat(context().doubleOutput()).isEqualTo(-32768d);
        });

        itThrows(UnmappableException.class, "if value is null",()->{
          context().boxedShort2Double().apply(null);
        }, e ->{
          assertThat(e).hasMessage("Value[null] is not convertible to type [double]");
        });

      });

    });

  }
}