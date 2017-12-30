package ar.com.kfgodel.primitons.impl;

import ar.com.kfgodel.nary.api.Nary;
import ar.com.kfgodel.nary.api.optionals.Optional;
import ar.com.kfgodel.primitons.api.repositories.TypeRepository;

import java.util.HashMap;
import java.util.Map;

/**
 * This type represents a type repository with the metadata about type sets and relationships
 * Date: 05/08/17 - 17:51
 */
public class TypeRepositoryImpl implements ar.com.kfgodel.primitons.api.repositories.TypeRepository {

  private Map<Class<?>,Class<?>> unboxedToBoxedTypes;
  private Map<Class<?>,Class<?>> boxedToUnboxedTypes;

  public static TypeRepository create() {
    TypeRepositoryImpl typeRepository = new TypeRepositoryImpl();
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
   * @return The set of classes that represent allPrimitiveTypes the primitive types convertible with primitons
   */
  @Override
  public Nary<Class<?>> allTypes() {
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
   * @return The sub-set of types that represent numericTypes values
   */
  @Override
  public Nary<Class<?>> numericTypes(){
    return Nary.of(
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
    );
  }

  @Override
  public Nary<Class<?>> alphabeticTypes() {
    return Nary.of(
      char.class,
      Character.class,
      String.class
    );
  }

  @Override
  public Nary<Class<?>> arrayTypes() {
    return allTypes()
      .filterNary(Class::isArray);
  }

  /**
   * @return The sub-set of primitive types that have an Object version (boxedTypes)
   */
  @Override
  public Nary<Class<?>> boxeableTypes() {
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
   * @return The sub-set of boxedTypes types that have a primitive version (unboxedTypes)
   */
  @Override
  public Nary<Class<?>> boxedTypes() {
    return Nary.of(
      Boolean.class,
      Byte.class,
      Character.class,
      Double.class,
      Float.class,
      Integer.class,
      Long.class,
      Short.class
    );
  }

  /**
   * Returns the boxedTypes type that corresponds to the given unboxedTypes type
   * @param unboxedType The primitive unboxedTypes type
   * @return The boxedTypes equivalent or empty if type doesn't have a boxedTypes equivalent
   */
  @Override
  public Optional<Class<?>> boxedFor(Class<?> unboxedType) {
    return findOptionalIn(unboxedToBoxedTypes, unboxedType);
  }

  @Override
  public Optional<Class<?>> unboxedFor(Class<?> boxedType) {
    return findOptionalIn(boxedToUnboxedTypes, boxedType);
  }

  @Override
  public Nary<Class<?>> booleanTypes() {
    return Nary.of(boolean.class, Boolean.class);
  }

  private Optional<Class<?>> findOptionalIn(Map<Class<?>, Class<?>> map, Class<?> key) {
    Class<?> value = map.get(key);
    return Optional.ofNullable(value);
  }
}
