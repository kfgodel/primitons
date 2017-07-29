package ar.com.kfgodel.function.boxing;

import java.util.function.Function;

/**
 * This type represents a function that takes a primitive double input and produces a boxed double as result
 * Date: 29/07/17 - 19:23
 */
public interface DoubleToBoxedDoubleFunction extends Function<Double, Double> {

  Double apply(double input);

  @Override
  default Double apply(Double input) {
    return apply(input.doubleValue());
  }
}
