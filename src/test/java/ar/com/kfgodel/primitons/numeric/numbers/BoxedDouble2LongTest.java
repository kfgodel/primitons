package ar.com.kfgodel.primitons.numeric.numbers;

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
public class BoxedDouble2LongTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a Double to long primiton", () -> {
      context().boxedDouble2Long(()-> BoxedDoubleton::toLong);

      describe("when used", () -> {
        context().longOutput(()-> context().boxedDouble2Long().apply(context().doubleInput()));

        it("converts a Double into a primitive long",()->{
          context().doubleInput(()-> Double.valueOf(5.3d));
          assertThat(context().longOutput()).isEqualTo(5L);
        });

        it("converts the maximum double into a long value losing precision",()->{
          context().doubleInput(()-> Double.valueOf(Double.MAX_VALUE));
          assertThat(context().longOutput()).isEqualTo(Long.MAX_VALUE); //Most significant bits are lost
        });

        it("converts the minimum double into a long value losing precision",()->{
          context().doubleInput(()-> Double.valueOf(Double.MIN_VALUE));
          assertThat(context().longOutput()).isEqualTo(0L); //Most significant bits are lost
        });
        
        itThrows(UnmappableException.class, "if value is null",()->{
          context().boxedDouble2Long().apply(null);
        }, e ->{
          assertThat(e).hasMessage("Value[null] is not convertible to type [long]");
        });

      });

    });

  }
}