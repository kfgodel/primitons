package ar.com.kfgodel.function.intertype.floats;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface FloatToByteFunction extends Function<Integer, Byte> {

  byte apply(float input);

  @Override
  default Byte apply(Integer input){
    return apply(input.intValue());
  }
}
