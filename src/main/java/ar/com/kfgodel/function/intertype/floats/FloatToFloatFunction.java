package ar.com.kfgodel.function.intertype.floats;

import java.util.function.Function;

/**
 * This type represents a function that takes a boolean input and produces a float as result
 * Date: 29/07/17 - 19:57
 */
public interface FloatToFloatFunction extends Function<Float, Float> {

  float apply(float input);

  @Override
  default Float apply(Float input){
    return apply(input.floatValue());
  }
}
