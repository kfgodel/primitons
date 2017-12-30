package ar.com.kfgodel.primitons.repositories;

import ar.com.dgarcia.javaspec.api.JavaSpec;
import ar.com.dgarcia.javaspec.api.JavaSpecRunner;
import ar.com.kfgodel.primitons.PrimitonTestContext;
import ar.com.kfgodel.primitons.impl.TypeRepositoryImpl;
import com.google.common.collect.Lists;
import org.junit.runner.RunWith;

import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Date: 30/12/17 - 17:01
 */
@RunWith(JavaSpecRunner.class)
public class TypeRepositoryTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a type repository", () -> {
      context().typeRepository(TypeRepositoryImpl::create);

      it("knows all the primitive types", () -> {
        assertThat(context().typeRepository().allTypes().collect(Collectors.toList()))
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

      it("knwos all the boolean types", () -> {
        assertThat(context().typeRepository().booleanTypes().collect(Collectors.toList()))
          .isEqualTo(Lists.newArrayList(
            boolean.class,
            Boolean.class
          ));
      });

      it("knows all the numericTypes types", () -> {
        assertThat(context().typeRepository().numericTypes().collect(Collectors.toList()))
          .isEqualTo(Lists.newArrayList(
            byte.class,
            double.class,
            float.class,
            int.class,
            long.class,
            short.class,
            Byte.class,
            Double.class,
            Float.class,
            Integer.class,
            Long.class,
            Short.class
          ));
      });

      it("knows all the alphabetic types", () -> {
        assertThat(context().typeRepository().alphabeticTypes().collect(Collectors.toList()))
          .isEqualTo(Lists.newArrayList(
            char.class,
            Character.class,
            String.class
          ));
      });

      it("knows all the array types", () -> {
        assertThat(context().typeRepository().arrayTypes().collect(Collectors.toList()))
          .isEqualTo(Lists.newArrayList(
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

      it("knows all the boxed types", () -> {
        assertThat(context().typeRepository().boxedTypes().collect(Collectors.toList()))
          .isEqualTo(Lists.newArrayList(
            Boolean.class,
            Byte.class,
            Character.class,
            Double.class,
            Float.class,
            Integer.class,
            Long.class,
            Short.class
          ));
      });

      it("knows all the boxeable types", () -> {
        assertThat(context().typeRepository().boxeableTypes().collect(Collectors.toList()))
          .isEqualTo(Lists.newArrayList(
            boolean.class,
            byte.class,
            char.class,
            double.class,
            float.class,
            int.class,
            long.class,
            short.class
          ));
      });

    });

  }
}