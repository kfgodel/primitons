package ar.com.kfgodel.function.unboxing;

/**
 * This type represents a function that takes a boxed boolean input and produces a primitive boolean as result
 * Date: 29/07/17 - 19:23
 */
public interface BoxedBooleanToBooleanFunction {

  boolean apply(Boolean input);
}
