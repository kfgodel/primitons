package ar.com.kfgodel.function.intertype.floats;

import java.util.function.Function;

/**
 * This type represents a function that takes a boolean input and produces a byte as result
 * Date: 29/07/17 - 19:57
 */
public interface FloatToStringFunction extends Function<Float, String> {

  String apply(float input);

  @Override
  default String apply(Float input){
    return apply(input.floatValue());
  }
}
