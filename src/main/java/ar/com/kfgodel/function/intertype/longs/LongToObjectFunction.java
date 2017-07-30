package ar.com.kfgodel.function.intertype.longs;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface LongToObjectFunction<T> extends Function<Integer, T> {

  T apply(long input);

  @Override
  default T apply(Integer input){
    return apply(input.intValue());
  }
}
