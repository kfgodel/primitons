package ar.com.kfgodel.primitons.numeric;

import ar.com.kfgodel.nary.api.optionals.Optional;
import ar.com.kfgodel.primitons.PrimitonTestContext;
import ar.com.kfgodel.primitons.api.Primiton;
import info.kfgodel.jspek.api.JavaSpec;
import info.kfgodel.jspek.api.JavaSpecRunner;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Date: 05/08/17 - 14:40
 */
@RunWith(JavaSpecRunner.class)
public class NumericConversionTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("primiton", () -> {
      Primiton.types().numericTypes().forEach(sourceNumericType -> {
        Primiton.types().numericTypes().forEach(targetNumericType -> {
          it("has a conversion function from " + sourceNumericType.getSimpleName() + " to " + targetNumericType.getSimpleName() ,()->{
            Optional converter = Primiton.converterFrom(sourceNumericType, targetNumericType);
            assertThat(converter.isPresent()).isTrue();
          });
        });
      });
    });
  }

}