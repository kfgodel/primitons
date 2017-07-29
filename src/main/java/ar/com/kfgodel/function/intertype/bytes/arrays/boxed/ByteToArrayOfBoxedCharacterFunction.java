package ar.com.kfgodel.function.intertype.bytes.arrays.boxed;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface ByteToArrayOfBoxedCharacterFunction extends Function<Byte, Character[]> {

  Character[] apply(byte input);

  @Override
  default Character[] apply(Byte input){
    return apply(input.byteValue());
  }
}
