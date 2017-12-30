package ar.com.kfgodel.primitons.api.repositories;

import ar.com.kfgodel.nary.api.optionals.Optional;

import java.util.function.Function;

/**
 * This type represents a storage for primitive transformation functions (primitons)
 *
 * Date: 30/12/17 - 16:36
 */
public interface PrimitonReposity {

  /**
   * Registers a transformation function for the given types. A previous function for the given types is replaced if present
   * @param inputType The class indicating the type of function input
   * @param outputType The class indicatung the function output
   * @param primiton The transformation function
   * @param <I> Expected input type
   * @param <O> Expected output type
   * @return This instance for method chaining
   */
  <I, O> PrimitonReposity addConverterFrom(Class<I> inputType, Class<O> outputType, Function<? extends  I, ? super O> primiton);

  /**
   * Returns a function that converts input of the given type to output of the expected type.<br>
   *   If such a function is not present on this repo, an empty is returned
   * @param inputType The class indicating the possible input type
   * @param outputType The class indicating the expected output type
   * @param <I> Expected input type
   * @param <O> Exected output type
   * @return The optional function if found
   */
  <I, O> Optional<Function<I, O>> getConverterFrom(Class<I> inputType, Class<O> outputType);
}
