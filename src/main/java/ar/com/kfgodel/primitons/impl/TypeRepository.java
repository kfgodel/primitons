package ar.com.kfgodel.primitons.impl;

import ar.com.kfgodel.nary.api.Nary;
import ar.com.kfgodel.nary.api.optionals.Optional;

import java.util.HashMap;
import java.util.Map;

/**
 * This type represents a type repository with the metadata about type sets and relationships
 * Date: 05/08/17 - 17:51
 */
public class TypeRepository {

  private Map<Class<?>,Class<?>> unboxedToBoxedTypes;
  private Map<Class<?>,Class<?>> boxedToUnboxedTypes;

  public static TypeRepository create() {
    TypeRepository typeRepository = new TypeRepository();
    typeRepository.boxedToUnboxedTypes = new HashMap<>();
    typeRepository.unboxedToBoxedTypes = new HashMap<>();
    typeRepository.initialize();
    return typeRepository;
  }

  private void initialize() {
    initializeUnboxedtoBoxed();
    initializeBoxedToUnboxed();
  }

  private void initializeUnboxedtoBoxed() {
    unboxedToBoxedTypes.put(boolean.class, Boolean.class);
    unboxedToBoxedTypes.put(byte.class, Byte.class);
    unboxedToBoxedTypes.put(char.class, Character.class);
    unboxedToBoxedTypes.put(double.class, Double.class);
    unboxedToBoxedTypes.put(float.class, Float.class);
    unboxedToBoxedTypes.put(int.class, Integer.class);
    unboxedToBoxedTypes.put(long.class, Long.class);
    unboxedToBoxedTypes.put(short.class, Short.class);
  }

  private void initializeBoxedToUnboxed() {
    unboxedToBoxedTypes.forEach((unboxedType, boxedType) ->{
      boxedToUnboxedTypes.put(boxedType, unboxedType);
    });
  }

  /**
   * @return The set of classes that represent all the primitive types convertible with primitons
   */
  public Nary<Class<?>> types() {
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

  /**
   * @return The sub-set of types that represent numeric values
   */
  public Nary<Class<?>> numericTypes(){
    return Nary.of(
      byte.class,
      double.class,
      float.class,
      int.class,
      long.class,
      short.class
    );
  }

  /**
   * @return The sub-set of types that have an Object version (boxed)
   */
  public Nary<Class<?>> unboxedTypes() {
    return Nary.of(
      boolean.class,
      byte.class,
      char.class,
      double.class,
      float.class,
      int.class,
      long.class,
      short.class
    );
  }

  /**
   * Returns the boxed type that corresponds to the given unboxed type
   * @param unboxedType The primitive unboxed type
   * @return The boxed equivalent or empty if type doesn't have a boxed equivalent
   */
  public Optional<Class<?>> boxedTypeFor(Class<?> unboxedType) {
    Class<?> boxedType = unboxedToBoxedTypes.get(unboxedType);
    return Optional.ofNullable(boxedType);
  }
}
