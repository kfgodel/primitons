package ar.com.kfgodel.primitons.impl;

import ar.com.kfgodel.nary.api.Nary;
import ar.com.kfgodel.nary.api.optionals.Optional;
import ar.com.kfgodel.primitons.api.exceptions.PrimitonException;
import ar.com.kfgodel.primitons.api.repositories.TypeRepository;
import com.google.common.collect.Sets;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * This type represents a type repository with the metadata about type sets and relationships
 * Date: 05/08/17 - 17:51
 */
public class TypeRepositoryImpl implements ar.com.kfgodel.primitons.api.repositories.TypeRepository {

  private Map<Class<?>,Class<?>> unboxedToBoxedTypes;
  private Map<Class<?>,Class<?>> boxedToUnboxedTypes;


  private Set<Class<?>> allTypes = Sets.newHashSet(
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
  );

  private Set<Class<?>> primitiveTypes = Sets.newHashSet(
    boolean.class,
    byte.class,
    char.class,
    double.class,
    float.class,
    int.class,
    long.class,
    short.class,
    void.class
  );

  private Set<Class<?>> numericTypes = Sets.newHashSet(
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

  private Set<Class<?>> booleanTypes = Sets.newHashSet(
    boolean.class,
    Boolean.class
  );

  private Set<Class<?>> alphabeticTypes = Sets.newHashSet(
    char.class,
    Character.class,
    String.class
  );

  private Set<Class<?>> voidTypes = Sets.newHashSet(
    void.class,
    Void.class
  );

  public static TypeRepository create() {
    TypeRepositoryImpl typeRepository = new TypeRepositoryImpl();
    typeRepository.boxedToUnboxedTypes = new HashMap<>();
    typeRepository.unboxedToBoxedTypes = new HashMap<>();
    typeRepository.initialize();
    return typeRepository;
  }

  private void initialize() {
    initializeBoxedRelationships();
  }

  private void initializeBoxedRelationships() {
    addBoxingRelationship(boolean.class, Boolean.class);
    addBoxingRelationship(byte.class, Byte.class);
    addBoxingRelationship(char.class, Character.class);
    addBoxingRelationship(double.class, Double.class);
    addBoxingRelationship(float.class, Float.class);
    addBoxingRelationship(int.class, Integer.class);
    addBoxingRelationship(long.class, Long.class);
    addBoxingRelationship(short.class, Short.class);
    addBoxingRelationship(void.class, Void.class);
  }

  private void addBoxingRelationship(Class<?> boxeableType, Class<?> boxedType) {
    unboxedToBoxedTypes.put(boxeableType, boxedType);
    boxedToUnboxedTypes.put(boxedType, boxeableType);
  }

  /**
   * @return The set of classes that represent allPrimitiveTypes the primitive types convertible with primitons
   */
  @Override
  public Nary<Class<?>> allTypes() {
    return Nary.create(allTypes);
  }

  @Override
  public Nary<Class<?>> primitiveTypes() {
    return Nary.create(primitiveTypes);
  }

  @Override
  public Nary<Class<?>> nonPrimitiveTypes() {
    return allTypes()
      .filterNary(type-> !primitiveTypes.contains(type));
  }

  /**
   * @return The sub-set of types that represent numericTypes values
   */
  @Override
  public Nary<Class<?>> numericTypes(){
    return Nary.create(numericTypes);
  }

  @Override
  public Nary<Class<?>> alphabeticTypes() {
    return Nary.create(alphabeticTypes);
  }

  @Override
  public Nary<Class<?>> arrayTypes() {
    return allTypes()
      .filterNary(Class::isArray);
  }

  @Override
  public Nary<Class<?>> arrayableTypes() {
    return allTypes()
      .filterNary(type -> !type.isArray())
      .filterNary(type -> !voidTypes.contains(type));
  }

  @Override
  public Nary<Class<?>> voidTypes() {
    return Nary.create(voidTypes);
  }

  /**
   * @return The sub-set of primitive types that have an Object version (boxedTypes)
   */
  @Override
  public Nary<Class<?>> boxeableTypes() {
    return primitiveTypes();
  }

  /**
   * @return The sub-set of boxedTypes types that have a primitive version (unboxedTypes)
   */
  @Override
  public Nary<Class<?>> boxedTypes() {
    return Nary.create(boxedToUnboxedTypes.keySet());
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
  public Optional<Class<?>> elementTypeOf(Class<?> anArrayType) {
    Class<?> componentType = anArrayType.getComponentType();
    return Optional.ofNullable(componentType);
  }

  @Override
  public Class<?> arrayTypeOf(Class<?> elementType) {
    Object temporarilyCreatedArray = null;
    try {
      temporarilyCreatedArray = Array.newInstance(elementType, 0);
    } catch (IllegalArgumentException e) {
      throw new PrimitonException("There's no valid array type for the given element type["+elementType+"]");
    }
    return temporarilyCreatedArray.getClass();
  }

  @Override
  public Nary<Class<?>> booleanTypes() {
    return Nary.create(booleanTypes);
  }

  private Optional<Class<?>> findOptionalIn(Map<Class<?>, Class<?>> map, Class<?> key) {
    Class<?> value = map.get(key);
    return Optional.ofNullable(value);
  }
}
