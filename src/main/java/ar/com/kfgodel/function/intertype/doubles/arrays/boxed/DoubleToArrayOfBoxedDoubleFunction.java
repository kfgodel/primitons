package ar.com.kfgodel.function.intertype.doubles.arrays.boxed;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface DoubleToArrayOfBoxedDoubleFunction extends Function<Double, Double[]> {

  Double[] apply(double input);

  @Override
  default Double[] apply(Double input){
    return apply(input.doubleValue());
  }
}
