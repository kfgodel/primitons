package ar.com.kfgodel.primitons.boxing;

import ar.com.dgarcia.javaspec.api.JavaSpec;
import ar.com.dgarcia.javaspec.api.JavaSpecRunner;
import ar.com.kfgodel.primitons.PrimitonTestContext;
import ar.com.kfgodel.primitons.api.Primiton;
import ar.com.kfgodel.primitons.api.exceptions.PrimitonException;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Verifies the basic conversions for objecto to primitive conversion
 * Created by kfgodel on 23/07/17.
 */
@RunWith(JavaSpecRunner.class)
public class ObjectBoolean2PrimitiveBooleanTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a Boolean to boolean primiton", () -> {
      context().boolean2boolean(()-> Primiton::Boolean2boolean);

      describe("when used", () -> {
        context().booleanOutput(()-> context().boolean2boolean().apply(context().booleanInput()));

        it("converts the object TRUE to its primitive counterpart",()->{
          context().booleanInput(()-> Boolean.TRUE);
          assertThat(context().booleanOutput()).isEqualTo(true);
        });

        it("converts the object FALSE to its primitive counterpart",()->{
          context().booleanInput(()-> Boolean.FALSE);
          assertThat(context().booleanOutput()).isEqualTo(false);
        });

        itThrows(PrimitonException.class, "if value is null",()->{
          context().boolean2boolean().apply(null);
        }, e ->{
          assertThat(e).hasMessage("Value[null] cannot be converted to boolean");
        });

      });

    });

  }
}