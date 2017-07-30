package ar.com.kfgodel.function.intertype.floats.arrays.boxed;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface FloatToArrayOfBoxedLongFunction extends Function<Float, Long[]> {

  Long[] apply(float input);

  @Override
  default Long[] apply(Float input){
    return apply(input.floatValue());
  }
}
