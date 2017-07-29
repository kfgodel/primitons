package ar.com.kfgodel.function.intertype.bytes.arrays.boxed;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface ByteToArrayOfBoxedShortFunction extends Function<Byte, Short[]> {

  Short[] apply(byte input);

  @Override
  default Short[] apply(Byte input){
    return apply(input.byteValue());
  }
}
