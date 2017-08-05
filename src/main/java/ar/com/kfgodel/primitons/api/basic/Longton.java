package ar.com.kfgodel.primitons.api.basic;

import ar.com.kfgodel.primitons.api.exceptions.PrimitonException;

/**
 * This type defines the primiton functions for the primitive long type
 */
public interface Longton {

  static int toInt(long input) throws PrimitonException {
    return (int) input;
  }

  static long identity(long input) {
    return input;
  }

  static double toDouble(long input) {
    return input;
  }
}
