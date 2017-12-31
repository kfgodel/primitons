package ar.com.kfgodel.primitons.api.basic;

/**
 * This type defines the primiton functions for the primitive Object type
 * Date: 29/07/17 - 17:16
 */
public interface Objecton {
  static<T> T identity(T input) {
    return input;
  }

  static Object[] toArray(Object value) {
    return new Object[]{value};
  }
}
