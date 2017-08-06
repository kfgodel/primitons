package ar.com.kfgodel.primitons.api.boxed;

/**
 * This type defines the primiton functions for the boxed long type
 * Date: 29/07/17 - 14:30
 */
public interface BoxedLongton {
  static byte toByte(Long input) {
    return Numberton.toByte(input);
  }

  static double toDouble(Long input) {
    return Numberton.toDouble(input);
  }

  static float toFloat(Long input) {
    return Numberton.toFloat(input);
  }

  static int toInt(Long input) {
    return Numberton.toInt(input);
  }

  static long toLong(Long input) {
    return Numberton.toLong(input);
  }

  static short toShort(Long input) {
    return Numberton.toShort(input);
  }
}
