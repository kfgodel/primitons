package ar.com.kfgodel.function.intertype.bytes;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface ByteToFloatFunction extends Function<Integer, Float> {

  float apply(byte input);

  @Override
  default Float apply(Integer input){
    return apply(input.intValue());
  }
}
