package ar.com.kfgodel.function.intertype.shorts;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface ShortToFloatFunction extends Function<Integer, Float> {

  float apply(short input);

  @Override
  default Float apply(Integer input){
    return apply(input.intValue());
  }
}
