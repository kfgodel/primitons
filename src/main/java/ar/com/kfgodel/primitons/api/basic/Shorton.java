package ar.com.kfgodel.primitons.api.basic;

/**
 * This type defines the primiton functions for the primitive short type
 * Date: 29/07/17 - 14:28
 */
public interface Shorton {
  static short identity(short input) {
    return input;
  }

  static int toInt(short input) {
    return input;
  }

  static double toDouble(short input) {
    return input;
  }

  static float toFloat(short input) {
    return input;
  }

  static long toLong(short input) {
    return input;
  }

  static byte toByte(short input) {
    return (byte) input;
  }

  static Byte toBoxedByte(short input) {
    return toByte(input);
  }

  static Double toBoxedDouble(short input) {
    return toDouble(input);
  }

  static Float toBoxedFloat(short input) {
    return toFloat(input);
  }

  static Integer toBoxedInteger(short input) {
    return toInt(input);
  }

  static Long toBoxedLong(short input) {
    return toLong(input);
  }

  static Short toBoxedShort(short input) {
    return input;
  }
}
