package ar.com.kfgodel.function.intertype.ints;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface IntToByteFunction extends Function<Integer, Byte> {

  byte apply(int input);

  @Override
  default Byte apply(Integer input){
    return apply(input.intValue());
  }
}
