package ar.com.kfgodel.primitons.api.boxed;

import static ar.com.kfgodel.primitons.api.basic.Objecton.newArrayOf;

/**
 * This type defines the primiton functions for the boxed double type
 * Date: 29/07/17 - 14:31
 */
public interface BoxedDoubleton {
  static byte toByte(Double input) {
    return Numberton.toByte(input);
  }

  static double toDouble(Double input) {
    return Numberton.toDouble(input);
  }

  static float toFloat(Double input) {
    return Numberton.toFloat(input);
  }

  static int toInt(Double input) {
    return Numberton.toInt(input);
  }

  static long toLong(Double input) {
    return Numberton.toLong(input);
  }

  static short toShort(Double input) {
    return Numberton.toShort(input);
  }

  static Byte toBoxedByte(Double input) {
    return (input == null)? null : toByte(input);
  }

  static Double toBoxedDouble(Double input) {
    return input;
  }

  static Float toBoxedFloat(Double input) {
    return (input == null)? null : toFloat(input);
  }

  static Integer toBoxedInteger(Double input) {
    return (input == null)? null : toInt(input);
  }

  static Long toBoxedLong(Double input) {
    return (input == null)? null : toLong(input);
  }

  static Short toBoxedShort(Double input) {
    return (input == null)? null : toShort(input);
  }

  static Double[] toArray(Double value) {
    return newArrayOf(Double.class, value);
  }
}
