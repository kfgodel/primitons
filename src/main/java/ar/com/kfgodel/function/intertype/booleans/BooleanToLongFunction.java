package ar.com.kfgodel.function.intertype.booleans;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface BooleanToLongFunction extends Function<Integer, Long> {

  long apply(boolean input);

  @Override
  default Long apply(Integer input){
    return apply(input.intValue());
  }
}
