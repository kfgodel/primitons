package ar.com.kfgodel.function.intertype.floats.arrays.boxed;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface FloatToArrayOfBoxedDoubleFunction extends Function<Float, Double[]> {

  Double[] apply(float input);

  @Override
  default Double[] apply(Float input){
    return apply(input.floatValue());
  }
}
