package ar.com.kfgodel.function.intertype.doubles.arrays.boxed;

import java.util.function.Function;

/**
 * Date: 29/07/17 - 19:57
 */
public interface DoubleToArrayOfBoxedCharacterFunction extends Function<Double, Character[]> {

  Character[] apply(double input);

  @Override
  default Character[] apply(Double input){
    return apply(input.doubleValue());
  }
}
