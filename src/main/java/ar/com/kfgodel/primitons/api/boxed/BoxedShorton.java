package ar.com.kfgodel.primitons.api.boxed;

import ar.com.kfgodel.primitons.api.exceptions.UnmappableException;

/**
 * This type defines the primiton functions for the boxed short type
 * Date: 29/07/17 - 14:29
 */
public interface BoxedShorton {
  static short toShort(Short input) {
    if(input == null){
      throw new UnmappableException(input, short.class);
    }
    return input;
  }
}
