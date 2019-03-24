package ar.com.kfgodel.primitons.api.basic;

import ar.com.kfgodel.primitons.api.exceptions.PrimitonException;

/**
 * This type defines the primiton functions for the primitive long type
 */
public interface Longton {

  static int toInt(long input) throws PrimitonException {
    return (int) input;
  }

  static long identity(long input) {
    return input;
  }

  static double toDouble(long input) {
    return input;
  }

  static short toShort(long input) {
    return (short) input;
  }

  static String toString(long input) {
    return String.valueOf(input);
  }

  static byte toByte(long input) {
    return (byte) input;
  }

  static float toFloat(long input) {
    return input;
  }

  static Byte toBoxedByte(long input) {
    return toByte(input);
  }

  static Double toBoxedDouble(long input) {
    return toDouble(input);
  }

  static Float toBoxedFloat(long input) {
    return toFloat(input);
  }

  static Integer toBoxedInteger(long input) {
    return toInt(input);
  }

  static Long toBoxedLong(long input) {
    return input;
  }

  static Short toBoxedShort(long input) {
    return toShort(input);
  }

  static long[] toArray(long value) {
    return new long[]{value};
  }
}
