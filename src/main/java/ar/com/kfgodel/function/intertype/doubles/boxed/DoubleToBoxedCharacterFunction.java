package ar.com.kfgodel.function.intertype.doubles.boxed;

import java.util.function.Function;

/**
 * This type represents a function that takes a boolean input and produces a char as result
 * Date: 29/07/17 - 19:57
 */
public interface DoubleToBoxedCharacterFunction extends Function<Double, Character> {

  Character apply(double input);

  @Override
  default Character apply(Double input){
    return apply(input.doubleValue());
  }
}
