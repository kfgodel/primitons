package ar.com.kfgodel.function.boxing;

import java.util.function.Function;

/**
 * This type represents a function that takes a primitive byte input and produces a boxed byte as result
 * Date: 29/07/17 - 19:23
 */
public interface ByteToBoxedByteFunction extends Function<Byte, Byte> {

  Byte apply(byte input);

  @Override
  default Byte apply(Byte input) {
    return apply(input.byteValue());
  }
}
