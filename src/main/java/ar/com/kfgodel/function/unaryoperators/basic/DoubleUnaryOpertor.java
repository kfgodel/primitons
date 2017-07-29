package ar.com.kfgodel.function.unaryoperators.basic;

import ar.com.kfgodel.function.unaryoperators.boxed.BoxedDoubleUnaryOperator;

/**
 * This type represents the unary operator for the primitive double type
 * Date: 29/07/17 - 15:05
 */
public interface DoubleUnaryOpertor extends BoxedDoubleUnaryOperator {

  double apply(double input);

  @Override
  default Double apply(Double aDouble){
    return this.apply(aDouble.doubleValue());
  }
}
