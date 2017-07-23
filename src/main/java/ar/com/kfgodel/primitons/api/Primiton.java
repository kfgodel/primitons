package ar.com.kfgodel.primitons.api;

import ar.com.kfgodel.primitons.api.exceptions.PrimitonException;

/**
 * This type defines the converter functions
 * Created by kfgodel on 03/07/17.
 */
public interface Primiton {

  static Boolean boolean2Boolean(boolean value){
    return value;
  }

  static boolean Boolean2boolean(Boolean value){
    if(value == null){
      throw new PrimitonException("Value[null] cannot be converted to boolean");
    }
    return value;
  }

  static long int2long(int input){
    return input;
  }

  static int long2int(long input) throws PrimitonException {
    if(input > Integer.MAX_VALUE){
      throw new PrimitonException("Value["+input+"] overflows int type");
    }
    if(input < Integer.MIN_VALUE){
      throw new PrimitonException("Value["+input+"] underflows int type");
    }
    return (int) input;
  }

}
