package ar.com.kfgodel.function.intertype.ints;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface IntToLongFunction extends Function<Integer, Long> {

  long apply(int input);

  @Override
  default Long apply(Integer input){
    return apply(input.intValue());
  }
}
