package ar.com.kfgodel.primitons.api;

import ar.com.kfgodel.primitons.api.exceptions.PrimitonException;

/**
 * This type defines the primiton functions for the primitive long type
 */
public interface Longton {
  static int toInt(long input) throws PrimitonException {
    if(input > Integer.MAX_VALUE){
      throw new PrimitonException("Value["+input+"] overflows int type");
    }
    if(input < Integer.MIN_VALUE){
      throw new PrimitonException("Value["+input+"] underflows int type");
    }
    return (int) input;
  }
}
