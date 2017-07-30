package ar.com.kfgodel.function.intertype.floats;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface FloatToLongFunction extends Function<Integer, Long> {

  long apply(float input);

  @Override
  default Long apply(Integer input){
    return apply(input.intValue());
  }
}
