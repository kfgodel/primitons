package ar.com.kfgodel.function.boxing;

import java.util.function.Function;

/**
 * This type represents a function that takes a primitive int input and produces a boxed integer as result
 * Date: 29/07/17 - 19:23
 */
public interface IntToBoxedIntegerFunction extends Function<Integer, Integer> {

  Integer apply(int input);

  @Override
  default Integer apply(Integer input) {
    return apply(input.intValue());
  }
}
