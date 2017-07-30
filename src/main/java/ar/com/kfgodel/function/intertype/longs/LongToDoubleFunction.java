package ar.com.kfgodel.function.intertype.longs;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface LongToDoubleFunction extends Function<Integer, Double> {

  double apply(long input);

  @Override
  default Double apply(Integer input){
    return apply(input.intValue());
  }
}
