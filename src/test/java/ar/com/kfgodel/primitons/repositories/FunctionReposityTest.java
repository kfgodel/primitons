package ar.com.kfgodel.primitons.repositories;

import ar.com.dgarcia.javaspec.api.JavaSpec;
import ar.com.dgarcia.javaspec.api.JavaSpecRunner;
import ar.com.kfgodel.nary.api.optionals.Optional;
import ar.com.kfgodel.primitons.PrimitonTestContext;
import ar.com.kfgodel.primitons.impl.FunctionReposityImpl;
import org.junit.runner.RunWith;

import java.util.function.Function;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Date: 30/12/17 - 21:37
 */
@RunWith(JavaSpecRunner.class)
public class FunctionReposityTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a function repository", () -> {
      context().functionRepository(FunctionReposityImpl::create);

      it("returns an empty optional when no function is defined for a conversion", () -> {
        Optional<Function<String, Object>> converter = context().functionRepository().getConverterFrom(String.class, Object.class);
        assertThat(converter.isAbsent()).isTrue();
      });
      
      it("returns a function when one is defined for the conversion",()->{
        Function<String, Object> converter = (string) -> string;
        context().functionRepository().addConverterFrom(String.class, Object.class, converter);

        Optional<Function<String, Object>> result = context().functionRepository().getConverterFrom(String.class, Object.class);
        assertThat(result.get()).isSameAs(converter);
      });

    });

  }
}