package ar.com.kfgodel.primitons.impl.asserts;

import ar.com.kfgodel.primitons.api.exceptions.UnmappableException;

/**
 * This type helps on dealing with null values
 * Date: 06/08/17 - 12:13
 */
public class Null {

  /**
   * Checks if the given input is null and throws an exception if it does
   * @param expectedType the type that is expected to be converted  to
   * @param input The value to check
   */
  public static void unmappableTo(Class<?> expectedType, Object input) throws UnmappableException {
    if(input == null){
      throw new UnmappableException(input, expectedType);
    }
  }
}
