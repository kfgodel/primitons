package ar.com.kfgodel.function.intertype.longs;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface LongToIntFunction extends Function<Integer, Integer> {

  int apply(long input);

  @Override
  default Integer apply(Integer input){
    return apply(input.intValue());
  }
}
