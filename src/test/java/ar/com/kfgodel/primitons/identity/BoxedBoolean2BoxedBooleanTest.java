package ar.com.kfgodel.primitons.identity;

import ar.com.dgarcia.javaspec.api.JavaSpec;
import ar.com.dgarcia.javaspec.api.JavaSpecRunner;
import ar.com.kfgodel.primitons.PrimitonTestContext;
import ar.com.kfgodel.primitons.api.BoxedBooleanton;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Verifies the identity function for primitive type
 * Created by kfgodel on 23/07/17.
 */
@RunWith(JavaSpecRunner.class)
public class BoxedBoolean2BoxedBooleanTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a boolean to boolean primiton", () -> {
      context().boolean2boolean(()-> BoxedBooleanton::identity);

      describe("when used", () -> {
        context().booleanOutput(()-> context().boolean2boolean().apply(context().booleanInput()));

        it("returns true when given",()->{
          context().booleanInput(()-> Boolean.TRUE);
          assertThat(context().booleanOutput()).isSameAs(Boolean.TRUE);
        });

        it("returns false when given",()->{
          context().booleanInput(()-> Boolean.FALSE);
          assertThat(context().booleanOutput()).isSameAs(Boolean.FALSE);
        });

        it("returns null when given",()->{
          assertThat(context().boolean2boolean().apply(null)).isNull();
        });

      });
    });
  }
}