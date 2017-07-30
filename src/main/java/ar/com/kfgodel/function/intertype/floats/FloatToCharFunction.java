package ar.com.kfgodel.function.intertype.floats;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface FloatToCharFunction extends Function<Integer, Character> {

  char apply(float input);

  @Override
  default Character apply(Integer input){
    return apply(input.intValue());
  }
}
