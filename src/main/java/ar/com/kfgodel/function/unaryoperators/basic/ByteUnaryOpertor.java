package ar.com.kfgodel.function.unaryoperators.basic;

import ar.com.kfgodel.function.unaryoperators.boxed.BoxedByteUnaryOperator;

/**
 * This type represents the unary operator for the primitive byte type
 * Date: 29/07/17 - 15:05
 */
public interface ByteUnaryOpertor extends BoxedByteUnaryOperator {

  byte apply(byte input);

  @Override
  default Byte apply(Byte aByte){
    return this.apply(aByte.byteValue());
  }
}
