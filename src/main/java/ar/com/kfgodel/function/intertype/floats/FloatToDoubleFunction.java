package ar.com.kfgodel.function.intertype.floats;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface FloatToDoubleFunction extends Function<Integer, Double> {

  double apply(float input);

  @Override
  default Double apply(Integer input){
    return apply(input.intValue());
  }
}
