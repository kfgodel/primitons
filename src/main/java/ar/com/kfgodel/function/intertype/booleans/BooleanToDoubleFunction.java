package ar.com.kfgodel.function.intertype.booleans;

import java.util.function.Function;

/**
 * This type represents a function that takes a boolean input and produces a double as result
 * Date: 29/07/17 - 19:57
 */
public interface BooleanToDoubleFunction extends Function<Boolean, Double> {

  double apply(boolean input);

  @Override
  default Double apply(Boolean input){
    return apply(input.booleanValue());
  }
}
