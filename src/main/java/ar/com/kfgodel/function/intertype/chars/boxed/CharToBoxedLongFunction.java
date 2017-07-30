package ar.com.kfgodel.function.intertype.chars.boxed;

import java.util.function.Function;

/**
 * This type represents a function that takes a boolean input and produces a byte as result
 * Date: 29/07/17 - 19:57
 */
public interface CharToBoxedLongFunction extends Function<Character, Long> {

  Long apply(char input);

  @Override
  default Long apply(Character input){
    return apply(input.charValue());
  }
}
