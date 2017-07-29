package ar.com.kfgodel.function.boxing;

import java.util.function.Function;

/**
 * This type represents a function that takes a primitive boolean input and produces a boxed boolean as result
 * Date: 29/07/17 - 19:23
 */
public interface BooleanToBoxedBooleanFunction extends Function<Boolean, Boolean> {

  Boolean apply(boolean input);

  @Override
  default Boolean apply(Boolean aBoolean) {
    return apply(aBoolean.booleanValue());
  }
}
