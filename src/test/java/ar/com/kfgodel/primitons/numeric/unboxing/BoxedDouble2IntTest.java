package ar.com.kfgodel.primitons.numeric.unboxing;

import ar.com.dgarcia.javaspec.api.JavaSpec;
import ar.com.dgarcia.javaspec.api.JavaSpecRunner;
import ar.com.kfgodel.primitons.PrimitonTestContext;
import ar.com.kfgodel.primitons.api.boxed.BoxedDoubleton;
import ar.com.kfgodel.primitons.api.exceptions.UnmappableException;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * This type verifies the behavior of a numeric conversion
 * Date: 01/08/17 - 20:22
 */
@RunWith(JavaSpecRunner.class)
public class BoxedDouble2IntTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a Double to int primiton", () -> {
      context().boxedDouble2Int(()-> BoxedDoubleton::toInt);

      describe("when used", () -> {
        context().intOutput(()-> context().boxedDouble2Int().apply(context().doubleInput()));

        it("converts a Double into a primitive int",()->{
          context().doubleInput(()-> Double.valueOf(3.3d));
          assertThat(context().intOutput()).isEqualTo(3);
        });

        it("converts the maximum int value without truncation",()->{
          context().doubleInput(()-> Double.valueOf(2147483647d));
          assertThat(context().intOutput()).isEqualTo(Integer.MAX_VALUE);
        });

        it("converts the minimum int value without truncation",()->{
          context().doubleInput(()-> Double.valueOf(-2147483648d));
          assertThat(context().intOutput()).isEqualTo(Integer.MIN_VALUE);
        });

        it("converts any value bigger than maximum int losing precision",()->{
          context().doubleInput(()-> Double.valueOf(Double.MAX_VALUE));
          assertThat(context().intOutput()).isEqualTo(2147483647); //Most significant bits are lost
        });

        it("converts any value smaller than minimum int losing precision",()->{
          context().doubleInput(()-> Double.valueOf(Double.MIN_VALUE));
          assertThat(context().intOutput()).isEqualTo(0); //Most significant bits are lost
        });
        
        itThrows(UnmappableException.class, "if value is null",()->{
          context().boxedDouble2Int().apply(null);
        }, e ->{
          assertThat(e).hasMessage("Value[null] is not convertible to type [int]");
        });

      });

    });

  }
}