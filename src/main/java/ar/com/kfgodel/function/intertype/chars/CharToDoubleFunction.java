package ar.com.kfgodel.function.intertype.chars;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface CharToDoubleFunction extends Function<Integer, Double> {

  double apply(char input);

  @Override
  default Double apply(Integer input){
    return apply(input.intValue());
  }
}
