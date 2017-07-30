package ar.com.kfgodel.function.intertype.doubles;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface DoubleToIntFunction extends Function<Integer, Integer> {

  int apply(double input);

  @Override
  default Integer apply(Integer input){
    return apply(input.intValue());
  }
}
