package ar.com.kfgodel.function.intertype.chars.arrays.boxed;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface CharToArrayOfBoxedFloatFunction extends Function<Character, Float[]> {

  Float[] apply(char input);

  @Override
  default Float[] apply(Character input){
    return apply(input.charValue());
  }
}
