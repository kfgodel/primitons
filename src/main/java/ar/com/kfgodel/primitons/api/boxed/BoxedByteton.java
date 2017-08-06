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

  static double toDouble(Byte input) {
    if(input == null){
      throw new UnmappableException(input, double.class);
    }
    return input.doubleValue();
  }

  static float toFloat(Byte input) {
    if(input == null){
      throw new UnmappableException(input, float.class);
    }
    return input.floatValue();
  }

  static int toInt(Byte input) {
    if(input == null){
      throw new UnmappableException(input, int.class);
    }
    return input.intValue();
  }

  static long toLong(Byte input) {
    if(input == null){
      throw new UnmappableException(input, long.class);
    }
    return input.longValue();
  }

  static short toShort(Byte input) {
    if(input == null){
      throw new UnmappableException(input, short.class);
    }
    return input.shortValue();
  }
}
