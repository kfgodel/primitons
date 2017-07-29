package ar.com.kfgodel.primitons.api;

/**
 * This type defines the primiton functions for the primnitive boolean type
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
