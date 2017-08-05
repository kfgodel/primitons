package ar.com.kfgodel.primitons.api;

import ar.com.kfgodel.nary.api.optionals.Optional;
import ar.com.kfgodel.primitons.impl.PrimitonReposity;
import ar.com.kfgodel.primitons.impl.TypeRepository;

import java.util.function.Function;

/**
 * This type defines the converter functions
 * Created by kfgodel on 03/07/17.
 */
public interface Primiton {

  /**
   * Default repository with information of all the primiton functions
   */
  public static final PrimitonReposity FUNCTION_REPOSITY = PrimitonReposity.create();
  /**
   * Default repository with information of type relationships
   */
  public static final TypeRepository TYPE_REPOSITORY = TypeRepository.create();

  static TypeRepository types(){
    return TYPE_REPOSITORY;
  }

  static <I,O> Optional<Function<I,O>> converterFrom(Class<I> inputType, Class<O> outputType) {
    return FUNCTION_REPOSITY.getConverterFrom(inputType, outputType);
  }

}
