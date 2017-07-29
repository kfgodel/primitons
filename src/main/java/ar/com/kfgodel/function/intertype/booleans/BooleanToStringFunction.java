package ar.com.kfgodel.function.intertype.booleans;

import java.util.function.Function;

/**
 * This type represents a function that takes a boolean input and produces a byte as result
 * Date: 29/07/17 - 19:57
 */
public interface BooleanToStringFunction extends Function<Boolean, String> {

  String apply(boolean input);

  @Override
  default String apply(Boolean input){
    return apply(input.booleanValue());
  }
}
