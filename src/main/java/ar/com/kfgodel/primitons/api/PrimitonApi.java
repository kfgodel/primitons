package ar.com.kfgodel.primitons.api;

import ar.com.kfgodel.nary.api.optionals.Optional;
import ar.com.kfgodel.primitons.api.repositories.TypeRepository;

import java.util.function.Function;

/**
 * This type defines the public api available from primiton project
 * Date: 30/12/17 - 21:15
 */
public interface PrimitonApi {

  /**
   * @return Type repository used by this api instance to define the managed type universe
   */
  TypeRepository types();

  /**
   * Gets the primiton function to convert from input to output types
   * @param inputType The class that defines the input type
   * @param outputType The class that defines the expected output type
   * @param <I> Conversion Input type
   * @param <O> Result Output type
   * @return The function to convert an input of indicated type, or empty if none is defined
   */
  <I, O> Optional<Function<I,O>> converterFrom(Class<I> inputType, Class<O> outputType);
}
