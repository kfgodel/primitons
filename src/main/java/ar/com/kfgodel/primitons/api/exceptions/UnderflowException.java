package ar.com.kfgodel.primitons.api.exceptions;

/**
 * This type represents the error in which a value is not convertable to target type due to it falling under and out of
 * target set of possible values
 * Date: 29/07/17 - 18:45
 */
public class UnderflowException extends UnmappableException {

  public UnderflowException(Object value, Class<?> expectedType) {
    super("Value["+value+"] underflows type ["+expectedType+"]", value, expectedType);
  }
}
