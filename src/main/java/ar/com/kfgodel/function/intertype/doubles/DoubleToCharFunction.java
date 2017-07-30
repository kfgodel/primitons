package ar.com.kfgodel.function.intertype.doubles;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface DoubleToCharFunction extends Function<Integer, Character> {

  char apply(double input);

  @Override
  default Character apply(Integer input){
    return apply(input.intValue());
  }
}
