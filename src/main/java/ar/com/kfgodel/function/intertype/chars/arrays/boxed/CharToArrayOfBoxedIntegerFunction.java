package ar.com.kfgodel.function.intertype.chars.arrays.boxed;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface CharToArrayOfBoxedIntegerFunction extends Function<Character, Integer[]> {

  Integer[] apply(char input);

  @Override
  default Integer[] apply(Character input){
    return apply(input.charValue());
  }
}
