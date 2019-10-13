package ar.com.kfgodel.primitons.numeric.boxing;

import ar.com.kfgodel.primitons.PrimitonTestContext;
import ar.com.kfgodel.primitons.api.basic.Doubleton;
import info.kfgodel.jspek.api.JavaSpec;
import info.kfgodel.jspek.api.JavaSpecRunner;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * This type verifies the behavior of the double to int converter
 * Created by kfgodel on 03/07/17.
 */
@RunWith(JavaSpecRunner.class)
public class Double2BoxedIntegerTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a double to Integer primiton", () -> {
      context().double2BoxedInteger(()-> Doubleton::toBoxedInteger);

      describe("when used", () -> {
        context().intOutput(()-> context().double2BoxedInteger().apply(context().doubleInput()));

        it("converts a primitive double into an Integer",()->{
          context().doubleInput(()-> 34.5d);
          assertThat(context().intOutput()).isEqualTo(Integer.valueOf(34));
        });

        it("converts the maximum int value without truncation",()->{
          context().doubleInput(()-> 2147483647d);
          assertThat(context().intOutput()).isEqualTo(Integer.valueOf(Integer.MAX_VALUE));
        });

        it("converts the minimum int value without truncation",()->{
          context().doubleInput(()-> -2147483648d);
          assertThat(context().intOutput()).isEqualTo(Integer.valueOf(Integer.MIN_VALUE));
        });
        
        it("converts any value bigger than maximum int losing precision",()->{
          context().doubleInput(()-> Double.MAX_VALUE);
          assertThat(context().intOutput()).isEqualTo(Integer.valueOf(2147483647)); //Most significant bits are lost
        });

        it("converts any value smaller than minimum int losing precision",()->{
          context().doubleInput(()-> Double.MIN_VALUE);
          assertThat(context().intOutput()).isEqualTo(Integer.valueOf(0)); //Most significant bits are lost
        });

      });

    });
  }
}