package ar.com.kfgodel.primitons.api.boxed;

import static ar.com.kfgodel.primitons.api.basic.Objecton.newArrayOf;

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

  static Byte toBoxedByte(Float input) {
    return (input == null)? null : toByte(input);
  }

  static Double toBoxedDouble(Float input) {
    return (input == null)? null : toDouble(input);
  }

  static Float toBoxedFloat(Float input) {
    return input;
  }

  static Integer toBoxedInteger(Float input) {
    return (input == null)? null : toInt(input);
  }

  static Long toBoxedLong(Float input) {
    return (input == null)? null : toLong(input);
  }

  static Short toBoxedShort(Float input) {
    return (input == null)? null : toShort(input);
  }

  static Float[] toArray(Float value) {
    return newArrayOf(Float.class, value);
  }
}
