package ar.com.kfgodel.function.intertype.floats.boxed;

import java.util.function.Function;

/**
 * This type represents a function that takes a boolean input and produces a double as result
 * Date: 29/07/17 - 19:57
 */
public interface FloatToBoxedDoubleFunction extends Function<Float, Double> {

  Double apply(float input);

  @Override
  default Double apply(Float input){
    return apply(input.floatValue());
  }
}
