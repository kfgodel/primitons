package ar.com.kfgodel.primitons.api.boxed;

/**
 * This type defines the primiton functions for the boxed float type
 * Date: 29/07/17 - 14:31
 */
public interface BoxedFloaton {
  static byte toByte(Float input) {
    return Numberton.toByte(input);
  }

  static double toDouble(Float input) {
    return Numberton.toDouble(input);
  }

  static float toFloat(Float input) {
    return Numberton.toFloat(input);
  }

  static int toInt(Float input) {
    return Numberton.toInt(input);
  }

  static long toLong(Float input) {
    return Numberton.toLong(input);
  }

  static short toShort(Float input) {
    return Numberton.toShort(input);
  }
}
