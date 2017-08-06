package ar.com.kfgodel.primitons.numeric.boxing;

import ar.com.dgarcia.javaspec.api.JavaSpec;
import ar.com.dgarcia.javaspec.api.JavaSpecRunner;
import ar.com.kfgodel.primitons.PrimitonTestContext;
import ar.com.kfgodel.primitons.api.basic.Longton;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * This type verifies the behavior of the long to int converter
 * Created by kfgodel on 03/07/17.
 */
@RunWith(JavaSpecRunner.class)
public class Long2BoxedIntegerTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a long to Integer primiton", () -> {
      context().long2BoxedInteger(()-> Longton::toBoxedInteger);

      describe("when used", () -> {
        context().intOutput(()-> context().long2BoxedInteger().apply(context().longInput()));

        it("converts a primitive long into an Integer",()->{
          context().longInput(()-> 23L);
          assertThat(context().intOutput()).isEqualTo(Integer.valueOf(23));
        });

        it("converts the maximum int value without truncation",()->{
          context().longInput(()-> 2147483647L);
          assertThat(context().intOutput()).isEqualTo(Integer.valueOf(Integer.MAX_VALUE));
        });

        it("converts the minimum int value without truncation",()->{
          context().longInput(()-> -2147483648L);
          assertThat(context().intOutput()).isEqualTo(Integer.valueOf(Integer.MIN_VALUE));
        });
        
        it("converts any value bigger than maximum int with truncation",()->{
          context().longInput(()-> Long.MAX_VALUE);
          assertThat(context().intOutput()).isEqualTo(Integer.valueOf(-1)); //Most significant bits are lost
        });

        it("converts any value smaller than minimum int with truncation",()->{
          context().longInput(()-> Long.MIN_VALUE);
          assertThat(context().intOutput()).isEqualTo(Integer.valueOf(0)); //Most significant bits are lost
        });

      });

    });
  }
}