package ar.com.kfgodel.function.intertype.booleans.arrays.boxed;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface BooleanToArrayOfBoxedDoubleFunction extends Function<Boolean, Double[]> {

  Double[] apply(boolean input);

  @Override
  default Double[] apply(Boolean input){
    return apply(input.booleanValue());
  }
}
