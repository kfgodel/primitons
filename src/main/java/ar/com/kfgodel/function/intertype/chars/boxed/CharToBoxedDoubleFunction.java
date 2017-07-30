package ar.com.kfgodel.function.intertype.chars.boxed;

import java.util.function.Function;

/**
 * This type represents a function that takes a boolean input and produces a double as result
 * Date: 29/07/17 - 19:57
 */
public interface CharToBoxedDoubleFunction extends Function<Character, Double> {

  Double apply(char input);

  @Override
  default Double apply(Character input){
    return apply(input.charValue());
  }
}
