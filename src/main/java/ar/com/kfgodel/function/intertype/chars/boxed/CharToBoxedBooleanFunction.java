package ar.com.kfgodel.function.intertype.chars.boxed;

import java.util.function.Function;

/**
 * This type represents a function that takes a primitive boolean input and produces a boxed boolean as result
 * Date: 29/07/17 - 19:23
 */
public interface CharToBoxedBooleanFunction extends Function<Character, Boolean> {

  Boolean apply(char input);

  @Override
  default Boolean apply(Character aBoolean) {
    return apply(aBoolean.charValue());
  }
}
