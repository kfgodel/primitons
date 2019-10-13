package ar.com.kfgodel.primitons.identity;

import ar.com.kfgodel.primitons.PrimitonTestContext;
import ar.com.kfgodel.primitons.api.basic.Doubleton;
import info.kfgodel.jspek.api.JavaSpec;
import info.kfgodel.jspek.api.JavaSpecRunner;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * This type verifies the identiy function
 * Date: 29/07/17 - 14:58
 */
@RunWith(JavaSpecRunner.class)
public class Double2DoubleTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a double to double primiton", () -> {
      context().double2double(()-> Doubleton::identity);

      describe("when used", () -> {
        context().doubleOutput(()-> context().double2double().apply(context().doubleInput()));

        it("returns same value as given",()->{
          context().doubleInput(()-> 3.0);
          assertThat(context().doubleOutput()).isEqualTo(3.0);
        });

      });
    });
  }
}