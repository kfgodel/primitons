package ar.com.kfgodel.function.unboxing;

/**
 * This type represents a function that takes a boxed double input and produces a primitive double as result
 * Date: 29/07/17 - 19:23
 */
public interface BoxedDoubleToDoubleFunction {

  double apply(Double input);
}
