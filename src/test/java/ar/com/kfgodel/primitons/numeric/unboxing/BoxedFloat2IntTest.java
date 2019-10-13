package ar.com.kfgodel.primitons.numeric.unboxing;

import ar.com.kfgodel.primitons.PrimitonTestContext;
import ar.com.kfgodel.primitons.api.boxed.BoxedFloaton;
import ar.com.kfgodel.primitons.api.exceptions.UnmappableException;
import info.kfgodel.jspek.api.JavaSpec;
import info.kfgodel.jspek.api.JavaSpecRunner;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * This type verifies the behavior of a numeric conversion
 * Date: 01/08/17 - 20:22
 */
@RunWith(JavaSpecRunner.class)
public class BoxedFloat2IntTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a Float to int primiton", () -> {
      context().boxedFloat2Int(()-> BoxedFloaton::toInt);

      describe("when used", () -> {
        context().intOutput(()-> context().boxedFloat2Int().apply(context().floatInput()));

        it("converts a Float into a primitive int",()->{
          context().floatInput(()-> Float.valueOf(8.3f));
          assertThat(context().intOutput()).isEqualTo(8);
        });

        it("converts the maximum int value without truncation",()->{
          context().floatInput(()-> Float.valueOf(2147483647f));
          assertThat(context().intOutput()).isEqualTo(Integer.MAX_VALUE);
        });

        it("converts the minimum int value without truncation",()->{
          context().floatInput(()-> Float.valueOf(-2147483648f));
          assertThat(context().intOutput()).isEqualTo(Integer.MIN_VALUE);
        });

        it("converts any value bigger than maximum int losing precision",()->{
          context().floatInput(()-> Float.valueOf(Float.MAX_VALUE));
          assertThat(context().intOutput()).isEqualTo(2147483647); //Most significant bits are lost
        });

        it("converts any value smaller than minimum int losing precision",()->{
          context().floatInput(()-> Float.valueOf(Float.MIN_VALUE));
          assertThat(context().intOutput()).isEqualTo(0); //Most significant bits are lost
        });
        
        itThrows(UnmappableException.class, "if value is null",()->{
          context().boxedFloat2Int().apply(null);
        }, e ->{
          assertThat(e).hasMessage("Value[null] is not convertible to type [int]");
        });

      });

    });

  }
}