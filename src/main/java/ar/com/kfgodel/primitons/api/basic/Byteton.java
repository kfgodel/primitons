package ar.com.kfgodel.primitons.api.basic;

/**
 * This type defines the primiton functions for the primitive byte type
 * Date: 29/07/17 - 14:27
 */
public interface Byteton {

  static byte identity(byte input) {
    return input;
  }

  static short toShort(byte input) {
    return input;
  }
}
