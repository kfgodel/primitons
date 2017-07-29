package ar.com.kfgodel.primitons.api.boxed;

import ar.com.kfgodel.primitons.api.exceptions.UnmappableException;

/**
 * This type defines the primiton functions for the boxed boolean type
 */
public interface BoxedBooleanton {

  static boolean toBoolean(Boolean value){
    if(value == null){
      throw new UnmappableException(value, boolean.class);
    }
    return value;
  }
}
