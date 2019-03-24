package ar.com.kfgodel.primitons.api.basic;

import java.lang.reflect.Array;

/**
 * This type defines the primiton functions for the primitive Object type
 * Date: 29/07/17 - 17:16
 */
public interface Objecton {
  static<T> T identity(T input) {
    return input;
  }

  static Object[] toArray(Object value) {
    return newArrayOf(Object.class, value);
  }

  static String toString(Object value) {
    return String.valueOf(value);
  }

  /**
   * Creates a new 1 element array with the given element in it
   * @param elementType The class that defines the type of elements for the array
   * @param value The value to use as only element
   * @param <E> The type of elements
   * @return The created array
   */
  static<E> E[] newArrayOf(Class<E> elementType, E value) {
    E[] createdArray = (E[]) Array.newInstance(elementType, 1);
    createdArray[0] = value;
    return createdArray;
  }
}
