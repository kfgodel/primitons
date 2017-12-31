package ar.com.kfgodel.primitons.api.basic;

/**
 * This type defines the primiton functions for the primitive byte type
 * Date: 29/07/17 - 14:27
 */
public interface Byteton {

  static byte identity(byte input) {
    return input;
  }

  static short toShort(byte input) {
    return input;
  }

  static int toInt(byte input) {
    return input;
  }

  static long toLong(byte input) {
    return input;
  }

  static float toFloat(byte input) {
    return input;
  }

  static double toDouble(byte input) {
    return input;
  }

  static Byte toBoxedByte(byte input) {
    return input;
  }

  static Double toBoxedDouble(byte input) {
    return toDouble(input);
  }

  static Float toBoxedFloat(byte input) {
    return toFloat(input);
  }

  static Integer toBoxedInteger(byte input) {
    return toInt(input);
  }

  static Long toBoxedLong(byte input) {
    return toLong(input);
  }

  static Short toBoxedShort(byte input) {
    return toShort(input);
  }

  static byte[] toArray(byte value) {
    return new byte[]{value};
  }
}
