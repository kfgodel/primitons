package ar.com.kfgodel.primitons.api.boxed;

import ar.com.kfgodel.primitons.api.exceptions.UnmappableException;

/**
 * This type defines the primiton functions for the boxed byte type
 * Date: 29/07/17 - 14:28
 */
public interface BoxedByteton {
  static byte toByte(Byte input) {
    if(input == null){
      throw new UnmappableException(input, byte.class);
    }
    return input;
  }
}
