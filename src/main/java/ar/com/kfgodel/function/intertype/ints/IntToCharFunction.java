package ar.com.kfgodel.function.intertype.ints;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface IntToCharFunction extends Function<Integer, Character> {

  char apply(int input);

  @Override
  default Character apply(Integer input){
    return apply(input.intValue());
  }
}
