package ar.com.kfgodel.primitons.api.boxed;

import static ar.com.kfgodel.primitons.api.basic.Objecton.newArrayOf;

/**
 * This type defines the primiton functions for the boxed long type
 * Date: 29/07/17 - 14:30
 */
public interface BoxedLongton {
  static byte toByte(Long input) {
    return Numberton.toByte(input);
  }

  static double toDouble(Long input) {
    return Numberton.toDouble(input);
  }

  static float toFloat(Long input) {
    return Numberton.toFloat(input);
  }

  static int toInt(Long input) {
    return Numberton.toInt(input);
  }

  static long toLong(Long input) {
    return Numberton.toLong(input);
  }

  static short toShort(Long input) {
    return Numberton.toShort(input);
  }

  static Byte toBoxedByte(Long input) {
    return (input == null)? null :toByte(input);
  }

  static Double toBoxedDouble(Long input) {
    return (input == null)? null :toDouble(input);
  }

  static Float toBoxedFloat(Long input) {
    return (input == null)? null :toFloat(input);
  }

  static Integer toBoxedInteger(Long input) {
    return (input == null)? null :toInt(input);
  }

  static Long toBoxedLong(Long input) {
    return input;
  }

  static Short toBoxedShort(Long input) {
    return (input == null)? null :toShort(input);
  }

  static Long[] toArray(Long value) {
    return newArrayOf(Long.class, value);
  }
}
