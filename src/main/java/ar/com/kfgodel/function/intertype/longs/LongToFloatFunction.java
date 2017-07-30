package ar.com.kfgodel.function.intertype.longs;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface LongToFloatFunction extends Function<Integer, Float> {

  float apply(long input);

  @Override
  default Float apply(Integer input){
    return apply(input.intValue());
  }
}
