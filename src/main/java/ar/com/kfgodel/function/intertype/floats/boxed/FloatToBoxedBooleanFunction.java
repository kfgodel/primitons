package ar.com.kfgodel.function.intertype.floats.boxed;

import java.util.function.Function;

/**
 * This type represents a function that takes a primitive boolean input and produces a boxed boolean as result
 * Date: 29/07/17 - 19:23
 */
public interface FloatToBoxedBooleanFunction extends Function<Float, Boolean> {

  Boolean apply(float input);

  @Override
  default Boolean apply(Float aBoolean) {
    return apply(aBoolean.floatValue());
  }
}
