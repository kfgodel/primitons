package ar.com.kfgodel.function.unboxing;

/**
 * This type represents a function that takes a boxed long input and produces a primitive long as result
 * Date: 29/07/17 - 19:23
 */
public interface BoxedLongToLongFunction {

  long apply(Long input);
}
