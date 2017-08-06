package ar.com.kfgodel.primitons.numeric.unboxing;

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
public class BoxedShort2IntTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a Short to int primiton", () -> {
      context().boxedShort2Int(()-> BoxedShorton::toInt);

      describe("when used", () -> {
        context().intOutput(()-> context().boxedShort2Int().apply(context().shortInput()));

        it("converts a Short into a primitive int",()->{
          context().shortInput(()-> Short.valueOf((short)72));
          assertThat(context().intOutput()).isEqualTo(72);
        });

        it("converts the maximum Short into a int value",()->{
          context().shortInput(()-> Short.valueOf(Short.MAX_VALUE));
          assertThat(context().intOutput()).isEqualTo(32767);
        });

        it("converts the minimum Short into a int",()->{
          context().shortInput(()-> Short.valueOf(Short.MIN_VALUE));
          assertThat(context().intOutput()).isEqualTo(-32768);
        });

        itThrows(UnmappableException.class, "if value is null",()->{
          context().boxedShort2Int().apply(null);
        }, e ->{
          assertThat(e).hasMessage("Value[null] is not convertible to type [int]");
        });

      });

    });

  }
}