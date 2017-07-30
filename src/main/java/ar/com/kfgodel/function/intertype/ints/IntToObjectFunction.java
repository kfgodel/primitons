package ar.com.kfgodel.function.intertype.ints;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface IntToObjectFunction<T> extends Function<Integer, T> {

  T apply(int input);

  @Override
  default T apply(Integer input){
    return apply(input.intValue());
  }
}
