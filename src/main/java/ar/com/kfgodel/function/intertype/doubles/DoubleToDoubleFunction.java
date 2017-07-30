package ar.com.kfgodel.function.intertype.doubles;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface DoubleToDoubleFunction extends Function<Integer, Double> {

  double apply(double input);

  @Override
  default Double apply(Integer input){
    return apply(input.intValue());
  }
}
