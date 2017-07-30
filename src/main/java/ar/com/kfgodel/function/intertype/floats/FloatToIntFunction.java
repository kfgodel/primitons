package ar.com.kfgodel.function.intertype.floats;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface FloatToIntFunction extends Function<Integer, Integer> {

  int apply(float input);

  @Override
  default Integer apply(Integer input){
    return apply(input.intValue());
  }
}
