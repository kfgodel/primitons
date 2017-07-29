package ar.com.kfgodel.primitons;

import ar.com.dgarcia.javaspec.api.JavaSpec;
import ar.com.dgarcia.javaspec.api.JavaSpecRunner;
import ar.com.kfgodel.primitons.api.Primiton;
import com.google.common.collect.Lists;
import org.junit.runner.RunWith;

import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(JavaSpecRunner.class)
public class PrimitiveTypesTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("primiton", () -> {
      it("has the list of all the primitive types", () -> {
        assertThat(Primiton.types().collect(Collectors.toList()))
          .isEqualTo(Lists.newArrayList(
            boolean.class,
            byte.class,
            char.class,
            double.class,
            float.class,
            int.class,
            long.class,
            short.class,
            Boolean.class,
            Byte.class,
            Character.class,
            Double.class,
            Float.class,
            Integer.class,
            Long.class,
            Short.class,
            String.class,
            Object.class,
            boolean[].class,
            byte[].class,
            char[].class,
            double[].class,
            float[].class,
            int[].class,
            long[].class,
            short[].class,
            Boolean[].class,
            Byte[].class,
            Character[].class,
            Double[].class,
            Float[].class,
            Integer[].class,
            Long[].class,
            Short[].class,
            String[].class,
            Object[].class
          ));
      });
    });

  }
}