package ar.com.kfgodel.function.intertype.booleans;

import java.util.function.Function;

/**
 * This type represents a function that takes a boolean input and produces a byte as result
 * Date: 29/07/17 - 19:57
 */
public interface BooleanToLongFunction extends Function<Boolean, Long> {

  long apply(boolean input);

  @Override
  default Long apply(Boolean input){
    return apply(input.booleanValue());
  }
}
