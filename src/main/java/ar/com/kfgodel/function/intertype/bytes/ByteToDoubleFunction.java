package ar.com.kfgodel.function.intertype.bytes;

import java.util.function.Function;

/**
 * This type represents a function that takes a boolean input and produces a double as result
 * Date: 29/07/17 - 19:57
 */
public interface ByteToDoubleFunction extends Function<Byte, Double> {

  double apply(byte input);

  @Override
  default Double apply(Byte input){
    return apply(input.byteValue());
  }
}
