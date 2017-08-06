package ar.com.kfgodel.primitons.numeric.interboxing;

import ar.com.dgarcia.javaspec.api.JavaSpec;
import ar.com.dgarcia.javaspec.api.JavaSpecRunner;
import ar.com.kfgodel.primitons.PrimitonTestContext;
import ar.com.kfgodel.primitons.api.boxed.BoxedLongton;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * This type verifies the behavior of the long to short converter
 * Created by kfgodel on 03/07/17.
 */
@RunWith(JavaSpecRunner.class)
public class BoxedLong2BoxedShortTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a Long to Short primiton", () -> {
      context().boxedLong2BoxedShort(()-> BoxedLongton::toBoxedShort);

      describe("when used", () -> {
        context().shortOutput(()-> context().boxedLong2BoxedShort().apply(context().longInput()));

        it("converts a Long into a Short",()->{
          context().longInput(()-> Long.valueOf(18L));
          assertThat(context().shortOutput()).isEqualTo(Short.valueOf((short)18));
        });

        it("converts the maximum short value without truncation",()->{
          context().longInput(()-> Long.valueOf(32767L));
          assertThat(context().shortOutput()).isEqualTo(Short.valueOf(Short.MAX_VALUE));
        });

        it("converts the minimum short value without truncation",()->{
          context().longInput(()-> Long.valueOf(-32768L));
          assertThat(context().shortOutput()).isEqualTo(Short.valueOf(Short.MIN_VALUE));
        });
        
        it("converts any value bigger than maximum short with truncation",()->{
          context().longInput(()-> Long.valueOf(Long.MAX_VALUE));
          assertThat(context().shortOutput()).isEqualTo(Short.valueOf((short)-1)); //Most significant bits are lost
        });

        it("converts any value smaller than minimum short with truncation",()->{
          context().longInput(()-> Long.valueOf(Long.MIN_VALUE));
          assertThat(context().shortOutput()).isEqualTo(Short.valueOf((short)0)); //Most significant bits are lost
        });

        it("converts null to null",()->{
          assertThat(context().boxedLong2BoxedShort().apply(null)).isNull();
        });

      });

    });
  }
}