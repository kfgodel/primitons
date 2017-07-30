package ar.com.kfgodel.function.intertype.chars;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface CharToShortFunction extends Function<Integer, Short> {

  short apply(char input);

  @Override
  default Short apply(Integer input){
    return apply(input.intValue());
  }
}
