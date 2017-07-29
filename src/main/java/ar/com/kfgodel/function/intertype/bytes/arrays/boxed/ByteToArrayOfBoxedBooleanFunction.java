package ar.com.kfgodel.function.intertype.bytes.arrays.boxed;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface ByteToArrayOfBoxedBooleanFunction extends Function<Byte, Boolean[]> {

  Boolean[] apply(byte input);

  @Override
  default Boolean[] apply(Byte input){
    return apply(input.byteValue());
  }
}
