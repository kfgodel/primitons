package ar.com.kfgodel.primitons.arraying;

import ar.com.kfgodel.primitons.PrimitonTestContext;
import ar.com.kfgodel.primitons.api.basic.Objecton;
import info.kfgodel.jspek.api.JavaSpec;
import info.kfgodel.jspek.api.JavaSpecRunner;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Verifies the basic conversions for basic to array conversion
 * Created by kfgodel on 30/12/17.
 */
@RunWith(JavaSpecRunner.class)
public class Object2ArrayOfObjectTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a object to array of object primiton", () -> {
      context().object2ArrayOfObject(()-> Objecton::toArray);

      describe("when used", () -> {
        context().objectArrayOutput(()-> context().object2ArrayOfObject().apply(context().objectInput()));

        it("converts the given object into an array containing that object",()->{
          Object objeto = new Object();
          context().objectInput(()-> objeto);
          assertThat(context().objectArrayOutput()).isEqualTo(new Object[]{objeto});
        });

      });

    });

  }
}