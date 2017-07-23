package ar.com.kfgodel.primitons;

import ar.com.dgarcia.javaspec.api.JavaSpec;
import ar.com.dgarcia.javaspec.api.JavaSpecRunner;
import ar.com.kfgodel.primitons.api.Primiton;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Verifies the basic conversions for primitive to object conversion
 * Created by kfgodel on 23/07/17.
 */
@RunWith(JavaSpecRunner.class)
public class PrimitiveBoolean2ObjectBooleanTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a boolean to Boolean primiton", () -> {
      context().boolean2boolean(()-> Primiton::boolean2Boolean);

      describe("when used", () -> {
        context().booleanOutput(()-> context().boolean2boolean().apply(context().booleanInput()));

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