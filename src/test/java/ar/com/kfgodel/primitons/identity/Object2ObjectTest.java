package ar.com.kfgodel.primitons.identity;

import ar.com.dgarcia.javaspec.api.JavaSpec;
import ar.com.dgarcia.javaspec.api.JavaSpecRunner;
import ar.com.kfgodel.primitons.PrimitonTestContext;
import ar.com.kfgodel.primitons.api.basic.Objecton;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * This type verifies the identiy function
 * Date: 29/07/17 - 14:58
 */
@RunWith(JavaSpecRunner.class)
public class Object2ObjectTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a Object to Object primiton", () -> {
      context().object2Object(()-> Objecton::identity);

      describe("when used", () -> {
        context().objectOutput(()-> context().object2Object().apply(context().objectInput()));

        it("returns same value as given",()->{
          context().objectInput(()-> new Object());
          assertThat(context().objectOutput()).isSameAs(context().objectInput());
        });

      });
    });
  }
}