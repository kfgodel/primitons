package ar.com.kfgodel.function.intertype.chars.arrays.boxed;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface CharToArrayOfBoxedBooleanFunction extends Function<Character, Boolean[]> {

  Boolean[] apply(char input);

  @Override
  default Boolean[] apply(Character input){
    return apply(input.charValue());
  }
}
