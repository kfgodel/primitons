package ar.com.kfgodel.function.intertype.booleans.boxed;

import java.util.function.Function;

/**
 * This type represents a function that takes a boolean input and produces a byte as result
 * Date: 29/07/17 - 19:57
 */
public interface BooleanToBoxedIntegerFunction extends Function<Boolean, Integer> {

  Integer apply(boolean input);

  @Override
  default Integer apply(Boolean input){
    return apply(input.booleanValue());
  }
}
