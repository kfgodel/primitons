package ar.com.kfgodel.function.intertype.doubles.arrays.boxed;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface DoubleToArrayOfBoxedFloatFunction extends Function<Double, Float[]> {

  Float[] apply(double input);

  @Override
  default Float[] apply(Double input){
    return apply(input.doubleValue());
  }
}
