package ar.com.kfgodel.primitons.api.boxed;

/**
 * This type defines the primiton functions for the boxed double type
 * Date: 29/07/17 - 14:31
 */
public interface BoxedDoubleton {
  static byte toByte(Double input) {
    return Numberton.toByte(input);
  }

  static double toDouble(Double input) {
    return Numberton.toDouble(input);
  }

  static float toFloat(Double input) {
    return Numberton.toFloat(input);
  }

  static int toInt(Double input) {
    return Numberton.toInt(input);
  }

  static long toLong(Double input) {
    return Numberton.toLong(input);
  }

  static short toShort(Double input) {
    return Numberton.toShort(input);
  }
}
