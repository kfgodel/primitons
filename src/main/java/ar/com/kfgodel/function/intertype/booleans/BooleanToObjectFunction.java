package ar.com.kfgodel.function.intertype.booleans;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface BooleanToObjectFunction<T> extends Function<Integer, T> {

  T apply(boolean input);

  @Override
  default T apply(Integer input){
    return apply(input.intValue());
  }
}
