package ar.com.kfgodel.primitons.api.boxed;

import ar.com.kfgodel.primitons.api.exceptions.UnmappableException;

/**
 * This type defines the primiton functions for the boxed double type
 * Date: 29/07/17 - 14:31
 */
public interface BoxedDoubleton {
  static double toDouble(Double input) {
    if(input == null){
      throw new UnmappableException(input, double.class);
    }
    return input;
  }
}
