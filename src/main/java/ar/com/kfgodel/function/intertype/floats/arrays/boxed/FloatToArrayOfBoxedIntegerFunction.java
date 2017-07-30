package ar.com.kfgodel.function.intertype.floats.arrays.boxed;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface FloatToArrayOfBoxedIntegerFunction extends Function<Float, Integer[]> {

  Integer[] apply(float input);

  @Override
  default Integer[] apply(Float input){
    return apply(input.floatValue());
  }
}
