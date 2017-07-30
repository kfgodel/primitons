package ar.com.kfgodel.function.intertype.floats;

import java.util.function.Function;

/**
 * This type represents a function that takes a boolean input and produces a byte as result
 * Date: 29/07/17 - 19:57
 */
public interface FloatToObjectFunction<T> extends Function<Float, T> {

  T apply(float input);

  @Override
  default T apply(Float input){
    return apply(input.floatValue());
  }
}
