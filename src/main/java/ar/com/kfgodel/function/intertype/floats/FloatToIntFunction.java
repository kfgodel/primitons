package ar.com.kfgodel.function.intertype.floats;

import java.util.function.Function;

/**
 * This type represents a function that takes a boolean input and produces a byte as result
 * Date: 29/07/17 - 19:57
 */
public interface FloatToIntFunction extends Function<Float, Integer> {

  int apply(float input);

  @Override
  default Integer apply(Float input){
    return apply(input.floatValue());
  }
}
