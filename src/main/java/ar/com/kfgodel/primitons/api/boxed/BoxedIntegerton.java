package ar.com.kfgodel.primitons.api.boxed;

import static ar.com.kfgodel.primitons.api.basic.Objecton.newArrayOf;

/**
 * This type defines the primiton functions for the boxed integer type
 * Date: 29/07/17 - 14:29
 */
public interface BoxedIntegerton {
  static byte toByte(Integer input) {
    return Numberton.toByte(input);
  }

  static double toDouble(Integer input) {
    return Numberton.toDouble(input);
  }

  static float toFloat(Integer input) {
    return Numberton.toFloat(input);
  }

  static int toInt(Integer input) {
    return Numberton.toInt(input);
  }

  static long toLong(Integer input) {
    return Numberton.toLong(input);
  }

  static short toShort(Integer input) {
    return Numberton.toShort(input);
  }

  static Byte toBoxedByte(Integer input) {
    return (input == null)? null :toByte(input);
  }

  static Double toBoxedDouble(Integer input) {
    return (input == null)? null :toDouble(input);
  }

  static Float toBoxedFloat(Integer input) {
    return (input == null)? null :toFloat(input);
  }

  static Integer toBoxedInteger(Integer input) {
    return input;
  }

  static Long toBoxedLong(Integer input) {
    return (input == null)? null :toLong(input);
  }

  static Short toBoxedShort(Integer input) {
    return (input == null)? null :toShort(input);
  }

  static Integer[] toArray(Integer value) {
    return newArrayOf(Integer.class, value);
  }
}
