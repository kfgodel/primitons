package ar.com.kfgodel.function.intertype.ints;

import java.util.function.Function;

/**
 * This type represents a function that takes a boolean input and produces a int as result
 * Date: 29/07/17 - 19:57
 */
public interface IntToFloatFunction extends Function<Integer, Float> {

  float apply(int input);

  @Override
  default Float apply(Integer input){
    return apply(input.intValue());
  }
}
