package ar.com.kfgodel.function.intertype.bytes.arrays.boxed;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface ByteToArrayOfBoxedIntegerFunction extends Function<Byte, Integer[]> {

  Integer[] apply(byte input);

  @Override
  default Integer[] apply(Byte input){
    return apply(input.byteValue());
  }
}
