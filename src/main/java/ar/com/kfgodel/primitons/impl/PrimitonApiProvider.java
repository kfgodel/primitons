package ar.com.kfgodel.primitons.impl;

import ar.com.kfgodel.nary.api.optionals.Optional;
import ar.com.kfgodel.primitons.api.PrimitonApi;
import ar.com.kfgodel.primitons.api.repositories.FunctionReposity;
import ar.com.kfgodel.primitons.api.repositories.TypeRepository;
import ar.com.kfgodel.primitons.impl.initializers.FunctionRepositoryInitializer;

import java.util.function.Function;

/**
 * This class is the container of all the primiton api elements
 * Date: 30/12/17 - 21:17
 */
public class PrimitonApiProvider implements PrimitonApi {

  private TypeRepository typeRepository;
  private FunctionReposity functionRepository;

  public static PrimitonApiProvider create() {
    PrimitonApiProvider primiton = new PrimitonApiProvider();
    primiton.typeRepository = TypeRepositoryImpl.create();
    primiton.functionRepository = FunctionReposityImpl.create();
    primiton.initialize();
    return primiton;
  }

  private void initialize() {
    FunctionRepositoryInitializer.create().initialize(this.functionRepository);
  }

  @Override
  public TypeRepository types() {
    return typeRepository;
  }

  @Override
  public <I, O> Optional<Function<I, O>> converterFrom(Class<I> inputType, Class<O> outputType) {
    return functionRepository.getConverterFrom(inputType, outputType);
  }
}
