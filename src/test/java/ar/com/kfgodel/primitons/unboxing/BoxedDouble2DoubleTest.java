package ar.com.kfgodel.primitons.unboxing;

import ar.com.kfgodel.primitons.PrimitonTestContext;
import ar.com.kfgodel.primitons.api.boxed.BoxedDoubleton;
import ar.com.kfgodel.primitons.api.exceptions.UnmappableException;
import info.kfgodel.jspek.api.JavaSpec;
import info.kfgodel.jspek.api.JavaSpecRunner;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Verifies the basic conversions for object to primitive conversion
 * Created by kfgodel on 23/07/17.
 */
@RunWith(JavaSpecRunner.class)
public class BoxedDouble2DoubleTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a Double to double primiton", () -> {
      context().boxedDouble2Double(()-> BoxedDoubleton::toDouble);

      describe("when used", () -> {
        context().doubleOutput(()-> context().boxedDouble2Double().apply(context().doubleInput()));

        it("converts the object to its primitive counterpart",()->{
          context().doubleInput(()-> Double.valueOf(1.25d));
          assertThat(context().doubleOutput()).isEqualTo(1.25d);
        });

        itThrows(UnmappableException.class, "if value is null",()->{
          context().boxedDouble2Double().apply(null);
        }, e ->{
          assertThat(e).hasMessage("Value[null] is not convertible to type [double]");
        });

      });

    });

  }
}