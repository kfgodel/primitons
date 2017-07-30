package ar.com.kfgodel.function.intertype.chars.boxed;

import java.util.function.Function;

/**
 * This type represents a function that takes a boolean input and produces a char as result
 * Date: 29/07/17 - 19:57
 */
public interface CharToBoxedCharacterFunction extends Function<Character, Character> {

  Character apply(char input);

  @Override
  default Character apply(Character input){
    return apply(input.charValue());
  }
}
