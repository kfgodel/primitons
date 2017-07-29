package ar.com.kfgodel.function.boxing;

import java.util.function.Function;

/**
 * This type represents a function that takes a primitive long input and produces a boxed long as result
 * Date: 29/07/17 - 19:23
 */
public interface LongToBoxedLongFunction extends Function<Long, Long> {

  Long apply(long input);

  @Override
  default Long apply(Long input) {
    return apply(input.longValue());
  }
}
