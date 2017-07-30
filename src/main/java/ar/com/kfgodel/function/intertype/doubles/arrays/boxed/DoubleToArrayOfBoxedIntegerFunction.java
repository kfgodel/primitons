package ar.com.kfgodel.function.intertype.doubles.arrays.boxed;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface DoubleToArrayOfBoxedIntegerFunction extends Function<Double, Integer[]> {

  Integer[] apply(double input);

  @Override
  default Integer[] apply(Double input){
    return apply(input.doubleValue());
  }
}
