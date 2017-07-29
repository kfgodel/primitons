package ar.com.kfgodel.function.intertype.booleans.boxed;

import java.util.function.Function;

/**
 * This type represents a function that takes a boolean input and produces a float as result
 * Date: 29/07/17 - 19:57
 */
public interface BooleanToBoxedFloatFunction extends Function<Boolean, Float> {

  Float apply(boolean input);

  @Override
  default Float apply(Boolean input){
    return apply(input.booleanValue());
  }
}
