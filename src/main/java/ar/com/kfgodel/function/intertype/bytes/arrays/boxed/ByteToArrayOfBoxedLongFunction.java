package ar.com.kfgodel.function.intertype.bytes.arrays.boxed;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface ByteToArrayOfBoxedLongFunction extends Function<Byte, Long[]> {

  Long[] apply(byte input);

  @Override
  default Long[] apply(Byte input){
    return apply(input.byteValue());
  }
}
