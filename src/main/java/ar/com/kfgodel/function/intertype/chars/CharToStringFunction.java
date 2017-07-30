package ar.com.kfgodel.function.intertype.chars;

import java.util.function.Function;

/**
 * This type represents a function that takes a boolean input and produces a byte as result
 * Date: 29/07/17 - 19:57
 */
public interface CharToStringFunction extends Function<Character, String> {

  String apply(char input);

  @Override
  default String apply(Character input){
    return apply(input.charValue());
  }
}
