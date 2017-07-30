package ar.com.kfgodel.function.intertype.booleans;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface BooleanToShortFunction extends Function<Integer, Short> {

  short apply(boolean input);

  @Override
  default Short apply(Integer input){
    return apply(input.intValue());
  }
}
