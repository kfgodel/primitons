package ar.com.kfgodel.function.boxing.arrays;

/**
 * This type represents a function that takes a primitive short input and produces a boxed short as result
 * Date: 29/07/17 - 19:23
 */
public interface ArrayOfShortToArrayOfBoxedShortFunction {

  Short[] apply(short[] input);
}