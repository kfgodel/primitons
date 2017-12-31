package ar.com.kfgodel.primitons.api.basic;

/**
 * This type defines the primiton functions for the primitive char type
 * Date: 29/07/17 - 14:32
 */
public interface Charton {
  static char identity(char input) {
    return input;
  }

  static Character toBoxedCharacter(char input) {
    return input;
  }

  static char[] toArray(char value) {
    return new char[]{value};
  }
}
