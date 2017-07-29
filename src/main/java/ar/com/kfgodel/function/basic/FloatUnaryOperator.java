package ar.com.kfgodel.function.basic;

import ar.com.kfgodel.function.boxed.BoxedFloatUnaryOperator;

/**
 * This type represents the unary operator for the primitive float type
 * Date: 29/07/17 - 15:05
 */
public interface FloatUnaryOperator extends BoxedFloatUnaryOperator {

  float apply(float input);

  @Override
  default Float apply(Float aFloat){
    return apply(aFloat.floatValue());
  }
}
