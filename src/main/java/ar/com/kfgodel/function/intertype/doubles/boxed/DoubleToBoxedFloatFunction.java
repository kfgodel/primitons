package ar.com.kfgodel.function.intertype.doubles.boxed;

import java.util.function.Function;

/**
 * This type represents a function that takes a boolean input and produces a float as result
 * Date: 29/07/17 - 19:57
 */
public interface DoubleToBoxedFloatFunction extends Function<Double, Float> {

  Float apply(double input);

  @Override
  default Float apply(Double input){
    return apply(input.doubleValue());
  }
}
