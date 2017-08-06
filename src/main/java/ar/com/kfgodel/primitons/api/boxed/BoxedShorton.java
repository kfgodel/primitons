package ar.com.kfgodel.primitons.api.boxed;

/**
 * This type defines the primiton functions for the boxed short type
 * Date: 29/07/17 - 14:29
 */
public interface BoxedShorton {
  static byte toByte(Short input) {
    return Numberton.toByte(input);
  }

  static double toDouble(Short input) {
    return Numberton.toDouble(input);
  }

  static float toFloat(Short input) {
    return Numberton.toFloat(input);
  }

  static int toInt(Short input) {
    return Numberton.toInt(input);
  }

  static long toLong(Short input) {
    return Numberton.toLong(input);
  }

  static short toShort(Short input) {
    return Numberton.toShort(input);
  }
}
