package ar.com.kfgodel.function.intertype.longs;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface LongToLongFunction extends Function<Integer, Long> {

  long apply(long input);

  @Override
  default Long apply(Integer input){
    return apply(input.intValue());
  }
}
