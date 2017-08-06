package ar.com.kfgodel.primitons.impl;

import ar.com.kfgodel.nary.api.optionals.Optional;
import ar.com.kfgodel.primitons.api.basic.*;
import ar.com.kfgodel.primitons.api.boxed.*;

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
    addConverterFrom(boolean.class, Boolean.class, Booleanton::toBoxedBoolean);

    addConverterFrom(byte.class, byte.class, Byteton::identity);
    addConverterFrom(byte.class, Byte.class, Byteton::toBoxedByte);
    addConverterFrom(byte.class, double.class, Byteton::toDouble);
    addConverterFrom(byte.class, float.class, Byteton::toFloat);
    addConverterFrom(byte.class, int.class, Byteton::toInt);
    addConverterFrom(byte.class, long.class, Byteton::toLong);
    addConverterFrom(byte.class, short.class, Byteton::toShort);

    addConverterFrom(char.class, char.class, Charton::identity);
    addConverterFrom(char.class, Character.class, Charton::toBoxedCharacter);

    addConverterFrom(double.class, double.class, Doubleton::identity);
    addConverterFrom(double.class, Double.class, Doubleton::toBoxedDouble);
    addConverterFrom(double.class, byte.class, Doubleton::toByte);
    addConverterFrom(double.class, float.class, Doubleton::toFloat);
    addConverterFrom(double.class, int.class, Doubleton::toInt);
    addConverterFrom(double.class, long.class, Doubleton::toLong);
    addConverterFrom(double.class, short.class, Doubleton::toShort);

    addConverterFrom(float.class, float.class, Floaton::identity);
    addConverterFrom(float.class, Float.class, Floaton::toBoxedFloat);
    addConverterFrom(float.class, byte.class, Floaton::toByte);
    addConverterFrom(float.class, double.class, Floaton::toDouble);
    addConverterFrom(float.class, int.class, Floaton::toInt);
    addConverterFrom(float.class, long.class, Floaton::toLong);
    addConverterFrom(float.class, short.class, Floaton::toShort);

    addConverterFrom(int.class, int.class, Inton::identity);
    addConverterFrom(int.class, Integer.class, Inton::toBoxedInteger);
    addConverterFrom(int.class, byte.class, Inton::toByte);
    addConverterFrom(int.class, double.class, Inton::toDouble);
    addConverterFrom(int.class, float.class, Inton::toFloat);
    addConverterFrom(int.class, short.class, Inton::toShort);
    addConverterFrom(int.class, long.class, Inton::toLong);

    addConverterFrom(long.class, long.class, Longton::identity);
    addConverterFrom(long.class, Long.class, Longton::toBoxedLong);
    addConverterFrom(long.class, byte.class, Longton::toByte);
    addConverterFrom(long.class, double.class, Longton::toDouble);
    addConverterFrom(long.class, float.class, Longton::toFloat);
    addConverterFrom(long.class, int.class, Longton::toInt);
    addConverterFrom(long.class, short.class, Longton::toShort);

    addConverterFrom(short.class, short.class, Shorton::identity);
    addConverterFrom(short.class, Short.class, Shorton::toBoxedShort);
    addConverterFrom(short.class, byte.class, Shorton::toByte);
    addConverterFrom(short.class, double.class, Shorton::toDouble);
    addConverterFrom(short.class, float.class, Shorton::toFloat);
    addConverterFrom(short.class, int.class, Shorton::toInt);
    addConverterFrom(short.class, long.class, Shorton::toLong);

    addConverterFrom(Boolean.class, Boolean.class, Objecton::identity);
    addConverterFrom(Boolean.class, boolean.class, BoxedBooleanton::toBoolean);

    addConverterFrom(Byte.class, Byte.class, Objecton::identity);
    addConverterFrom(Byte.class, byte.class, BoxedByteton::toByte);
    addConverterFrom(Byte.class, double.class, BoxedByteton::toDouble);
    addConverterFrom(Byte.class, float.class, BoxedByteton::toFloat);
    addConverterFrom(Byte.class, int.class, BoxedByteton::toInt);
    addConverterFrom(Byte.class, long.class, BoxedByteton::toLong);
    addConverterFrom(Byte.class, short.class, BoxedByteton::toShort);

    addConverterFrom(Character.class, Character.class, Objecton::identity);
    addConverterFrom(Character.class, char.class, BoxedCharacterton::toChar);

    addConverterFrom(Double.class, Double.class, Objecton::identity);
    addConverterFrom(Double.class, byte.class, BoxedDoubleton::toByte);
    addConverterFrom(Double.class, double.class, BoxedDoubleton::toDouble);
    addConverterFrom(Double.class, float.class, BoxedDoubleton::toFloat);
    addConverterFrom(Double.class, int.class, BoxedDoubleton::toInt);
    addConverterFrom(Double.class, long.class, BoxedDoubleton::toLong);
    addConverterFrom(Double.class, short.class, BoxedDoubleton::toShort);

    addConverterFrom(Float.class, Float.class, Objecton::identity);
    addConverterFrom(Float.class, float.class, BoxedFloaton::toFloat);

    addConverterFrom(Integer.class, Integer.class, Objecton::identity);
    addConverterFrom(Integer.class, int.class, BoxedIntegerton::toInt);

    addConverterFrom(Long.class, Long.class, Objecton::identity);
    addConverterFrom(Long.class, long.class, BoxedLongton::toLong);

    addConverterFrom(Object.class, Object.class, Objecton::identity);

    addConverterFrom(Short.class, Short.class, Objecton::identity);
    addConverterFrom(Short.class, short.class, BoxedShorton::toShort);

    addConverterFrom(String.class, String.class, Objecton::identity);

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
