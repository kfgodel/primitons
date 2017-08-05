package ar.com.kfgodel.primitons.numeric;

import ar.com.dgarcia.javaspec.api.JavaSpec;
import ar.com.dgarcia.javaspec.api.JavaSpecRunner;
import ar.com.kfgodel.nary.api.Nary;
import ar.com.kfgodel.nary.api.optionals.Optional;
import ar.com.kfgodel.primitons.PrimitonTestContext;
import ar.com.kfgodel.primitons.api.Primiton;
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
      numericTypes().forEach(sourceNumericType -> {
        numericTypes().forEach(targetNumericType -> {
          it("has a conversion function from " + sourceNumericType.getSimpleName() + " to " + targetNumericType.getSimpleName() ,()->{
            Optional converter = Primiton.converterFrom(sourceNumericType, targetNumericType);
            assertThat(converter.isPresent()).isTrue();
          });
        });
      });
    });
  }

  private Nary<Class<?>> numericTypes(){
    return Nary.of(
      byte.class,
      double.class,
      float.class,
      int.class,
      long.class,
      short.class
    );
  }
}