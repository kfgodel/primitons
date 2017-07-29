package ar.com.kfgodel.primitons.api.boxed;

import ar.com.kfgodel.primitons.api.exceptions.PrimitonException;

/**
 * This type defines the primiton functions for the boxed boolean type
 */
public interface BoxedBooleanton {

  /**
   * Identity function for type completeness
   * @param value The value to return
   * @return The input value
   */
  static Boolean identity(Boolean value){
    return value;
  }

  static boolean toBoolean(Boolean value){
    if(value == null){
      throw new PrimitonException("Value[null] cannot be converted to boolean");
    }
    return value;
  }
}
