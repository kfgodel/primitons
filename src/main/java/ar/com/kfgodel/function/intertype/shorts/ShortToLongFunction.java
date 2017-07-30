package ar.com.kfgodel.function.intertype.shorts;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface ShortToLongFunction extends Function<Integer, Long> {

  long apply(short input);

  @Override
  default Long apply(Integer input){
    return apply(input.intValue());
  }
}
