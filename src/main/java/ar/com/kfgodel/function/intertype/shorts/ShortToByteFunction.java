package ar.com.kfgodel.function.intertype.shorts;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface ShortToByteFunction extends Function<Integer, Byte> {

  byte apply(short input);

  @Override
  default Byte apply(Integer input){
    return apply(input.intValue());
  }
}
