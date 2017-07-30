package ar.com.kfgodel.function.intertype.chars.arrays.boxed;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface CharToArrayOfBoxedDoubleFunction extends Function<Character, Double[]> {

  Double[] apply(char input);

  @Override
  default Double[] apply(Character input){
    return apply(input.charValue());
  }
}
