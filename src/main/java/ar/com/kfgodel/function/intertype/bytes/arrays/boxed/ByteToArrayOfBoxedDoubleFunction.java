package ar.com.kfgodel.function.intertype.bytes.arrays.boxed;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface ByteToArrayOfBoxedDoubleFunction extends Function<Byte, Double[]> {

  Double[] apply(byte input);

  @Override
  default Double[] apply(Byte input){
    return apply(input.byteValue());
  }
}
