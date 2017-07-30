package ar.com.kfgodel.function.intertype.floats;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface FloatToFloatFunction extends Function<Integer, Float> {

  float apply(float input);

  @Override
  default Float apply(Integer input){
    return apply(input.intValue());
  }
}
