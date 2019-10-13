package ar.com.kfgodel.primitons.textual.boxed;

import ar.com.kfgodel.primitons.PrimitonTestContext;
import ar.com.kfgodel.primitons.api.basic.Strington;
import ar.com.kfgodel.primitons.api.exceptions.UnmappableException;
import info.kfgodel.jspek.api.JavaSpec;
import info.kfgodel.jspek.api.JavaSpecRunner;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * This class verifies the conversion from a string to Boolean
 * Date: 24/03/19 - 16:38
 */
@RunWith(JavaSpecRunner.class)
public class String2BoxedBooleanTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a String to Boolean primiton", () -> {
      context().string2BoxedBoolean(()-> Strington::toBoxedBoolean);

      describe("when used", () -> {
        context().booleanOutput(()-> context().string2BoxedBoolean().apply(context().stringInput()));

        it("converts 'true' into a Boolean",()->{
          context().stringInput(()-> "true");
          assertThat(context().booleanOutput()).isEqualTo(Boolean.TRUE);
        });
        it("converts 'false' into a Boolean",()->{
          context().stringInput(()-> "false");
          assertThat(context().booleanOutput()).isEqualTo(Boolean.FALSE);
        });

        itThrows(UnmappableException.class, "if the input is not one of the boolean values",()->{
          context().stringInput(()-> "NaN");
          context().booleanOutput(); // Excercise
        }, e->{
          assertThat(e).hasMessage("Value[NaN] is not convertible to type [class java.lang.Boolean]");
        });

        it("converts 'null' into null",()->{
          context().stringInput(()-> "null");
          assertThat(context().booleanOutput()).isNull();
        });
        it("converts null into null",()->{
          context().stringInput(()-> null);
          assertThat(context().booleanOutput()).isNull();
        });

      });
    });
  }
}
