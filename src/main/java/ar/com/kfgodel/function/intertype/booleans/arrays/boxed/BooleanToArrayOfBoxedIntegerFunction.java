package ar.com.kfgodel.function.intertype.booleans.arrays.boxed;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface BooleanToArrayOfBoxedIntegerFunction extends Function<Boolean, Integer[]> {

  Integer[] apply(boolean input);

  @Override
  default Integer[] apply(Boolean input){
    return apply(input.booleanValue());
  }
}
