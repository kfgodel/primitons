package ar.com.kfgodel.function.intertype.ints;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface IntToShortFunction extends Function<Integer, Short> {

  short apply(int input);

  @Override
  default Short apply(Integer input){
    return apply(input.intValue());
  }
}
