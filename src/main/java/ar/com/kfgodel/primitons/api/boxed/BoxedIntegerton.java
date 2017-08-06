package ar.com.kfgodel.primitons.api.boxed;

/**
 * This type defines the primiton functions for the boxed integer type
 * Date: 29/07/17 - 14:29
 */
public interface BoxedIntegerton {
  static byte toByte(Integer input) {
    return Numberton.toByte(input);
  }

  static double toDouble(Integer input) {
    return Numberton.toDouble(input);
  }

  static float toFloat(Integer input) {
    return Numberton.toFloat(input);
  }

  static int toInt(Integer input) {
    return Numberton.toInt(input);
  }

  static long toLong(Integer input) {
    return Numberton.toLong(input);
  }

  static short toShort(Integer input) {
    return Numberton.toShort(input);
  }
}
