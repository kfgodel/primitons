package ar.com.kfgodel.function.intertype.bytes;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface ByteToLongFunction extends Function<Integer, Long> {

  long apply(byte input);

  @Override
  default Long apply(Integer input){
    return apply(input.intValue());
  }
}
