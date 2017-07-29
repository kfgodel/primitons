package ar.com.kfgodel.function.intertype.booleans.arrays.boxed;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface BooleanToArrayOfBoxedLongFunction extends Function<Boolean, Long[]> {

  Long[] apply(boolean input);

  @Override
  default Long[] apply(Boolean input){
    return apply(input.booleanValue());
  }
}
