package ar.com.kfgodel.function.intertype.bytes.boxed;

import java.util.function.Function;

/**
 * This type represents a function that takes a boolean input and produces a float as result
 * Date: 29/07/17 - 19:57
 */
public interface ByteToBoxedFloatFunction extends Function<Byte, Float> {

  Float apply(byte input);

  @Override
  default Float apply(Byte input){
    return apply(input.byteValue());
  }
}
