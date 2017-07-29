package ar.com.kfgodel.function.boxing;

import java.util.function.Function;

/**
 * This type represents a function that takes a primitive char input and produces a boxed character as result
 * Date: 29/07/17 - 19:23
 */
public interface CharToBoxedCharacterFunction extends Function<Character, Character> {

  Character apply(char input);

  @Override
  default Character apply(Character input) {
    return apply(input.charValue());
  }
}
