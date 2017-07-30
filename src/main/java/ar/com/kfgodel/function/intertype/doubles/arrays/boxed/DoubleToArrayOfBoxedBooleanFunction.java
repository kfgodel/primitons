package ar.com.kfgodel.function.intertype.doubles.arrays.boxed;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface DoubleToArrayOfBoxedBooleanFunction extends Function<Double, Boolean[]> {

  Boolean[] apply(double input);

  @Override
  default Boolean[] apply(Double input){
    return apply(input.doubleValue());
  }
}
