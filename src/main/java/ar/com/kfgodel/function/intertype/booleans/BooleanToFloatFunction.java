package ar.com.kfgodel.function.intertype.booleans;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface BooleanToFloatFunction extends Function<Integer, Float> {

  float apply(boolean input);

  @Override
  default Float apply(Integer input){
    return apply(input.intValue());
  }
}
