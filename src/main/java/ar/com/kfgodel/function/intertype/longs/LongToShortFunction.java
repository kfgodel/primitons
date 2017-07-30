package ar.com.kfgodel.function.intertype.longs;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface LongToShortFunction extends Function<Integer, Short> {

  short apply(long input);

  @Override
  default Short apply(Integer input){
    return apply(input.intValue());
  }
}
