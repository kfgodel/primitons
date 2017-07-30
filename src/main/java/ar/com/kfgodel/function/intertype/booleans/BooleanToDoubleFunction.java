package ar.com.kfgodel.function.intertype.booleans;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface BooleanToDoubleFunction extends Function<Integer, Double> {

  double apply(boolean input);

  @Override
  default Double apply(Integer input){
    return apply(input.intValue());
  }
}
