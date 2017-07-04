package ar.com.kfgodel.primitons.api.exceptions;

/**
 * This class represents an error type conversion
 * Created by kfgodel on 03/07/17.
 */
public class PrimitonException extends RuntimeException {
  public PrimitonException(String message) {
    super(message);
  }

  public PrimitonException(String message, Throwable cause) {
    super(message, cause);
  }

  public PrimitonException(Throwable cause) {
    super(cause);
  }
}
