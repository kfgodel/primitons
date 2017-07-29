package ar.com.kfgodel.function.boxing;

import java.util.function.Function;

/**
 * This type represents a function that takes a primitive short input and produces a boxed short as result
 * Date: 29/07/17 - 19:23
 */
public interface ShortToBoxedShortFunction extends Function<Short, Short> {

  Short apply(short input);

  @Override
  default Short apply(Short input) {
    return apply(input.shortValue());
  }
}
