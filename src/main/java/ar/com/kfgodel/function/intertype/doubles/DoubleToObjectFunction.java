package ar.com.kfgodel.function.intertype.doubles;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface DoubleToObjectFunction<T> extends Function<Integer, T> {

  T apply(double input);

  @Override
  default T apply(Integer input){
    return apply(input.intValue());
  }
}
