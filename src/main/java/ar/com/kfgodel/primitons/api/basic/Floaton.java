package ar.com.kfgodel.primitons.api.basic;

/**
 * This type defines the primiton functions for the primitive float type
 * Date: 29/07/17 - 14:30
 */
public interface Floaton {
  static float identity(float input) {
    return input;
  }

  static double toDouble(float input) {
    return input;
  }

  static byte toByte(float input) {
    return (byte) input;
  }

  static int toInt(float input) {
    return (int) input;
  }

  static long toLong(float input) {
    return (long) input;
  }

  static short toShort(float input) {
    return (short) input;
  }
}
