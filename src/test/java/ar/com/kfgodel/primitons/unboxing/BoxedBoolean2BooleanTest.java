package ar.com.kfgodel.primitons.unboxing;

import ar.com.dgarcia.javaspec.api.JavaSpec;
import ar.com.dgarcia.javaspec.api.JavaSpecRunner;
import ar.com.kfgodel.primitons.PrimitonTestContext;
import ar.com.kfgodel.primitons.api.boxed.BoxedBooleanton;
import ar.com.kfgodel.primitons.api.exceptions.UnmappableException;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Verifies the basic conversions for object to primitive conversion
 * Created by kfgodel on 23/07/17.
 */
@RunWith(JavaSpecRunner.class)
public class BoxedBoolean2BooleanTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a Boolean to boolean primiton", () -> {
      context().boxedBoolean2Boolean(()-> BoxedBooleanton::toBoolean);

      describe("when used", () -> {
        context().booleanOutput(()-> context().boxedBoolean2Boolean().apply(context().booleanInput()));

        it("converts the object TRUE to its primitive counterpart",()->{
          context().booleanInput(()-> Boolean.TRUE);
          assertThat(context().booleanOutput()).isEqualTo(true);
        });

        it("converts the object FALSE to its primitive counterpart",()->{
          context().booleanInput(()-> Boolean.FALSE);
          assertThat(context().booleanOutput()).isEqualTo(false);
        });

        itThrows(UnmappableException.class, "if value is null",()->{
          context().boxedBoolean2Boolean().apply(null);
        }, e ->{
          assertThat(e).hasMessage("Value[null] is not convertible to type [boolean]");
        });

      });

    });

  }
}