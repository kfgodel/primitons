package ar.com.kfgodel.function.boxing;

import java.util.function.Function;

/**
 * This type represents a function that takes a primitive float input and produces a boxed float as result
 * Date: 29/07/17 - 19:23
 */
public interface FloatToBoxedFloatFunction extends Function<Float, Float> {

  Float apply(float input);

  @Override
  default Float apply(Float input) {
    return apply(input.floatValue());
  }
}
