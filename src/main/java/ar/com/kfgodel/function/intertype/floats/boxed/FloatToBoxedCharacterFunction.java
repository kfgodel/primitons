package ar.com.kfgodel.function.intertype.floats.boxed;

import java.util.function.Function;

/**
 * This type represents a function that takes a boolean input and produces a char as result
 * Date: 29/07/17 - 19:57
 */
public interface FloatToBoxedCharacterFunction extends Function<Float, Character> {

  Character apply(float input);

  @Override
  default Character apply(Float input){
    return apply(input.floatValue());
  }
}
