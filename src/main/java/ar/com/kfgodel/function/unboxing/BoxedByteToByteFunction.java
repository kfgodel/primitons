package ar.com.kfgodel.function.unboxing;

/**
 * This type represents a function that takes a boxed byte input and produces a primitive byte as result
 * Date: 29/07/17 - 19:23
 */
public interface BoxedByteToByteFunction {

  byte apply(Byte input);
}
