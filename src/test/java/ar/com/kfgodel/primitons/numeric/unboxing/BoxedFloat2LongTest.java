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
public class BoxedFloat2LongTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a Float to long primiton", () -> {
      context().boxedFloat2Long(()-> BoxedFloaton::toLong);

      describe("when used", () -> {
        context().longOutput(()-> context().boxedFloat2Long().apply(context().floatInput()));

        it("converts a Float into a primitive long",()->{
          context().floatInput(()-> Float.valueOf(12.3f));
          assertThat(context().longOutput()).isEqualTo(12L);
        });

        it("converts the maximum float into a long value losing precision",()->{
          context().floatInput(()-> Float.valueOf(Float.MAX_VALUE));
          assertThat(context().longOutput()).isEqualTo(Long.MAX_VALUE); //Range is not representable
        });

        it("converts the minimum float into a long value losing precision",()->{
          context().floatInput(()-> Float.valueOf(Float.MIN_VALUE));
          assertThat(context().longOutput()).isEqualTo(0L);
        });
        
        itThrows(UnmappableException.class, "if value is null",()->{
          context().boxedFloat2Long().apply(null);
        }, e ->{
          assertThat(e).hasMessage("Value[null] is not convertible to type [long]");
        });

      });

    });

  }
}