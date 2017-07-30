package ar.com.kfgodel.function.intertype.floats.arrays.boxed;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface FloatToArrayOfBoxedBooleanFunction extends Function<Float, Boolean[]> {

  Boolean[] apply(float input);

  @Override
  default Boolean[] apply(Float input){
    return apply(input.floatValue());
  }
}
