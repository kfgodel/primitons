package ar.com.kfgodel.function.intertype.doubles.boxed;

import java.util.function.Function;

/**
 * This type represents a function that takes a boolean input and produces a double as result
 * Date: 29/07/17 - 19:57
 */
public interface DoubleToBoxedDoubleFunction extends Function<Double, Double> {

  Double apply(double input);

  @Override
  default Double apply(Double input){
    return apply(input.doubleValue());
  }
}
