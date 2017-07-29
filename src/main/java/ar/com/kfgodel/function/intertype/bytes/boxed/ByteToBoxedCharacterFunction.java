package ar.com.kfgodel.function.intertype.bytes.boxed;

import java.util.function.Function;

/**
 * This type represents a function that takes a boolean input and produces a char as result
 * Date: 29/07/17 - 19:57
 */
public interface ByteToBoxedCharacterFunction extends Function<Byte, Character> {

  Character apply(byte input);

  @Override
  default Character apply(Byte input){
    return apply(input.byteValue());
  }
}
