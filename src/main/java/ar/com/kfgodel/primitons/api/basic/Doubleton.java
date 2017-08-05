package ar.com.kfgodel.primitons.api.basic;

/**
 * This type defines the primiton functions for the primitive double type
 * Date: 29/07/17 - 14:31
 */
public interface Doubleton {
  static double identity(double input) {
    return input;
  }

  static float toFloat(double input) {
    return (float) input;
  }

  static byte toByte(double input) {
    return (byte) input;
  }

  static int toInt(double input) {
    return (int) input;
  }

  static long toLong(double input) {
    return (long) input;
  }

  static short toShort(double input) {
    return (short) input;
  }

  static Double toBoxedDouble(double input) {
    return input;
  }
}
