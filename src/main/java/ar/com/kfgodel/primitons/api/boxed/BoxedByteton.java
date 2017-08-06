package ar.com.kfgodel.primitons.api.boxed;

/**
 * This type defines the primiton functions for the boxed byte type
 * Date: 29/07/17 - 14:28
 */
public interface BoxedByteton {
  static byte toByte(Byte input) {
    return Numberton.toByte(input);
  }

  static double toDouble(Byte input) {
    return Numberton.toDouble(input);
  }

  static float toFloat(Byte input) {
    return Numberton.toFloat(input);
  }

  static int toInt(Byte input) {
    return Numberton.toInt(input);
  }

  static long toLong(Byte input) {
    return Numberton.toLong(input);
  }

  static short toShort(Byte input) {
    return Numberton.toShort(input);
  }

  static Byte toBoxedByte(Byte input) {
    return input;
  }

  static Double toBoxedDouble(Byte input) {
    return (input == null)? null : toDouble(input);
  }

  static Float toBoxedFloat(Byte input) {
    return (input == null)? null : toFloat(input);
  }

  static Integer toBoxedInteger(Byte input) {
    return (input == null)? null : toInt(input);
  }

  static Long toBoxedLong(Byte input) {
    return (input == null)? null : toLong(input);
  }

  static Short toBoxedShort(Byte input) {
    return (input == null)? null : toShort(input);
  }
}
