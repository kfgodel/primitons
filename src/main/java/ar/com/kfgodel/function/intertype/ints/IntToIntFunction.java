package ar.com.kfgodel.function.intertype.ints;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface IntToIntFunction extends Function<Integer, Integer> {

  int apply(int input);

  @Override
  default Integer apply(Integer input){
    return apply(input.intValue());
  }
}
