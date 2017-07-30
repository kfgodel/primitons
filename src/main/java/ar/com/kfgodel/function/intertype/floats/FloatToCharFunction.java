package ar.com.kfgodel.function.intertype.floats;

import java.util.function.Function;

/**
 * This type represents a function that takes a boolean input and produces a char as result
 * Date: 29/07/17 - 19:57
 */
public interface FloatToCharFunction extends Function<Float, Character> {

  char apply(float input);

  @Override
  default Character apply(Float input){
    return apply(input.floatValue());
  }
}
