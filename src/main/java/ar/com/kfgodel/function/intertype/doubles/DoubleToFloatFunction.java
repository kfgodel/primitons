package ar.com.kfgodel.function.intertype.doubles;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface DoubleToFloatFunction extends Function<Integer, Float> {

  float apply(double input);

  @Override
  default Float apply(Integer input){
    return apply(input.intValue());
  }
}
