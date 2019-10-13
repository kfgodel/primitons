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
public class BoxedShort2BoxedLongTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a Short to Long primiton", () -> {
      context().boxedShort2BoxedLong(()-> BoxedShorton::toBoxedLong);

      describe("when used", () -> {
        context().longOutput(()-> context().boxedShort2BoxedLong().apply(context().shortInput()));

        it("converts a Short into a Long",()->{
          context().shortInput(()-> Short.valueOf((short)26));
          assertThat(context().longOutput()).isEqualTo(Long.valueOf(26L));
        });

        it("converts the maximum short into an long value",()->{
          context().shortInput(()-> Short.valueOf(Short.MAX_VALUE));
          assertThat(context().longOutput()).isEqualTo(Long.valueOf(32767L));
        });

        it("converts the minimum short into an long",()->{
          context().shortInput(()-> Short.valueOf(Short.MIN_VALUE));
          assertThat(context().longOutput()).isEqualTo(Long.valueOf(-32768L));
        });

        it("converts null to null",()->{
          assertThat(context().boxedShort2BoxedLong().apply(null)).isNull();
        });

      });

    });

  }
}