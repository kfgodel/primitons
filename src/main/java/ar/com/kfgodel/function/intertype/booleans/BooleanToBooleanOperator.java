package ar.com.kfgodel.function.intertype.booleans;

import ar.com.kfgodel.function.unaryoperators.boxed.BoxedBooleanUnaryOperator;

/**
 * This type defines an operator for primitive boolean types
 * Created by kfgodel on 23/07/17.
 */
public interface BooleanToBooleanOperator extends BoxedBooleanUnaryOperator {

  boolean apply(boolean aBoolean);

  @Override
  default Boolean apply(Boolean aBoolean){
    return this.apply(aBoolean.booleanValue());
  }

}
