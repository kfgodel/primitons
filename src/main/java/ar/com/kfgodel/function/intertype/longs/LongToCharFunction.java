package ar.com.kfgodel.function.intertype.longs;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface LongToCharFunction extends Function<Integer, Character> {

  char apply(long input);

  @Override
  default Character apply(Integer input){
    return apply(input.intValue());
  }
}
