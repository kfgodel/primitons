package ar.com.kfgodel.function.intertype.chars.arrays.boxed;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface CharToArrayOfBoxedByteFunction extends Function<Character, Byte[]> {

  Byte[] apply(char input);

  @Override
  default Byte[] apply(Character input){
    return apply(input.charValue());
  }
}
