package ar.com.kfgodel.primitons.numeric.interboxing;

import ar.com.kfgodel.primitons.PrimitonTestContext;
import ar.com.kfgodel.primitons.api.boxed.BoxedIntegerton;
import info.kfgodel.jspek.api.JavaSpec;
import info.kfgodel.jspek.api.JavaSpecRunner;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * This type verifies the behavior of the int to short converter
 * Created by kfgodel on 03/07/17.
 */
@RunWith(JavaSpecRunner.class)
public class BoxedInteger2BoxedShortTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a Integer to Short primiton", () -> {
      context().boxedInteger2BoxedShort(()-> BoxedIntegerton::toBoxedShort);

      describe("when used", () -> {
        context().shortOutput(()-> context().boxedInteger2BoxedShort().apply(context().intInput()));

        it("converts an Integer into a Short",()->{
          context().intInput(()-> Integer.valueOf(78));
          assertThat(context().shortOutput()).isEqualTo(Short.valueOf((short)78));
        });

        it("converts the maximum short value without truncation",()->{
          context().intInput(()-> Integer.valueOf(32767));
          assertThat(context().shortOutput()).isEqualTo(Short.valueOf(Short.MAX_VALUE));
        });

        it("converts the minimum short value without truncation",()->{
          context().intInput(()-> Integer.valueOf(-32768));
          assertThat(context().shortOutput()).isEqualTo(Short.valueOf(Short.MIN_VALUE));
        });
        
        it("converts any value bigger than maximum short with truncation",()->{
          context().intInput(()-> Integer.valueOf(Integer.MAX_VALUE));
          assertThat(context().shortOutput()).isEqualTo(Short.valueOf((short)-1)); //Most significant bits are lost
        });

        it("converts any value smaller than minimum short with truncation",()->{
          context().intInput(()-> Integer.valueOf(Integer.MIN_VALUE));
          assertThat(context().shortOutput()).isEqualTo(Short.valueOf((short)0)); //Most significant bits are lost
        });

        it("converts null to null",()->{
          assertThat(context().boxedInteger2BoxedShort().apply(null)).isNull();
        });

      });

    });
  }
}