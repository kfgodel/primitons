package ar.com.kfgodel.function.intertype.floats.arrays.boxed;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface FloatToArrayOfBoxedFloatFunction extends Function<Float, Float[]> {

  Float[] apply(float input);

  @Override
  default Float[] apply(Float input){
    return apply(input.floatValue());
  }
}
