package ar.com.kfgodel.primitons.api.repositories;

import ar.com.kfgodel.nary.api.Nary;
import ar.com.kfgodel.nary.api.optionals.Optional;

/**
 * This type represents the storage for information about primitive types relationships
 *
 * Date: 30/12/17 - 16:29
 */
public interface TypeRepository {

  /**
   * All the classes that represent primiton types (primitives and some basic object types)
   * @return A nary containing primitives, boxedTypes, boolean, alphabetic, numeric and array types
   */
  Nary<Class<?>> allTypes();

  /**
   * All the classes that represent primitive java types
   * @return The eigth types that representes values plus void
   */
  Nary<Class<?>> primitiveTypes();

  /**
   * All the classes that are primiton types but do not represent a primitive java type
   * @return A Nary of all the non primitive types
   */
  Nary<Class<?>> nonPrimitiveTypes();

  /**
   * Returns the boxed and unboxed boolean types
   * @return The nary containing boolean types
   */
  Nary<Class<?>> booleanTypes();

  /**
   * All the classes that represent primitive numeric types
   * @return A nary cotaining boxed and unboxed numeric types
   */
  Nary<Class<?>> numericTypes();

  /**
   * All the classes that represent alphabetic types
   * @return A nary containing boxed and boxeable numeric types
   */
  Nary<Class<?>> alphabeticTypes();

  /**
   * All the classes that represent void types
   * @return A nary of void.class and Void.class
   */
  Nary<Class<?>> voidTypes();

  /**
   * All the classes that represent array types of primitive types
   * @return A nary containing all the basic array types
   */
  Nary<Class<?>> arrayTypes();

  /**
   * All the classes that can be used as element type of an array.<br>
   *   Void types are excluded
   * @return A nary consisting of classes that are not array types or void
   */
  Nary<Class<?>> arrayableTypes();

  /**
   * All the classes that represent primitive types (numeric and alpha) that have a boxed alternative
   * @return The Nary of primitive unboxed types
   */
  Nary<Class<?>> boxeableTypes();

  /**
   * All the classes that represent boxed types (object versions of unboxedTypes types)
   * @return A nary containing allPrimitiveTypes object types
   */
  Nary<Class<?>> boxedTypes();

  /**
   * Returns the boxedTypes version of the unboxed type
   * @param unboxedType The primitive unboxed type
   * @return The boxedTypes version or empty if none is found
   */
  Optional<Class<?>> boxedFor(Class<?> unboxedType);

  /**
   * Returns the unboxedTypes version of the boxed type
   * @param boxedType The object version of a primitive type
   * @return The unboxedTypes version for that type
   */
  Optional<Class<?>> unboxedFor(Class<?> boxedType);

  /**
   * Returns the class that represents the type of elements the array holds
   * @param anArrayType An array type
   * @return The class for the element type or empty if the input is not an array type
   */
  Optional<Class<?>> elementTypeOf(Class<?> anArrayType);

  /**
   * Returns the class that represents the array holding elements of the given type
   * @param elementType The type of element for the array
   * @return The class that represents the array type
   */
  Class<?> arrayTypeOf(Class<?> elementType);

}
