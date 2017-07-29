package ar.com.kfgodel.function.intertype.booleans.arrays.boxed;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface BooleanToArrayOfBoxedCharacterFunction extends Function<Boolean, Character[]> {

  Character[] apply(boolean input);

  @Override
  default Character[] apply(Boolean input){
    return apply(input.booleanValue());
  }
}
