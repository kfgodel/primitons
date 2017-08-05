package ar.com.kfgodel.primitons.numeric;

import ar.com.dgarcia.javaspec.api.JavaSpec;
import ar.com.dgarcia.javaspec.api.JavaSpecRunner;
import ar.com.kfgodel.primitons.PrimitonTestContext;
import ar.com.kfgodel.primitons.api.basic.Floaton;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * This type verifies the behavior of the float to int converter
 * Created by kfgodel on 03/07/17.
 */
@RunWith(JavaSpecRunner.class)
public class Float2IntTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a float to int primiton", () -> {
      context().float2int(()-> Floaton::toInt);

      describe("when used", () -> {
        context().intOutput(()-> context().float2int().apply(context().floatInput()));

        it("converts a primitive float into a primitive int",()->{
          context().floatInput(()-> 88_000.5f);
          assertThat(context().intOutput()).isEqualTo(88_000);
        });

        it("converts the maximum int value without truncation",()->{
          context().floatInput(()-> 2147483647f);
          assertThat(context().intOutput()).isEqualTo(Integer.MAX_VALUE);
        });

        it("converts the minimum int value without truncation",()->{
          context().floatInput(()-> -2147483648f);
          assertThat(context().intOutput()).isEqualTo(Integer.MIN_VALUE);
        });
        
        it("converts any value bigger than maximum int losing precision",()->{
          context().floatInput(()-> Float.MAX_VALUE);
          assertThat(context().intOutput()).isEqualTo(2147483647); //Most significant bits are lost
        });

        it("converts any value smaller than minimum int losing precision",()->{
          context().floatInput(()-> Float.MIN_VALUE);
          assertThat(context().intOutput()).isEqualTo(0); //Most significant bits are lost
        });

      });

    });
  }
}