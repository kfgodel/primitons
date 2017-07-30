package ar.com.kfgodel.function.intertype.booleans.arrays;

/**
 * This type represents a function that takes a boolean input and produces a byte as result
 * Date: 29/07/17 - 19:57
 */
public interface BooleanToArrayOfObjectFunction<T> {

  T[] apply(boolean input);

}