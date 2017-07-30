package ar.com.kfgodel.function.intertype.chars;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface CharToLongFunction extends Function<Integer, Long> {

  long apply(char input);

  @Override
  default Long apply(Integer input){
    return apply(input.intValue());
  }
}
