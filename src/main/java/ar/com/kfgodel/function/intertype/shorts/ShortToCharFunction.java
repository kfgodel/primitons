package ar.com.kfgodel.function.intertype.shorts;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface ShortToCharFunction extends Function<Integer, Character> {

  char apply(short input);

  @Override
  default Character apply(Integer input){
    return apply(input.intValue());
  }
}
