package ar.com.kfgodel.function.intertype.floats;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface FloatToObjectFunction<T> extends Function<Integer, T> {

  T apply(float input);

  @Override
  default T apply(Integer input){
    return apply(input.intValue());
  }
}
