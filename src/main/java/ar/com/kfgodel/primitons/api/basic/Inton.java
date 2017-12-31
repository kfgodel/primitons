package ar.com.kfgodel.primitons.api.basic;

/**
 * This type defines the primiton functions for the primitive int type
 */
public interface Inton {

  static long toLong(int input){
    return input;
  }

  static int identity(int input) {
    return input;
  }

  static double toDouble(int input) {
    return input;
  }

  static float toFloat(int input) {
    return input;
  }

  static short toShort(int input) {
    return (short) input;
  }

  static byte toByte(int input) {
    return (byte) input;
  }

  static Byte toBoxedByte(int input) {
    return toByte(input);
  }

  static Double toBoxedDouble(int input) {
    return toDouble(input);
  }

  static Float toBoxedFloat(int input) {
    return toFloat(input);
  }

  static Integer toBoxedInteger(int input) {
    return input;
  }

  static Long toBoxedLong(int input) {
    return toLong(input);
  }

  static Short toBoxedShort(int input) {
    return toShort(input);
  }

  static int[] toArray(int value) {
    return new int[]{value};
  }
}
