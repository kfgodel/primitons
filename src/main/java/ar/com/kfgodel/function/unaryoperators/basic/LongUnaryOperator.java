package ar.com.kfgodel.function.unaryoperators.basic;

import ar.com.kfgodel.function.unaryoperators.boxed.BoxedLongUnaryOperator;

/**
 * This type represents the unary operator for the primitive long type
 * Date: 29/07/17 - 15:05
 */
public interface LongUnaryOperator extends java.util.function.LongUnaryOperator, BoxedLongUnaryOperator {

  long apply(long input);

  @Override
  default long applyAsLong(long operand){
    return this.apply(operand);
  }

  @Override
  default Long apply(Long aLong){
    return this.apply(aLong.longValue());
  }
}
