package ar.com.kfgodel.function.intertype.chars;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface CharToIntFunction extends Function<Integer, Integer> {

  int apply(char input);

  @Override
  default Integer apply(Integer input){
    return apply(input.intValue());
  }
}
