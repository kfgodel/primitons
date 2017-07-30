package ar.com.kfgodel.function.intertype.chars.arrays;

/**
 * This type represents a function that takes a boolean input and produces a byte as result
 * Date: 29/07/17 - 19:57
 */
public interface CharToArrayOfObjectFunction<T> {

  T[] apply(char input);

}
