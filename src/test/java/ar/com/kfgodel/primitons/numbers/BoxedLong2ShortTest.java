package ar.com.kfgodel.primitons.numbers;

import ar.com.dgarcia.javaspec.api.JavaSpec;
import ar.com.dgarcia.javaspec.api.JavaSpecRunner;
import ar.com.kfgodel.primitons.PrimitonTestContext;
import ar.com.kfgodel.primitons.api.boxed.BoxedLongton;
import ar.com.kfgodel.primitons.api.exceptions.UnmappableException;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * This type verifies the behavior of a numeric conversion
 * Date: 01/08/17 - 20:22
 */
@RunWith(JavaSpecRunner.class)
public class BoxedLong2ShortTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a Long to short primiton", () -> {
      context().boxedLong2Short(()-> BoxedLongton::toShort);

      describe("when used", () -> {
        context().shortOutput(()-> context().boxedLong2Short().apply(context().longInput()));

        it("converts a Long into a primitive short",()->{
          context().longInput(()-> Long.valueOf(-30));
          assertThat(context().shortOutput()).isEqualTo((short)-30);
        });

        it("converts the maximum short value without truncation",()->{
          context().longInput(()-> Long.valueOf(32767));
          assertThat(context().shortOutput()).isEqualTo(Short.MAX_VALUE);
        });

        it("converts the minimum short value without truncation",()->{
          context().longInput(()-> Long.valueOf(-32768));
          assertThat(context().shortOutput()).isEqualTo(Short.MIN_VALUE);
        });

        it("converts any value bigger than maximum short with truncation",()->{
          context().longInput(()-> Long.valueOf(Long.MAX_VALUE));
          assertThat(context().shortOutput()).isEqualTo((short)-1); //Most significant bits are lost
        });

        it("converts any value smaller than minimum short with truncation",()->{
          context().longInput(()-> Long.valueOf(Long.MIN_VALUE));
          assertThat(context().shortOutput()).isEqualTo((short)0); //Most significant bits are lost
        });
        
        itThrows(UnmappableException.class, "if value is null",()->{
          context().boxedLong2Short().apply(null);
        }, e ->{
          assertThat(e).hasMessage("Value[null] is not convertible to type [short]");
        });

      });

    });

  }
}