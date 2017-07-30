package ar.com.kfgodel.function.intertype.chars;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface CharToObjectFunction<T> extends Function<Integer, T> {

  T apply(char input);

  @Override
  default T apply(Integer input){
    return apply(input.intValue());
  }
}
