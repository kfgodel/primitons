package ar.com.kfgodel.function.intertype.shorts;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface ShortToDoubleFunction extends Function<Integer, Double> {

  double apply(short input);

  @Override
  default Double apply(Integer input){
    return apply(input.intValue());
  }
}
