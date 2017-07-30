package ar.com.kfgodel.function.intertype.floats.arrays.boxed;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface FloatToArrayOfBoxedByteFunction extends Function<Float, Byte[]> {

  Byte[] apply(float input);

  @Override
  default Byte[] apply(Float input){
    return apply(input.floatValue());
  }
}
