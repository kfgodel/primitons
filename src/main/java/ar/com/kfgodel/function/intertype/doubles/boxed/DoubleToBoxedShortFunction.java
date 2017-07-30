package ar.com.kfgodel.function.intertype.doubles.boxed;

import java.util.function.Function;

/**
 * This type represents a function that takes a boolean input and produces a byte as result
 * Date: 29/07/17 - 19:57
 */
public interface DoubleToBoxedShortFunction extends Function<Double, Short> {

  Short apply(double input);

  @Override
  default Short apply(Double input){
    return apply(input.doubleValue());
  }
}
