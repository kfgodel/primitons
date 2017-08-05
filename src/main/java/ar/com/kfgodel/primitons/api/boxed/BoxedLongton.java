package ar.com.kfgodel.primitons.api.boxed;

import ar.com.kfgodel.primitons.api.exceptions.UnmappableException;

/**
 * This type defines the primiton functions for the boxed long type
 * Date: 29/07/17 - 14:30
 */
public interface BoxedLongton {
  static long toLong(Long input) {
    if(input == null){
      throw new UnmappableException(input, long.class);
    }
    return input;
  }
}
