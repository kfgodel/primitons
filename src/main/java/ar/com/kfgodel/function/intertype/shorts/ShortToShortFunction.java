package ar.com.kfgodel.function.intertype.shorts;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface ShortToShortFunction extends Function<Integer, Short> {

  short apply(short input);

  @Override
  default Short apply(Integer input){
    return apply(input.intValue());
  }
}
