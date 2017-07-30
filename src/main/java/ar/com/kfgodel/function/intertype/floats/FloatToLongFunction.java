package ar.com.kfgodel.function.intertype.floats;

import java.util.function.Function;

/**
 * This type represents a function that takes a boolean input and produces a byte as result
 * Date: 29/07/17 - 19:57
 */
public interface FloatToLongFunction extends Function<Float, Long> {

  long apply(float input);

  @Override
  default Long apply(Float input){
    return apply(input.floatValue());
  }
}
