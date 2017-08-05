package ar.com.kfgodel.primitons.api.boxed;

import ar.com.kfgodel.primitons.api.exceptions.UnmappableException;

/**
 * This type defines the primiton functions for the boxed float type
 * Date: 29/07/17 - 14:31
 */
public interface BoxedFloaton {
  static float toFloat(Float input) {
    if(input == null){
      throw new UnmappableException(input, float.class);
    }
    return input;
  }
}
