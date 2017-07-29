package ar.com.kfgodel.primitons;

import ar.com.dgarcia.javaspec.api.JavaSpec;
import ar.com.dgarcia.javaspec.api.JavaSpecRunner;
import ar.com.kfgodel.primitons.api.basic.Longton;
import ar.com.kfgodel.primitons.api.exceptions.PrimitonException;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * This type verifies the behavior of the long to int converter
 * Created by kfgodel on 03/07/17.
 */
@RunWith(JavaSpecRunner.class)
public class Long2IntTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a long to int primiton", () -> {
      context().long2int(()-> Longton::toInt);

      describe("when used", () -> {
        context().intOutput(()-> context().long2int().applyAsInt(context().longInput()));

        it("converts a primitive long into a primitive int",()->{
          context().longInput(()-> 23L);
          assertThat(context().intOutput()).isEqualTo(23);
        });

        it("converts the maximum int value",()->{
          context().longInput(()-> 2147483647L);
          assertThat(context().intOutput()).isEqualTo(Integer.MAX_VALUE);
        });

        it("converts the minimum int value",()->{
          context().longInput(()-> -2147483648L);
          assertThat(context().intOutput()).isEqualTo(Integer.MIN_VALUE);
        });

        itThrows(PrimitonException.class, "if value is too big for an int",()->{
         context().long2int().applyAsInt(2147483648L);
        }, e ->{
          assertThat(e).hasMessage("Value[2147483648] overflows int type");
        });

        itThrows(PrimitonException.class, "if value is too small for an int",()->{
          context().long2int().applyAsInt(-2147483649L);
        }, e ->{
          assertThat(e).hasMessage("Value[-2147483649] underflows int type");
        });

      });

    });
  }
}