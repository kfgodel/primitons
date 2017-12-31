package ar.com.kfgodel.primitons.impl;

import ar.com.kfgodel.nary.api.optionals.Optional;
import ar.com.kfgodel.primitons.api.repositories.PrimitonReposity;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

/**
 * This type represents a primiton repository with all the conversion functions
 */
public class PrimitonReposityImpl implements ar.com.kfgodel.primitons.api.repositories.PrimitonReposity {

  private Map<TransformationDirection, Function> functionsPerDirection;

  public static PrimitonReposity create() {
    PrimitonReposityImpl reposity = new PrimitonReposityImpl();
    reposity.functionsPerDirection = new HashMap<>();
    return reposity;
  }

  public <I, O> PrimitonReposity addConverterFrom(Class<I> inputType, Class<O> outputType, Function<? extends  I, ? super O> primiton){
    TransformationDirection<I, O> direction = directionFrom(inputType, outputType);
    functionsPerDirection.put(direction,primiton);
    return this;
  }

  @Override
  public <I, O> Optional<Function<I, O>> getConverterFrom(Class<I> inputType, Class<O> outputType) {
    TransformationDirection<I, O> direction = directionFrom(inputType, outputType);
    Function<I,O> function = functionsPerDirection.get(direction);
    return Optional.ofNullable(function);
  }

  private <I, O> TransformationDirection<I, O> directionFrom(Class<I> inputType, Class<O> outputType) {
    return TransformationDirection.create(inputType, outputType);
  }
}
