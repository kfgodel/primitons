package ar.com.kfgodel.function.intertype.floats.arrays.boxed;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface FloatToArrayOfBoxedCharacterFunction extends Function<Float, Character[]> {

  Character[] apply(float input);

  @Override
  default Character[] apply(Float input){
    return apply(input.floatValue());
  }
}
