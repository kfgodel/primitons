package ar.com.kfgodel.function.intertype.chars.boxed;

import java.util.function.Function;

/**
 * This type represents a function that takes a boolean input and produces a float as result
 * Date: 29/07/17 - 19:57
 */
public interface CharToBoxedFloatFunction extends Function<Character, Float> {

  Float apply(char input);

  @Override
  default Float apply(Character input){
    return apply(input.charValue());
  }
}
