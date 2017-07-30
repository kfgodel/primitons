package ar.com.kfgodel.function.intertype.doubles;

import java.util.function.Function;

/**
 * This type represents a function that takes a boolean input and produces a double as result
 * Date: 29/07/17 - 19:57
 */
public interface DoubleToDoubleFunction extends Function<Double, Double> {

  double apply(double input);

  @Override
  default Double apply(Double input){
    return apply(input.doubleValue());
  }
}
