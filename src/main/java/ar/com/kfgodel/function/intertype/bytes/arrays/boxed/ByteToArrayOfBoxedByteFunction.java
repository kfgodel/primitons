package ar.com.kfgodel.function.intertype.bytes.arrays.boxed;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface ByteToArrayOfBoxedByteFunction extends Function<Byte, Byte[]> {

  Byte[] apply(byte input);

  @Override
  default Byte[] apply(Byte input){
    return apply(input.byteValue());
  }
}
