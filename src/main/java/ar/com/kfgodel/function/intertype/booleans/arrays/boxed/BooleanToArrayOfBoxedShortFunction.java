package ar.com.kfgodel.function.intertype.booleans.arrays.boxed;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface BooleanToArrayOfBoxedShortFunction extends Function<Boolean, Short[]> {

  Short[] apply(boolean input);

  @Override
  default Short[] apply(Boolean input){
    return apply(input.booleanValue());
  }
}
