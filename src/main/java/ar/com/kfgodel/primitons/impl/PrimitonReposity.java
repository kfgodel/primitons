package ar.com.kfgodel.primitons.impl;

import ar.com.kfgodel.nary.api.optionals.Optional;
import ar.com.kfgodel.primitons.api.basic.*;

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
    addConverterFrom(byte.class, byte.class, Byteton::identity);
    addConverterFrom(byte.class, double.class, Byteton::toDouble);
    addConverterFrom(byte.class, float.class, Byteton::toFloat);
    addConverterFrom(byte.class, int.class, Byteton::toInt);
    addConverterFrom(byte.class, long.class, Byteton::toLong);
    addConverterFrom(byte.class, short.class, Byteton::toShort);
    addConverterFrom(char.class, char.class, Charton::identity);
    addConverterFrom(double.class, double.class, Doubleton::identity);
    addConverterFrom(float.class, float.class, Floaton::identity);
    addConverterFrom(int.class, int.class, Inton::identity);
    addConverterFrom(int.class, double.class, Inton::toDouble);
    addConverterFrom(int.class, float.class, Inton::toFloat);
    addConverterFrom(long.class, long.class, Longton::identity);
    addConverterFrom(long.class, double.class, Longton::toDouble);
    addConverterFrom(short.class, short.class, Shorton::identity);
    addConverterFrom(short.class, double.class, Shorton::toDouble);
    addConverterFrom(short.class, float.class, Shorton::toFloat);
    addConverterFrom(short.class, int.class, Shorton::toInt);
    addConverterFrom(short.class, long.class, Shorton::toLong);

    addConverterFrom(String.class, String.class, Objecton::identity);
    addConverterFrom(Object.class, Object.class, Objecton::identity);
    addConverterFrom(Boolean.class, Boolean.class, Objecton::identity);
    addConverterFrom(Byte.class, Byte.class, Objecton::identity);
    addConverterFrom(Character.class, Character.class, Objecton::identity);
    addConverterFrom(Double.class, Double.class, Objecton::identity);
    addConverterFrom(Float.class, Float.class, Objecton::identity);
    addConverterFrom(Integer.class, Integer.class, Objecton::identity);
    addConverterFrom(Long.class, Long.class, Objecton::identity);
    addConverterFrom(Short.class, Short.class, Objecton::identity);

    addConverterFrom(boolean[].class, boolean[].class, Objecton::identity);
    addConverterFrom(byte[].class, byte[].class, Objecton::identity);
    addConverterFrom(char[].class, char[].class, Objecton::identity);
    addConverterFrom(double[].class, double[].class, Objecton::identity);
    addConverterFrom(float[].class, float[].class, Objecton::identity);
    addConverterFrom(int[].class, int[].class, Objecton::identity);
    addConverterFrom(long[].class, long[].class, Objecton::identity);
    addConverterFrom(short[].class, short[].class, Objecton::identity);

    addConverterFrom(String[].class, String[].class, Objecton::identity);
    addConverterFrom(Object[].class, Object[].class, Objecton::identity);
    addConverterFrom(Boolean[].class, Boolean[].class, Objecton::identity);
    addConverterFrom(Byte[].class, Byte[].class, Objecton::identity);
    addConverterFrom(Character[].class, Character[].class, Objecton::identity);
    addConverterFrom(Double[].class, Double[].class, Objecton::identity);
    addConverterFrom(Float[].class, Float[].class, Objecton::identity);
    addConverterFrom(Integer[].class, Integer[].class, Objecton::identity);
    addConverterFrom(Long[].class, Long[].class, Objecton::identity);
    addConverterFrom(Short[].class, Short[].class, Objecton::identity);

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
