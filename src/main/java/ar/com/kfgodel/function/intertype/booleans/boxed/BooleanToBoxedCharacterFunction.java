package ar.com.kfgodel.function.intertype.booleans.boxed;

import java.util.function.Function;

/**
 * This type represents a function that takes a boolean input and produces a char as result
 * Date: 29/07/17 - 19:57
 */
public interface BooleanToBoxedCharacterFunction extends Function<Boolean, Character> {

  Character apply(boolean input);

  @Override
  default Character apply(Boolean input){
    return apply(input.booleanValue());
  }
}
