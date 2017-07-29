package ar.com.kfgodel.function.intertype.bytes.arrays.boxed;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface ByteToArrayOfBoxedFloatFunction extends Function<Byte, Float[]> {

  Float[] apply(byte input);

  @Override
  default Float[] apply(Byte input){
    return apply(input.byteValue());
  }
}
