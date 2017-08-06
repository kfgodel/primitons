package ar.com.kfgodel.primitons.api.boxed;

import ar.com.kfgodel.primitons.impl.asserts.Null;

/**
 * This type defines the primiton functions for sub-classes of Number type
 * Date: 06/08/17 - 12:10
 */
public interface Numberton {

  static byte toByte(Number input) {
    Null.unmappableTo(byte.class, input);
    return input.byteValue();
  }

  static double toDouble(Number input) {
    Null.unmappableTo(double.class, input);
    return input.doubleValue();
  }

  static float toFloat(Number input) {
    Null.unmappableTo(float.class, input);
    return input.floatValue();
  }

  static int toInt(Number input) {
    Null.unmappableTo(int.class, input);
    return input.intValue();
  }

  static long toLong(Number input) {
    Null.unmappableTo(long.class, input);
    return input.longValue();
  }

  static short toShort(Number input) {
    Null.unmappableTo(short.class, input);
    return input.shortValue();
  }

}
