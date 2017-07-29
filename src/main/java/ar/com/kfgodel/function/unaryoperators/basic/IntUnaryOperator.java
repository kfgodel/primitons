package ar.com.kfgodel.function.unaryoperators.basic;

import ar.com.kfgodel.function.unaryoperators.boxed.BoxedIntegerUnaryOperator;

/**
 * This type represents the unary operator for the primitive float type
 * Date: 29/07/17 - 15:05
 */
public interface IntUnaryOperator extends java.util.function.IntUnaryOperator, BoxedIntegerUnaryOperator {

  int apply(int input);

  @Override
  default int applyAsInt(int operand){
    return this.apply(operand);
  }

  @Override
  default Integer apply(Integer integer){
    return this.apply(integer.intValue());
  }
}
