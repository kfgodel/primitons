package ar.com.kfgodel.function.intertype.booleans.boxed;

import java.util.function.Function;

/**
 * This type represents a function that takes a boolean input and produces a double as result
 * Date: 29/07/17 - 19:57
 */
public interface BooleanToBoxedDoubleFunction extends Function<Boolean, Double> {

  Double apply(boolean input);

  @Override
  default Double apply(Boolean input){
    return apply(input.booleanValue());
  }
}
