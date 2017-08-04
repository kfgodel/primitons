package ar.com.kfgodel.primitons.api.basic;

import ar.com.kfgodel.primitons.api.exceptions.OverflowException;
import ar.com.kfgodel.primitons.api.exceptions.PrimitonException;
import ar.com.kfgodel.primitons.api.exceptions.UnderflowException;

/**
 * This type defines the primiton functions for the primitive long type
 */
public interface Longton {

  static int toInt(long input) throws PrimitonException {
    if(input > Integer.MAX_VALUE){
      throw new OverflowException(input, int.class);
    }
    if(input < Integer.MIN_VALUE){
      throw new UnderflowException(input, int.class);
    }
    return (int) input;
  }

  static long identity(long input) {
    return input;
  }

  static double toDouble(long input) {
    return input;
  }
}
