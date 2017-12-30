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

      it("knows all the primiton types", () -> {
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
            void.class,
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
            Void.class,
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

      it("knwos all the primitive types", () -> {
        assertThat(context().typeRepository().primitiveTypes().collect(Collectors.toList()))
          .isEqualTo(Lists.newArrayList(
            boolean.class,
            byte.class,
            char.class,
            double.class,
            float.class,
            int.class,
            long.class,
            short.class,
            void.class
          ));
      });

      it("knows all the non primitive types", () -> {
        assertThat(context().typeRepository().nonPrimitiveTypes().collect(Collectors.toList()))
          .isEqualTo(Lists.newArrayList(
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
            Void.class,
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

      it("knows all the boolean types", () -> {
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
            Short.class,
            Void.class
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
            short.class,
            void.class
          ));
      });

      describe("when asking the boxed version", () -> {
        it("returns the boxed type for each boxeable type", () -> {
          assertThat(context().typeRepository().boxedFor(boolean.class).get()).isEqualTo(Boolean.class);
          assertThat(context().typeRepository().boxedFor(byte.class).get()).isEqualTo(Byte.class);
          assertThat(context().typeRepository().boxedFor(char.class).get()).isEqualTo(Character.class);
          assertThat(context().typeRepository().boxedFor(double.class).get()).isEqualTo(Double.class);
          assertThat(context().typeRepository().boxedFor(float.class).get()).isEqualTo(Float.class);
          assertThat(context().typeRepository().boxedFor(int.class).get()).isEqualTo(Integer.class);
          assertThat(context().typeRepository().boxedFor(long.class).get()).isEqualTo(Long.class);
          assertThat(context().typeRepository().boxedFor(short.class).get()).isEqualTo(Short.class);
          assertThat(context().typeRepository().boxedFor(void.class).get()).isEqualTo(Void.class);
        });
        it("returns empty if non boxeable input given", () -> {
          assertThat(context().typeRepository().boxedFor(Object.class).isAbsent()).isTrue();
        });
      });

      describe("when asking the unboxed version", () -> {
        it("returns the boxed type for each boxeable type", () -> {
          assertThat(context().typeRepository().unboxedFor(Boolean.class).get()).isEqualTo(boolean.class);
          assertThat(context().typeRepository().unboxedFor(Byte.class).get()).isEqualTo(byte.class);
          assertThat(context().typeRepository().unboxedFor(Character.class).get()).isEqualTo(char.class);
          assertThat(context().typeRepository().unboxedFor(Double.class).get()).isEqualTo(double.class);
          assertThat(context().typeRepository().unboxedFor(Float.class).get()).isEqualTo(float.class);
          assertThat(context().typeRepository().unboxedFor(Integer.class).get()).isEqualTo(int.class);
          assertThat(context().typeRepository().unboxedFor(Long.class).get()).isEqualTo(long.class);
          assertThat(context().typeRepository().unboxedFor(Short.class).get()).isEqualTo(short.class);
          assertThat(context().typeRepository().unboxedFor(Void.class).get()).isEqualTo(void.class);
        });
        it("returns empty if non boxed input given", () -> {
          assertThat(context().typeRepository().boxedFor(Object.class).isAbsent()).isTrue();
        });
      });

      describe("when asking the element type of given array", () -> {
        it("returns the element type of the array",()->{
          assertThat(context().typeRepository().elementTypeOf(boolean[].class).get()).isEqualTo(boolean.class);
          assertThat(context().typeRepository().elementTypeOf(byte[].class).get()).isEqualTo(byte.class);
          assertThat(context().typeRepository().elementTypeOf(char[].class).get()).isEqualTo(char.class);
          assertThat(context().typeRepository().elementTypeOf(double[].class).get()).isEqualTo(double.class);
          assertThat(context().typeRepository().elementTypeOf(float[].class).get()).isEqualTo(float.class);
          assertThat(context().typeRepository().elementTypeOf(int[].class).get()).isEqualTo(int.class);
          assertThat(context().typeRepository().elementTypeOf(long[].class).get()).isEqualTo(long.class);
          assertThat(context().typeRepository().elementTypeOf(short[].class).get()).isEqualTo(short.class);
          assertThat(context().typeRepository().elementTypeOf(Boolean[].class).get()).isEqualTo(Boolean.class);
          assertThat(context().typeRepository().elementTypeOf(Byte[].class).get()).isEqualTo(Byte.class);
          assertThat(context().typeRepository().elementTypeOf(Character[].class).get()).isEqualTo(Character.class);
          assertThat(context().typeRepository().elementTypeOf(Double[].class).get()).isEqualTo(Double.class);
          assertThat(context().typeRepository().elementTypeOf(Float[].class).get()).isEqualTo(Float.class);
          assertThat(context().typeRepository().elementTypeOf(Integer[].class).get()).isEqualTo(Integer.class);
          assertThat(context().typeRepository().elementTypeOf(Long[].class).get()).isEqualTo(Long.class);
          assertThat(context().typeRepository().elementTypeOf(Short[].class).get()).isEqualTo(Short.class);
          assertThat(context().typeRepository().elementTypeOf(String[].class).get()).isEqualTo(String.class);
          assertThat(context().typeRepository().elementTypeOf(Object[].class).get()).isEqualTo(Object.class);
        });

        it("returns empty if given input is not an array",()->{
          assertThat(context().typeRepository().elementTypeOf(Object.class).isAbsent()).isTrue();
        });
      });

      describe("when asking the array version of the given type", () -> {
        it("returns the element type of the array",()->{
          assertThat(context().typeRepository().arrayTypeOf(boolean.class)).isEqualTo(boolean[].class);
          assertThat(context().typeRepository().arrayTypeOf(byte.class)).isEqualTo(byte[].class);
          assertThat(context().typeRepository().arrayTypeOf(char.class)).isEqualTo(char[].class);
          assertThat(context().typeRepository().arrayTypeOf(double.class)).isEqualTo(double[].class);
          assertThat(context().typeRepository().arrayTypeOf(float.class)).isEqualTo(float[].class);
          assertThat(context().typeRepository().arrayTypeOf(int.class)).isEqualTo(int[].class);
          assertThat(context().typeRepository().arrayTypeOf(long.class)).isEqualTo(long[].class);
          assertThat(context().typeRepository().arrayTypeOf(short.class)).isEqualTo(short[].class);
          assertThat(context().typeRepository().arrayTypeOf(Boolean.class)).isEqualTo(Boolean[].class);
          assertThat(context().typeRepository().arrayTypeOf(Byte.class)).isEqualTo(Byte[].class);
          assertThat(context().typeRepository().arrayTypeOf(Character.class)).isEqualTo(Character[].class);
          assertThat(context().typeRepository().arrayTypeOf(Double.class)).isEqualTo(Double[].class);
          assertThat(context().typeRepository().arrayTypeOf(Float.class)).isEqualTo(Float[].class);
          assertThat(context().typeRepository().arrayTypeOf(Integer.class)).isEqualTo(Integer[].class);
          assertThat(context().typeRepository().arrayTypeOf(Long.class)).isEqualTo(Long[].class);
          assertThat(context().typeRepository().arrayTypeOf(Short.class)).isEqualTo(Short[].class);
          assertThat(context().typeRepository().arrayTypeOf(String.class)).isEqualTo(String[].class);
          assertThat(context().typeRepository().arrayTypeOf(Object.class)).isEqualTo(Object[].class);
        });
      });


    });

  }
}