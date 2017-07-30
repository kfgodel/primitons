package ar.com.kfgodel.function.intertype.booleans;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface BooleanToByteFunction extends Function<Integer, Byte> {

  byte apply(boolean input);

  @Override
  default Byte apply(Integer input){
    return apply(input.intValue());
  }
}
