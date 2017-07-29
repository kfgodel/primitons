package ar.com.kfgodel.function.intertype.booleans.arrays.boxed;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface BooleanToArrayOfBoxedByteFunction extends Function<Boolean, Byte[]> {

  Byte[] apply(boolean input);

  @Override
  default Byte[] apply(Boolean input){
    return apply(input.booleanValue());
  }
}
