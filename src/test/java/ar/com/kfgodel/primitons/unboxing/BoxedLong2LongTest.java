package ar.com.kfgodel.primitons.unboxing;

import ar.com.dgarcia.javaspec.api.JavaSpec;
import ar.com.dgarcia.javaspec.api.JavaSpecRunner;
import ar.com.kfgodel.primitons.PrimitonTestContext;
import ar.com.kfgodel.primitons.api.boxed.BoxedLongton;
import ar.com.kfgodel.primitons.api.exceptions.UnmappableException;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Verifies the basic conversions for object to primitive conversion
 * Created by kfgodel on 23/07/17.
 */
@RunWith(JavaSpecRunner.class)
public class BoxedLong2LongTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a Long to long primiton", () -> {
      context().boxedLong2Long(()-> BoxedLongton::toLong);

      describe("when used", () -> {
        context().longOutput(()-> context().boxedLong2Long().apply(context().longInput()));

        it("converts the object to its primitive counterpart",()->{
          context().longInput(()-> Long.valueOf(7));
          assertThat(context().longOutput()).isEqualTo(7);
        });

        itThrows(UnmappableException.class, "if value is null",()->{
          context().boxedLong2Long().apply(null);
        }, e ->{
          assertThat(e).hasMessage("Value[null] is not convertible to type [long]");
        });

      });

    });

  }
}