package ar.com.kfgodel.function.intertype.chars.boxed;

import java.util.function.Function;

/**
 * This type represents a function that takes a boolean input and produces a byte as result
 * Date: 29/07/17 - 19:57
 */
public interface CharToBoxedByteFunction extends Function<Character, Byte> {

  Byte apply(char input);

  @Override
  default Byte apply(Character input){
    return apply(input.charValue());
  }
}
