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
      Boolean.class,
      byte.class,
      Byte.class,
      short.class,
      Short.class,
      int.class,
      Integer.class,
      long.class,
      Long.class,
      float.class,
      Float.class,
      double.class,
      Double.class,
      char.class,
      Character.class,
      String.class,
      Object.class,
      boolean[].class,
      byte[].class,
      short[].class,
      int[].class,
      long[].class,
      float[].class,
      double[].class,
      char[].class,
      String[].class,
      Object[].class
    );
  }

  static <I,O> Optional<Function<I,O>> converterFrom(Class<I> inputType, Class<O> outputType) {
    return REPOSITY.getConverterFrom(inputType, outputType);
  }
}
