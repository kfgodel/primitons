package ar.com.kfgodel.function.intertype.floats.boxed;

import java.util.function.Function;

/**
 * This type represents a function that takes a boolean input and produces a byte as result
 * Date: 29/07/17 - 19:57
 */
public interface FloatToBoxedShortFunction extends Function<Float, Short> {

  Short apply(float input);

  @Override
  default Short apply(Float input){
    return apply(input.floatValue());
  }
}
