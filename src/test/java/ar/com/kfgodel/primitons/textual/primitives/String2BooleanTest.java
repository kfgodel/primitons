package ar.com.kfgodel.primitons.textual.primitives;

import ar.com.kfgodel.primitons.PrimitonTestContext;
import ar.com.kfgodel.primitons.api.basic.Strington;
import ar.com.kfgodel.primitons.api.exceptions.UnmappableException;
import info.kfgodel.jspek.api.JavaSpec;
import info.kfgodel.jspek.api.JavaSpecRunner;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * This class verifies the conversion from a string to boolean
 * Date: 24/03/19 - 16:38
 */
@RunWith(JavaSpecRunner.class)
public class String2BooleanTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a String to boolean primiton", () -> {
      context().string2Boolean(()-> Strington::toBoolean);

      describe("when used", () -> {
        context().booleanOutput(()-> context().string2Boolean().apply(context().stringInput()));

        it("converts 'true' into a primitive boolean",()->{
          context().stringInput(()-> "true");
          assertThat(context().booleanOutput()).isEqualTo(true);
        });
        it("converts 'false' into a primitive boolean",()->{
          context().stringInput(()-> "false");
          assertThat(context().booleanOutput()).isEqualTo(false);
        });

        itThrows(UnmappableException.class, "if the input is not one of the boolean values",()->{
          context().stringInput(()-> "NaN");
          context().booleanOutput(); // Excercise
        }, e->{
          assertThat(e).hasMessage("Value[NaN] is not convertible to type [boolean]");
        });

        itThrows(UnmappableException.class, "if the input is null",()->{
          context().stringInput(()-> null);
          context().booleanOutput(); // Excercise
        }, e->{
          assertThat(e).hasMessage("Value[null] is not convertible to type [boolean]");
        });


      });
    });
  }
}
