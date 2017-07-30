package ar.com.kfgodel.function.intertype.bytes;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface ByteToIntFunction extends Function<Integer, Integer> {

  int apply(byte input);

  @Override
  default Integer apply(Integer input){
    return apply(input.intValue());
  }
}
