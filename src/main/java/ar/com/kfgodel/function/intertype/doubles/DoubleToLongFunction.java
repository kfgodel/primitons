package ar.com.kfgodel.function.intertype.doubles;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface DoubleToLongFunction extends Function<Integer, Long> {

  long apply(double input);

  @Override
  default Long apply(Integer input){
    return apply(input.intValue());
  }
}
