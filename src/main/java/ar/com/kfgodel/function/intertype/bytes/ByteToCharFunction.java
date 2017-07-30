package ar.com.kfgodel.function.intertype.bytes;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface ByteToCharFunction extends Function<Integer, Character> {

  char apply(byte input);

  @Override
  default Character apply(Integer input){
    return apply(input.intValue());
  }
}
