package ar.com.kfgodel.primitons.impl;

import ar.com.kfgodel.nary.api.optionals.Optional;
import ar.com.kfgodel.primitons.api.Booleanton;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

/**
 * This type represents a primiton repository with all the conversion functions
 */
public class PrimitonReposity {

  private Map<TransformationDirection, Function> functionsPerDirection;

  public static PrimitonReposity create() {
    PrimitonReposity reposity = new PrimitonReposity();
    reposity.functionsPerDirection = new HashMap<>();
    reposity.initialize();
    return reposity;
  }

  private void initialize() {
    addConverterFrom(boolean.class, boolean.class, Booleanton::identity);
    addConverterFrom(Boolean.class, Boolean.class, Booleanton::identity);
  }

  private<I,O> PrimitonReposity addConverterFrom(Class<I> inputType, Class<O> outputType, Function<I, O> primiton) {
    TransformationDirection<I, O> direction = directionFrom(inputType, outputType);
    functionsPerDirection.put(direction,primiton);
    return this;
  }

  public <I, O> Optional<Function<I, O>> getConverterFrom(Class<I> inputType, Class<O> outputType) {
    TransformationDirection<I, O> direction = directionFrom(inputType, outputType);
    Function<I,O> function = functionsPerDirection.get(direction);
    return Optional.ofNullable(function);
  }

  private <I, O> TransformationDirection<I, O> directionFrom(Class<I> inputType, Class<O> outputType) {
    return TransformationDirection.create(inputType, outputType);
  }
}
