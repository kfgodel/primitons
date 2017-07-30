package ar.com.kfgodel.function.intertype.floats.boxed;

import java.util.function.Function;

/**
 * This type represents a function that takes a boolean input and produces a float as result
 * Date: 29/07/17 - 19:57
 */
public interface FloatToBoxedFloatFunction extends Function<Float, Float> {

  Float apply(float input);

  @Override
  default Float apply(Float input){
    return apply(input.floatValue());
  }
}
