package ar.com.kfgodel.primitons.boxing;

import ar.com.dgarcia.javaspec.api.JavaSpec;
import ar.com.dgarcia.javaspec.api.JavaSpecRunner;
import ar.com.kfgodel.primitons.PrimitonTestContext;
import ar.com.kfgodel.primitons.api.basic.Booleanton;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Verifies the basic conversions for primitive to object conversion
 * Created by kfgodel on 23/07/17.
 */
@RunWith(JavaSpecRunner.class)
public class Boolean2BoxedBooleanTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a boolean to Boolean primiton", () -> {
      context().boolean2boxedBoolean(()-> Booleanton::toBoxedBoolean);

      describe("when used", () -> {
        context().booleanOutput(()-> context().boolean2boxedBoolean().apply(context().booleanInput()));

        it("converts the primitive true into its object counterpart",()->{
          context().booleanInput(()-> true);
          assertThat(context().booleanOutput()).isSameAs(Boolean.TRUE);
        });

        it("converts the primitive false into its object counterpart",()->{
          context().booleanInput(()-> false);
          assertThat(context().booleanOutput()).isSameAs(Boolean.FALSE);
        });

      });

    });

  }
}