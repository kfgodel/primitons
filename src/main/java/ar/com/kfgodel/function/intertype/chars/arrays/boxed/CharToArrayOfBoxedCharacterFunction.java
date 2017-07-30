package ar.com.kfgodel.function.intertype.chars.arrays.boxed;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface CharToArrayOfBoxedCharacterFunction extends Function<Character, Character[]> {

  Character[] apply(char input);

  @Override
  default Character[] apply(Character input){
    return apply(input.charValue());
  }
}
