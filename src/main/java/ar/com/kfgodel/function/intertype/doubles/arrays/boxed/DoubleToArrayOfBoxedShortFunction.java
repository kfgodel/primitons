package ar.com.kfgodel.function.intertype.doubles.arrays.boxed;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface DoubleToArrayOfBoxedShortFunction extends Function<Double, Short[]> {

  Short[] apply(double input);

  @Override
  default Short[] apply(Double input){
    return apply(input.doubleValue());
  }
}
