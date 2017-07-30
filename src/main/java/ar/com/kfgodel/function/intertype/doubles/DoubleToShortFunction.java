package ar.com.kfgodel.function.intertype.doubles;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface DoubleToShortFunction extends Function<Integer, Short> {

  short apply(double input);

  @Override
  default Short apply(Integer input){
    return apply(input.intValue());
  }
}
