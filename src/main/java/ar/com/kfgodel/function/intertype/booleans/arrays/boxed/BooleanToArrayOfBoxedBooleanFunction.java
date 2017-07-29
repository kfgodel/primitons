package ar.com.kfgodel.function.intertype.booleans.arrays.boxed;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface BooleanToArrayOfBoxedBooleanFunction extends Function<Boolean, Boolean[]> {

  Boolean[] apply(boolean input);

  @Override
  default Boolean[] apply(Boolean input){
    return apply(input.booleanValue());
  }
}
