package ar.com.kfgodel.primitons.arraying;

import ar.com.dgarcia.javaspec.api.JavaSpec;
import ar.com.dgarcia.javaspec.api.JavaSpecRunner;
import ar.com.kfgodel.primitons.PrimitonTestContext;
import ar.com.kfgodel.primitons.api.boxed.BoxedBooleanton;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Verifies the basic conversions for basic to array conversion
 * Created by kfgodel on 30/12/17.
 */
@RunWith(JavaSpecRunner.class)
public class BoxedBoolean2ArrayOfBoxedBooleanTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a boolean to array of boolean primiton", () -> {
      context().boxedBoolean2ArrayOfBoxedBoolean(()-> BoxedBooleanton::toArray);

      describe("when used", () -> {
        context().boxedBooleanArrayOutput(()-> context().boxedBoolean2ArrayOfBoxedBoolean().apply(context().booleanInput()));

        it("converts the given boolean into an array containing that boolean",()->{
          context().booleanInput(()-> Boolean.TRUE);
          assertThat(context().boxedBooleanArrayOutput()).isEqualTo(new Boolean[]{true});
        });

      });

    });

  }
}