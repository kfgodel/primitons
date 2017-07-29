package ar.com.kfgodel.function.intertype.booleans.arrays.boxed;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface BooleanToArrayOfBoxedFloatFunction extends Function<Boolean, Float[]> {

  Float[] apply(boolean input);

  @Override
  default Float[] apply(Boolean input){
    return apply(input.booleanValue());
  }
}
