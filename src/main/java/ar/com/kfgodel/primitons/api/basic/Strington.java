package ar.com.kfgodel.primitons.api.basic;

import ar.com.kfgodel.primitons.api.exceptions.UnmappableException;

/**
 * This type defines the primiton functions for the primitive String type
 * Date: 29/07/17 - 14:33
 */
public interface Strington {

  static boolean toBoolean(String value) {
    // We don't use Boolean::parse because it accepts anything as false
    if("true".equals(value)){
      return true;
    } else if("false".equals(value)){
      return false;
    }
    throw new UnmappableException(value, boolean.class);
  }
  static Boolean toBoxedBoolean(String value) {
    if(value == null || "null".equals(value)){
      return null;
    }
    try {
      return toBoolean(value);
    } catch (UnmappableException e) {
      throw new UnmappableException(value, Boolean.class);
    }
  }

  static byte toByte(String value) {
    try {
      return Byte.parseByte(value);
    } catch (Exception e) {
      throw new UnmappableException(value, byte.class, e);
    }
  }
  static Byte toBoxedByte(String value) {
    if(value == null || "null".equals(value)){
      return null;
    }
    try {
      return Byte.valueOf(toByte(value));
    } catch (UnmappableException e) {
      throw new UnmappableException(value, Byte.class, e.getCause());
    }
  }

  static char toChar(String value) {
    if(value == null || value.length() != 1) {
      throw new UnmappableException(value, char.class);
    }
    return value.charAt(0);
  }
  static Character toBoxedCharacter(String value) {
    if(value == null || "null".equals(value)){
      return null;
    }
    try {
      return toChar(value);
    } catch (UnmappableException e) {
      throw new UnmappableException(value, Character.class);
    }
  }


  static double toDouble(String value) {
    try {
      return Double.parseDouble(value);
    } catch (Exception e) {
      throw new UnmappableException(value, double.class, e);
    }
  }
  static Double toBoxedDouble(String value) {
    if(value == null || "null".equals(value)){
      return null;
    }
    try {
      return toDouble(value);
    } catch (UnmappableException e) {
      throw new UnmappableException(value, Double.class, e.getCause());
    }
  }

  static float toFloat(String value) {
    try {
      return Float.parseFloat(value);
    } catch (Exception e) {
      throw new UnmappableException(value, float.class, e);
    }
  }
  static Float toBoxedFloat(String value) {
    if(value == null || "null".equals(value)){
      return null;
    }
    try {
      return toFloat(value);
    } catch (UnmappableException e) {
      throw new UnmappableException(value, Float.class, e.getCause());
    }
  }

  static int toInt(String value) {
    try {
      return Integer.parseInt(value);
    } catch (Exception e) {
      throw new UnmappableException(value, int.class, e);
    }
  }
  static Integer toBoxedInteger(String value) {
    if(value == null || "null".equals(value)){
      return null;
    }
    try {
      return toInt(value);
    } catch (UnmappableException e) {
      throw new UnmappableException(value, Integer.class, e.getCause());
    }
  }

  static long toLong(String value) {
    try {
      return Long.parseLong(value);
    } catch (Exception e) {
      throw new UnmappableException(value, long.class, e);
    }
  }
  static Long toBoxedLong(String value) {
    if(value == null || "null".equals(value)){
      return null;
    }
    try {
      return toLong(value);
    } catch (UnmappableException e) {
      throw new UnmappableException(value, Long.class, e.getCause());
    }
  }

  static short toShort(String value) {
    try {
      return Short.parseShort(value);
    } catch (Exception e) {
      throw new UnmappableException(value, short.class, e);
    }
  }
  static Short toBoxedShort(String value) {
    if(value == null || "null".equals(value)){
      return null;
    }
    try {
      return toShort(value);
    } catch (UnmappableException e) {
      throw new UnmappableException(value, Short.class, e.getCause());
    }
  }

  static String[] toArray(String value) {
    return new String[]{value};
  }
}
