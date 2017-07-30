package ar.com.kfgodel.function.intertype.doubles.arrays.boxed;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface DoubleToArrayOfBoxedLongFunction extends Function<Double, Long[]> {

  Long[] apply(double input);

  @Override
  default Long[] apply(Double input){
    return apply(input.doubleValue());
  }
}
