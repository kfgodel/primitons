package ar.com.kfgodel.primitons.textual.boxed;

import ar.com.kfgodel.primitons.PrimitonTestContext;
import ar.com.kfgodel.primitons.api.basic.Strington;
import ar.com.kfgodel.primitons.api.exceptions.UnmappableException;
import info.kfgodel.jspek.api.JavaSpec;
import info.kfgodel.jspek.api.JavaSpecRunner;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * This class verifies the conversion from a string to Float
 * Date: 24/03/19 - 16:38
 */
@RunWith(JavaSpecRunner.class)
public class String2BoxedFloatTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a String to Float primiton", () -> {
      context().string2BoxedFloat(()-> Strington::toBoxedFloat);

      describe("when used", () -> {
        context().floatOutput(()-> context().string2BoxedFloat().apply(context().stringInput()));

        it("converts a String number into a Float",()->{
          context().stringInput(()-> "12.34");
          assertThat(context().floatOutput()).isEqualTo(Float.valueOf(12.34f));
        });

        it("converts 'Nan' to its value",()->{
          context().stringInput(()-> "NaN");
          assertThat(context().floatOutput()).isEqualTo(Float.valueOf(Float.NaN));
        });

        itThrows(UnmappableException.class, "if string input is not a number",()->{
          context().stringInput(()-> "not a number");
          context().floatOutput(); // Excercise
        }, e->{
          assertThat(e).hasMessage("Value[not a number] is not convertible to type [class java.lang.Float]: For input string: \"not a number\"");
        });

        it("converts a string bigger than the maximum representable number into an infinity",()->{
          context().stringInput(()-> Float.MAX_VALUE + "1");
          assertThat(context().floatOutput()).isEqualTo(Float.valueOf(Float.POSITIVE_INFINITY));
        });

        it("converts a string smaller than the minimum representable number into 0",()->{
          context().stringInput(()-> Float.MIN_VALUE + "1");
          assertThat(context().floatOutput()).isEqualTo(Float.valueOf(0.0f));
        });

        it("converts 'null' into null",()->{
          context().stringInput(()-> "null");
          assertThat(context().floatOutput()).isNull();
        });
        it("converts null into null",()->{
          context().stringInput(()-> null);
          assertThat(context().floatOutput()).isNull();
        });

      });
    });
  }
}
