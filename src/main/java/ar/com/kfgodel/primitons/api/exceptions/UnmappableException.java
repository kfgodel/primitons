package ar.com.kfgodel.primitons.api.exceptions;

/**
 * This type represents the error in which a value is not convertable to the destination type
 * Date: 29/07/17 - 18:40
 */
public class UnmappableException extends PrimitonException {

  private final Object value;
  private final Class<?> expectedType;

  public UnmappableException(Object value, Class<?> expectedType) {
    this("Value["+value+"] is not convertible to type ["+expectedType+"]", value, expectedType);
  }

  public UnmappableException(String message, Object value, Class<?> expectedType) {
    super(message);
    this.value = value;
    this.expectedType = expectedType;
  }


  public Object getValue() {
    return value;
  }

  public Class<?> getExpectedType() {
    return expectedType;
  }
}
