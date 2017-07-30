package ar.com.kfgodel.function.intertype.bytes;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface ByteToByteFunction extends Function<Integer, Byte> {

  byte apply(byte input);

  @Override
  default Byte apply(Integer input){
    return apply(input.intValue());
  }
}
