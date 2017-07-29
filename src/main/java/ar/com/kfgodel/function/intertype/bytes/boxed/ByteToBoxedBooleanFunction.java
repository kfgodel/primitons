package ar.com.kfgodel.function.intertype.bytes.boxed;

import java.util.function.Function;

/**
 * This type represents a function that takes a primitive boolean input and produces a boxed boolean as result
 * Date: 29/07/17 - 19:23
 */
public interface ByteToBoxedBooleanFunction extends Function<Byte, Boolean> {

  Boolean apply(byte input);

  @Override
  default Boolean apply(Byte aBoolean) {
    return apply(aBoolean.byteValue());
  }
}
