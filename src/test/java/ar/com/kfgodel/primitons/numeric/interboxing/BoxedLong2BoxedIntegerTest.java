package ar.com.kfgodel.primitons.numeric.interboxing;

import ar.com.kfgodel.primitons.PrimitonTestContext;
import ar.com.kfgodel.primitons.api.boxed.BoxedLongton;
import info.kfgodel.jspek.api.JavaSpec;
import info.kfgodel.jspek.api.JavaSpecRunner;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * This type verifies the behavior of the long to int converter
 * Created by kfgodel on 03/07/17.
 */
@RunWith(JavaSpecRunner.class)
public class BoxedLong2BoxedIntegerTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a Long to Integer primiton", () -> {
      context().boxedLong2BoxedInteger(()-> BoxedLongton::toBoxedInteger);

      describe("when used", () -> {
        context().intOutput(()-> context().boxedLong2BoxedInteger().apply(context().longInput()));

        it("converts a Long into an Integer",()->{
          context().longInput(()-> Long.valueOf(23L));
          assertThat(context().intOutput()).isEqualTo(Integer.valueOf(23));
        });

        it("converts the maximum int value without truncation",()->{
          context().longInput(()-> Long.valueOf(2147483647L));
          assertThat(context().intOutput()).isEqualTo(Integer.valueOf(Integer.MAX_VALUE));
        });

        it("converts the minimum int value without truncation",()->{
          context().longInput(()-> Long.valueOf(-2147483648L));
          assertThat(context().intOutput()).isEqualTo(Integer.valueOf(Integer.MIN_VALUE));
        });
        
        it("converts any value bigger than maximum int with truncation",()->{
          context().longInput(()-> Long.valueOf(Long.MAX_VALUE));
          assertThat(context().intOutput()).isEqualTo(Integer.valueOf(-1)); //Most significant bits are lost
        });

        it("converts any value smaller than minimum int with truncation",()->{
          context().longInput(()-> Long.valueOf(Long.MIN_VALUE));
          assertThat(context().intOutput()).isEqualTo(Integer.valueOf(0)); //Most significant bits are lost
        });

        it("converts null to null",()->{
          assertThat(context().boxedLong2BoxedInteger().apply(null)).isNull();
        });

      });

    });
  }
}