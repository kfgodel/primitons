package ar.com.kfgodel.function.unboxing;

/**
 * This type represents a function that takes a boxed integer input and produces a primitive int as result
 * Date: 29/07/17 - 19:23
 */
public interface BoxedIntegerToIntFunction {

  int apply(Integer input);
}
