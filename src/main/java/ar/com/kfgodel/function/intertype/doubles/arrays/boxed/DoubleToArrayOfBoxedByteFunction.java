package ar.com.kfgodel.function.intertype.doubles.arrays.boxed;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface DoubleToArrayOfBoxedByteFunction extends Function<Double, Byte[]> {

  Byte[] apply(double input);

  @Override
  default Byte[] apply(Double input){
    return apply(input.doubleValue());
  }
}
