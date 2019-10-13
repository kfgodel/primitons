package ar.com.kfgodel.primitons.unboxing;

import ar.com.kfgodel.primitons.PrimitonTestContext;
import ar.com.kfgodel.primitons.api.boxed.BoxedIntegerton;
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
public class BoxedInteger2IntTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a Integer to int primiton", () -> {
      context().boxedInteger2Int(()-> BoxedIntegerton::toInt);

      describe("when used", () -> {
        context().intOutput(()-> context().boxedInteger2Int().apply(context().intInput()));

        it("converts the object to its primitive counterpart",()->{
          context().intInput(()-> Integer.valueOf(7));
          assertThat(context().intOutput()).isEqualTo(7);
        });

        itThrows(UnmappableException.class, "if value is null",()->{
          context().boxedInteger2Int().apply(null);
        }, e ->{
          assertThat(e).hasMessage("Value[null] is not convertible to type [int]");
        });

      });

    });

  }
}