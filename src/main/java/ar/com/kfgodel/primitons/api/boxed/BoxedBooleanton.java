package ar.com.kfgodel.primitons.api.boxed;

import ar.com.kfgodel.primitons.api.exceptions.UnmappableException;

import static ar.com.kfgodel.primitons.api.basic.Objecton.newArrayOf;

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

  static Boolean[] toArray(Boolean value) {
    return newArrayOf(Boolean.class, value);
  }
}
