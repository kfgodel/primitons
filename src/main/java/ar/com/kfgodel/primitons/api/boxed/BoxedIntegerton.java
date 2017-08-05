package ar.com.kfgodel.primitons.api.boxed;

import ar.com.kfgodel.primitons.api.exceptions.UnmappableException;

/**
 * This type defines the primiton functions for the boxed integer type
 * Date: 29/07/17 - 14:29
 */
public interface BoxedIntegerton {
  static int toInt(Integer input) {
    if(input == null){
      throw new UnmappableException(input, int.class);
    }
    return input;
  }
}
