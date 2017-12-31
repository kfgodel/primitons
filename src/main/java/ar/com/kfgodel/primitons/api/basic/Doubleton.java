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

  static Byte toBoxedByte(double input) {
    return toByte(input);
  }

  static Double toBoxedDouble(double input) {
    return input;
  }

  static Float toBoxedFloat(double input) {
    return toFloat(input);
  }

  static Integer toBoxedInteger(double input) {
    return toInt(input);
  }

  static Long toBoxedLong(double input) {
    return toLong(input);
  }

  static Short toBoxedShort(double input) {
    return toShort(input);
  }

  static double[] toArray(double value) {
    return new double[]{value};
  }
}
