package ar.com.kfgodel.primitons.numeric.boxed;

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
public class BoxedShort2LongTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a Short to long primiton", () -> {
      context().boxedShort2Long(()-> BoxedShorton::toLong);

      describe("when used", () -> {
        context().longOutput(()-> context().boxedShort2Long().apply(context().shortInput()));

        it("converts a Short into a primitive long",()->{
          context().shortInput(()-> Short.valueOf((short)160));
          assertThat(context().longOutput()).isEqualTo(160L);
        });

        it("converts the maximum int into a long",()->{
          context().shortInput(()-> Short.valueOf(Short.MAX_VALUE));
          assertThat(context().longOutput()).isEqualTo(32767L);
        });

        it("converts the minimum int into a long",()->{
          context().shortInput(()-> Short.valueOf(Short.MIN_VALUE));
          assertThat(context().longOutput()).isEqualTo(-32768L);
        });

        itThrows(UnmappableException.class, "if value is null",()->{
          context().boxedShort2Long().apply(null);
        }, e ->{
          assertThat(e).hasMessage("Value[null] is not convertible to type [long]");
        });

      });

    });

  }
}