package ar.com.kfgodel.primitons.api.boxed;

import ar.com.kfgodel.primitons.api.exceptions.UnmappableException;

import static ar.com.kfgodel.primitons.api.basic.Objecton.newArrayOf;

/**
 * This type defines the primiton functions for the boxed character type
 * Date: 29/07/17 - 14:32
 */
public interface BoxedCharacterton {
  static char toChar(Character input) {
    if(input == null){
      throw new UnmappableException(input, char.class);
    }
    return input;
  }

  static Character[] toArray(Character value) {
    return newArrayOf(Character.class, value);
  }
}
