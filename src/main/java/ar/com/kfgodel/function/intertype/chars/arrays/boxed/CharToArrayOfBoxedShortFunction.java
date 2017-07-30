package ar.com.kfgodel.function.intertype.chars.arrays.boxed;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface CharToArrayOfBoxedShortFunction extends Function<Character, Short[]> {

  Short[] apply(char input);

  @Override
  default Short[] apply(Character input){
    return apply(input.charValue());
  }
}
