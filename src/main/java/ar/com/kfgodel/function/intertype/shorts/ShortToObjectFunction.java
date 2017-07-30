package ar.com.kfgodel.function.intertype.shorts;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface ShortToObjectFunction<T> extends Function<Integer, T> {

  T apply(short input);

  @Override
  default T apply(Integer input){
    return apply(input.intValue());
  }
}
