package ar.com.kfgodel.primitons.api;

import ar.com.kfgodel.nary.api.optionals.Optional;
import ar.com.kfgodel.primitons.api.repositories.TypeRepository;
import ar.com.kfgodel.primitons.impl.PrimitonApiProvider;

import java.util.function.Function;

/**
 * This type defines the converter functions
 * Created by kfgodel on 03/07/17.
 */
public interface Primiton {

  /**
   * Single default instance
   */
  PrimitonApi INSTANCE = PrimitonApiProvider.create();

  static TypeRepository types(){
    return  INSTANCE.types();
  }

  static <I,O> Optional<Function<I,O>> converterFrom(Class<I> inputType, Class<O> outputType) {
    return INSTANCE.converterFrom(inputType, outputType);
  }

}
