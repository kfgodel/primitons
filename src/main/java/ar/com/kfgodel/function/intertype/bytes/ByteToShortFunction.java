package ar.com.kfgodel.function.intertype.bytes;

import java.util.function.Function;

/**
 * This type represents a function that takes a boolean input and produces a byte as result
 * Date: 29/07/17 - 19:57
 */
public interface ByteToShortFunction extends Function<Byte, Short> {

  short apply(byte input);

  @Override
  default Short apply(Byte input){
    return apply(input.byteValue());
  }
}
