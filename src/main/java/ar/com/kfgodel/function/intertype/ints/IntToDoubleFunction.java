package ar.com.kfgodel.function.intertype.ints;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface IntToDoubleFunction extends Function<Integer, Double> {

  double apply(int input);

  @Override
  default Double apply(Integer input){
    return apply(input.intValue());
  }
}
