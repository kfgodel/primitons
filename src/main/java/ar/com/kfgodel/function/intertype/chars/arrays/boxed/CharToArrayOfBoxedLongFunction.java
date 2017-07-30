package ar.com.kfgodel.function.intertype.chars.arrays.boxed;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface CharToArrayOfBoxedLongFunction extends Function<Character, Long[]> {

  Long[] apply(char input);

  @Override
  default Long[] apply(Character input){
    return apply(input.charValue());
  }
}
