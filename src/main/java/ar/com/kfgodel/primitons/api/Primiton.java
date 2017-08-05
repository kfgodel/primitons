package ar.com.kfgodel.primitons.api;

import ar.com.kfgodel.nary.api.Nary;
import ar.com.kfgodel.nary.api.optionals.Optional;
import ar.com.kfgodel.primitons.impl.PrimitonReposity;
import ar.com.kfgodel.primitons.impl.TypeRepository;

import java.util.function.Function;

/**
 * This type defines the converter functions
 * Created by kfgodel on 03/07/17.
 */
public interface Primiton {

  /**
   * Default repository with information of all the primiton functions
   */
  public static final PrimitonReposity FUNCTION_REPOSITY = PrimitonReposity.create();
  /**
   * Default repository with information of type relationships
   */
  public static final TypeRepository TYPE_REPOSITORY = TypeRepository.create();

  /**
   * @return The set of classes that represent all the primitive types convertible with primitons
   */
  static Nary<Class<?>> types() {
    return TYPE_REPOSITORY.types();
  }

  /**
   * @return The sub-set of types that represent numeric values
   */
  static Nary<Class<?>> numericTypes(){
    return TYPE_REPOSITORY.numericTypes();
  }

  /**
   * @return The sub-set of types that have an Object version (boxed)
   */
  static Nary<Class<?>> unboxedTypes() {
    return TYPE_REPOSITORY.unboxedTypes();
  }

  /**
   * Returns the boxed type that corresponds to the given unboxed type
   * @param unboxedType The primitive unboxed type
   * @return The boxed equivalent or empty if type doesn't have a boxed equivalent
   */
  static Optional<Class<?>> boxedTypeFor(Class<?> unboxedType) {
    return TYPE_REPOSITORY.boxedTypeFor(unboxedType);
  }


  static <I,O> Optional<Function<I,O>> converterFrom(Class<I> inputType, Class<O> outputType) {
    return FUNCTION_REPOSITY.getConverterFrom(inputType, outputType);
  }

}
