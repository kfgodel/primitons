package ar.com.kfgodel.function.intertype.bytes.boxed;

import java.util.function.Function;

/**
 * This type represents a function that takes a boolean input and produces a byte as result
 * Date: 29/07/17 - 19:57
 */
public interface ByteToBoxedByteFunction extends Function<Byte, Byte> {

  Byte apply(byte input);

  @Override
  default Byte apply(Byte input){
    return apply(input.byteValue());
  }
}
