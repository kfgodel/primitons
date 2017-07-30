package ar.com.kfgodel.function.intertype.bytes;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface ByteToDoubleFunction extends Function<Integer, Double> {

  double apply(byte input);

  @Override
  default Double apply(Integer input){
    return apply(input.intValue());
  }
}
