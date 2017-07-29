package ar.com.kfgodel.primitons.api;

import ar.com.kfgodel.nary.api.Nary;
import ar.com.kfgodel.nary.api.optionals.Optional;
import ar.com.kfgodel.primitons.impl.PrimitonReposity;

import java.util.function.Function;

/**
 * This type defines the converter functions
 * Created by kfgodel on 03/07/17.
 */
public interface Primiton {

  /**
   * Default repository with information of all the primiton functions
   */
  public static final PrimitonReposity REPOSITY = PrimitonReposity.create();

  /**
   * @return The set of classes that represent all the primitive types
   */
  static Nary<Class<?>> types() {
    return Nary.of(
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
    );
  }

  static <I,O> Optional<Function<I,O>> converterFrom(Class<I> inputType, Class<O> outputType) {
    return REPOSITY.getConverterFrom(inputType, outputType);
  }
}
