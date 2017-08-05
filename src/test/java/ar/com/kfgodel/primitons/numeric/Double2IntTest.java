package ar.com.kfgodel.primitons.numeric;

import ar.com.dgarcia.javaspec.api.JavaSpec;
import ar.com.dgarcia.javaspec.api.JavaSpecRunner;
import ar.com.kfgodel.primitons.PrimitonTestContext;
import ar.com.kfgodel.primitons.api.basic.Doubleton;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * This type verifies the behavior of the double to int converter
 * Created by kfgodel on 03/07/17.
 */
@RunWith(JavaSpecRunner.class)
public class Double2IntTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a double to int primiton", () -> {
      context().double2int(()-> Doubleton::toInt);

      describe("when used", () -> {
        context().intOutput(()-> context().double2int().apply(context().doubleInput()));

        it("converts a primitive double into a primitive int",()->{
          context().doubleInput(()-> 34.5d);
          assertThat(context().intOutput()).isEqualTo(34);
        });

        it("converts the maximum int value without truncation",()->{
          context().doubleInput(()-> 2147483647d);
          assertThat(context().intOutput()).isEqualTo(Integer.MAX_VALUE);
        });

        it("converts the minimum int value without truncation",()->{
          context().doubleInput(()-> -2147483648d);
          assertThat(context().intOutput()).isEqualTo(Integer.MIN_VALUE);
        });
        
        it("converts any value bigger than maximum int losing precision",()->{
          context().doubleInput(()-> Double.MAX_VALUE);
          assertThat(context().intOutput()).isEqualTo(2147483647); //Most significant bits are lost
        });

        it("converts any value smaller than minimum int losing precision",()->{
          context().doubleInput(()-> Double.MIN_VALUE);
          assertThat(context().intOutput()).isEqualTo(0); //Most significant bits are lost
        });

      });

    });
  }
}