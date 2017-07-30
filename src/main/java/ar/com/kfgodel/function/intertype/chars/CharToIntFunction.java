package ar.com.kfgodel.function.intertype.chars;

import java.util.function.Function;

/**
 * This type represents a function that takes a boolean input and produces a byte as result
 * Date: 29/07/17 - 19:57
 */
public interface CharToIntFunction extends Function<Character, Integer> {

  int apply(char input);

  @Override
  default Integer apply(Character input){
    return apply(input.charValue());
  }
}
