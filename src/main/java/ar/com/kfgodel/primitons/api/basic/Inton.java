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

  static Integer toBoxedInteger(int input) {
    return input;
  }
}
