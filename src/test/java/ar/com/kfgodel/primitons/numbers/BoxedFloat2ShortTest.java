package ar.com.kfgodel.primitons.numbers;

import ar.com.dgarcia.javaspec.api.JavaSpec;
import ar.com.dgarcia.javaspec.api.JavaSpecRunner;
import ar.com.kfgodel.primitons.PrimitonTestContext;
import ar.com.kfgodel.primitons.api.boxed.BoxedFloaton;
import ar.com.kfgodel.primitons.api.exceptions.UnmappableException;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * This type verifies the behavior of a numeric conversion
 * Date: 01/08/17 - 20:22
 */
@RunWith(JavaSpecRunner.class)
public class BoxedFloat2ShortTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a Float to short primiton", () -> {
      context().boxedFloat2Short(()-> BoxedFloaton::toShort);

      describe("when used", () -> {
        context().shortOutput(()-> context().boxedFloat2Short().apply(context().floatInput()));

        it("converts a Float into a primitive short",()->{
          context().floatInput(()-> Float.valueOf(24.2f));
          assertThat(context().shortOutput()).isEqualTo((short)24);
        });

        it("converts the maximum short value without truncation",()->{
          context().floatInput(()-> Float.valueOf(32767f));
          assertThat(context().shortOutput()).isEqualTo(Short.MAX_VALUE);
        });

        it("converts the minimum short value without truncation",()->{
          context().floatInput(()-> Float.valueOf(-32768f));
          assertThat(context().shortOutput()).isEqualTo(Short.MIN_VALUE);
        });

        it("converts any value bigger than maximum short with truncation",()->{
          context().floatInput(()-> Float.valueOf(Float.MAX_VALUE));
          assertThat(context().shortOutput()).isEqualTo((short)-1); //Most significant bits are lost
        });

        it("converts any value smaller than minimum short with truncation",()->{
          context().floatInput(()-> Float.valueOf(Float.MIN_VALUE));
          assertThat(context().shortOutput()).isEqualTo((short)0); //Most significant bits are lost
        });
        
        itThrows(UnmappableException.class, "if value is null",()->{
          context().boxedFloat2Short().apply(null);
        }, e ->{
          assertThat(e).hasMessage("Value[null] is not convertible to type [short]");
        });

      });

    });

  }
}