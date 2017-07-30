package ar.com.kfgodel.function.intertype.bytes;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface ByteToShortFunction extends Function<Integer, Short> {

  short apply(byte input);

  @Override
  default Short apply(Integer input){
    return apply(input.intValue());
  }
}
