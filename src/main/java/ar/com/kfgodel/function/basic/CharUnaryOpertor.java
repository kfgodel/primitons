package ar.com.kfgodel.function.basic;

import ar.com.kfgodel.function.boxed.BoxedCharacterUnaryOperator;

/**
 * This type represents the unary operator for the primitive char type
 * Date: 29/07/17 - 15:05
 */
public interface CharUnaryOpertor extends BoxedCharacterUnaryOperator {

  char apply(char input);

  @Override
  default Character apply(Character character){
    return this.apply(character.charValue());
  }
}
