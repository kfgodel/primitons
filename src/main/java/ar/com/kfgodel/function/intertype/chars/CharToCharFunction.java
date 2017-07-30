package ar.com.kfgodel.function.intertype.chars;

import java.util.function.Function;

/**
 * This type represents a function that takes a boolean input and produces a char as result
 * Date: 29/07/17 - 19:57
 */
public interface CharToCharFunction extends Function<Character, Character> {

  char apply(char input);

  @Override
  default Character apply(Character input){
    return apply(input.charValue());
  }
}
