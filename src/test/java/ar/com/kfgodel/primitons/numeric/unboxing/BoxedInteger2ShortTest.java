package ar.com.kfgodel.primitons.numeric.unboxing;

import ar.com.dgarcia.javaspec.api.JavaSpec;
import ar.com.dgarcia.javaspec.api.JavaSpecRunner;
import ar.com.kfgodel.primitons.PrimitonTestContext;
import ar.com.kfgodel.primitons.api.boxed.BoxedIntegerton;
import ar.com.kfgodel.primitons.api.exceptions.UnmappableException;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * This type verifies the behavior of a numeric conversion
 * Date: 01/08/17 - 20:22
 */
@RunWith(JavaSpecRunner.class)
public class BoxedInteger2ShortTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a Integer to short primiton", () -> {
      context().boxedInteger2Short(()-> BoxedIntegerton::toShort);

      describe("when used", () -> {
        context().shortOutput(()-> context().boxedInteger2Short().apply(context().intInput()));

        it("converts a Integer into a primitive short",()->{
          context().intInput(()-> Integer.valueOf(-19));
          assertThat(context().shortOutput()).isEqualTo((short)-19);
        });

        it("converts the maximum short value without truncation",()->{
          context().intInput(()-> Integer.valueOf(32767));
          assertThat(context().shortOutput()).isEqualTo(Short.MAX_VALUE);
        });

        it("converts the minimum short value without truncation",()->{
          context().intInput(()-> Integer.valueOf(-32768));
          assertThat(context().shortOutput()).isEqualTo(Short.MIN_VALUE);
        });

        it("converts any value bigger than maximum short with truncation",()->{
          context().intInput(()-> Integer.valueOf(Integer.MAX_VALUE));
          assertThat(context().shortOutput()).isEqualTo((short)-1); //Most significant bits are lost
        });

        it("converts any value smaller than minimum short with truncation",()->{
          context().intInput(()-> Integer.valueOf(Integer.MIN_VALUE));
          assertThat(context().shortOutput()).isEqualTo((short)0); //Most significant bits are lost
        });
        
        itThrows(UnmappableException.class, "if value is null",()->{
          context().boxedInteger2Short().apply(null);
        }, e ->{
          assertThat(e).hasMessage("Value[null] is not convertible to type [short]");
        });

      });

    });

  }
}