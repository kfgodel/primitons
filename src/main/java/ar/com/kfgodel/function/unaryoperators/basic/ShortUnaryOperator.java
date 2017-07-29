package ar.com.kfgodel.function.unaryoperators.basic;

import ar.com.kfgodel.function.unaryoperators.boxed.BoxedShortUnaryOperator;

/**
 * This type represents the unary operator for the primitive short type
 * Date: 29/07/17 - 15:05
 */
public interface ShortUnaryOperator extends BoxedShortUnaryOperator {

  short apply(short input);

  @Override
  default Short apply(Short aShort){
    return this.apply(aShort.shortValue());
  }
}
