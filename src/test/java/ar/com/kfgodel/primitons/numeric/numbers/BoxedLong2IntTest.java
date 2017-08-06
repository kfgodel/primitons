package ar.com.kfgodel.primitons.numeric.numbers;

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
public class BoxedLong2IntTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a Long to int primiton", () -> {
      context().boxedLong2Int(()-> BoxedLongton::toInt);

      describe("when used", () -> {
        context().intOutput(()-> context().boxedLong2Int().apply(context().longInput()));

        it("converts a Long into a primitive int",()->{
          context().longInput(()-> Long.valueOf(6234L));
          assertThat(context().intOutput()).isEqualTo(6234);
        });

        it("converts the maximum int value without truncation",()->{
          context().longInput(()-> Long.valueOf(2147483647L));
          assertThat(context().intOutput()).isEqualTo(Integer.MAX_VALUE);
        });

        it("converts the minimum int value without truncation",()->{
          context().longInput(()-> Long.valueOf(-2147483648L));
          assertThat(context().intOutput()).isEqualTo(Integer.MIN_VALUE);
        });

        it("converts any value bigger than maximum int losing precision",()->{
          context().longInput(()-> Long.valueOf(Long.MAX_VALUE));
          assertThat(context().intOutput()).isEqualTo(-1); //Most significant bits are lost
        });

        it("converts any value smaller than minimum int losing precision",()->{
          context().longInput(()-> Long.valueOf(Long.MIN_VALUE));
          assertThat(context().intOutput()).isEqualTo(0); //Most significant bits are lost
        });
        
        itThrows(UnmappableException.class, "if value is null",()->{
          context().boxedLong2Int().apply(null);
        }, e ->{
          assertThat(e).hasMessage("Value[null] is not convertible to type [int]");
        });

      });

    });

  }
}