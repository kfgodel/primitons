package ar.com.kfgodel.function.intertype.doubles.boxed;

import java.util.function.Function;

/**
 * This type represents a function that takes a primitive boolean input and produces a boxed boolean as result
 * Date: 29/07/17 - 19:23
 */
public interface DoubleToBoxedBooleanFunction extends Function<Double, Boolean> {

  Boolean apply(double input);

  @Override
  default Boolean apply(Double aBoolean) {
    return apply(aBoolean.doubleValue());
  }
}
