package ar.com.kfgodel.function.intertype.booleans;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface BooleanToCharFunction extends Function<Integer, Character> {

  char apply(boolean input);

  @Override
  default Character apply(Integer input){
    return apply(input.intValue());
  }
}
