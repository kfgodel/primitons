package ar.com.kfgodel.primitons.unboxing;

import ar.com.dgarcia.javaspec.api.JavaSpec;
import ar.com.dgarcia.javaspec.api.JavaSpecRunner;
import ar.com.kfgodel.primitons.PrimitonTestContext;
import ar.com.kfgodel.primitons.api.boxed.BoxedShorton;
import ar.com.kfgodel.primitons.api.exceptions.UnmappableException;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Verifies the basic conversions for object to primitive conversion
 * Created by kfgodel on 23/07/17.
 */
@RunWith(JavaSpecRunner.class)
public class BoxedShort2ShortTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a Short to short primiton", () -> {
      context().boxedShort2Short(()-> BoxedShorton::toShort);

      describe("when used", () -> {
        context().shortOutput(()-> context().boxedShort2Short().apply(context().shortInput()));

        it("converts the object to its primitive counterpart",()->{
          context().shortInput(()-> Short.valueOf((short)-17));
          assertThat(context().shortOutput()).isEqualTo((short)-17);
        });

        itThrows(UnmappableException.class, "if value is null",()->{
          context().boxedShort2Short().apply(null);
        }, e ->{
          assertThat(e).hasMessage("Value[null] is not convertible to type [short]");
        });

      });

    });

  }
}