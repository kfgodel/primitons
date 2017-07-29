package ar.com.kfgodel.primitons.api.basic;

/**
 * This type defines the primiton functions for the primitive boolean type
 */
public interface Booleanton {

  /**
   * The identity function for type completeness
   * @param value The value to be returned
   * @return The input value
   */
  static boolean identity(boolean value){
    return value;
  }

  static Boolean toBoxedBoolean(boolean value){
    return value;
  }
}
