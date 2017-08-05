package ar.com.kfgodel.primitons.unboxing;

import ar.com.dgarcia.javaspec.api.JavaSpec;
import ar.com.dgarcia.javaspec.api.JavaSpecRunner;
import ar.com.kfgodel.primitons.PrimitonTestContext;
import ar.com.kfgodel.primitons.api.boxed.BoxedFloaton;
import ar.com.kfgodel.primitons.api.exceptions.UnmappableException;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Verifies the basic conversions for object to primitive conversion
 * Created by kfgodel on 23/07/17.
 */
@RunWith(JavaSpecRunner.class)
public class BoxedFloat2FloatTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a Float to float primiton", () -> {
      context().boxedFloat2Float(()-> BoxedFloaton::toFloat);

      describe("when used", () -> {
        context().floatOutput(()-> context().boxedFloat2Float().apply(context().floatInput()));

        it("converts the object to its primitive counterpart",()->{
          context().floatInput(()-> Float.valueOf(1.28f));
          assertThat(context().floatOutput()).isEqualTo(1.28f);
        });

        itThrows(UnmappableException.class, "if value is null",()->{
          context().boxedFloat2Float().apply(null);
        }, e ->{
          assertThat(e).hasMessage("Value[null] is not convertible to type [float]");
        });

      });

    });

  }
}