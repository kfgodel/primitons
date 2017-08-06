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
public class BoxedFloat2DoubleTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a Float to double primiton", () -> {
      context().boxedFloat2Double(()-> BoxedFloaton::toDouble);

      describe("when used", () -> {
        context().doubleOutput(()-> context().boxedFloat2Double().apply(context().floatInput()));

        it("converts a Float into a primitive double",()->{
          context().floatInput(()-> Float.valueOf(2.5f));
          assertThat(context().doubleOutput()).isEqualTo(2.5d);
        });

        it("converts the maximum Float into a double value",()->{
          context().floatInput(()-> Float.valueOf(Float.MAX_VALUE));
          assertThat(context().doubleOutput()).isEqualTo(0x1.fffffeP+127d);
        });

        it("converts the minimum Float into a double",()->{
          context().floatInput(()-> Float.valueOf(Float.MIN_VALUE));
          assertThat(context().doubleOutput()).isEqualTo(0x0.000002P-126d);
        });

        itThrows(UnmappableException.class, "if value is null",()->{
          context().boxedFloat2Double().apply(null);
        }, e ->{
          assertThat(e).hasMessage("Value[null] is not convertible to type [double]");
        });

      });

    });

  }
}