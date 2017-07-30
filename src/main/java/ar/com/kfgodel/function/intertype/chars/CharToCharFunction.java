package ar.com.kfgodel.function.intertype.chars;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface CharToCharFunction extends Function<Integer, Character> {

  char apply(char input);

  @Override
  default Character apply(Integer input){
    return apply(input.intValue());
  }
}
