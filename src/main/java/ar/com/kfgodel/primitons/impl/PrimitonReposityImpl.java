package ar.com.kfgodel.primitons.impl;

import ar.com.kfgodel.nary.api.optionals.Optional;
import ar.com.kfgodel.primitons.api.basic.*;
import ar.com.kfgodel.primitons.api.boxed.*;
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
    reposity.initialize();
    return reposity;
  }

  private void initialize() {
    addConverterFrom(boolean.class, boolean.class, Booleanton::identity);
    addConverterFrom(boolean.class, Boolean.class, Booleanton::toBoxedBoolean);

    addConverterFrom(byte.class, byte.class, Byteton::identity);
    addConverterFrom(byte.class, double.class, Byteton::toDouble);
    addConverterFrom(byte.class, float.class, Byteton::toFloat);
    addConverterFrom(byte.class, int.class, Byteton::toInt);
    addConverterFrom(byte.class, long.class, Byteton::toLong);
    addConverterFrom(byte.class, short.class, Byteton::toShort);
    addConverterFrom(byte.class, Byte.class, Byteton::toBoxedByte);
    addConverterFrom(byte.class, Double.class, Byteton::toBoxedDouble);
    addConverterFrom(byte.class, Float.class, Byteton::toBoxedFloat);
    addConverterFrom(byte.class, Integer.class, Byteton::toBoxedInteger);
    addConverterFrom(byte.class, Long.class, Byteton::toBoxedLong);
    addConverterFrom(byte.class, Short.class, Byteton::toBoxedShort);

    addConverterFrom(char.class, char.class, Charton::identity);
    addConverterFrom(char.class, Character.class, Charton::toBoxedCharacter);

    addConverterFrom(double.class, double.class, Doubleton::identity);
    addConverterFrom(double.class, byte.class, Doubleton::toByte);
    addConverterFrom(double.class, float.class, Doubleton::toFloat);
    addConverterFrom(double.class, int.class, Doubleton::toInt);
    addConverterFrom(double.class, long.class, Doubleton::toLong);
    addConverterFrom(double.class, short.class, Doubleton::toShort);
    addConverterFrom(double.class, Byte.class, Doubleton::toBoxedByte);
    addConverterFrom(double.class, Double.class, Doubleton::toBoxedDouble);
    addConverterFrom(double.class, Float.class, Doubleton::toBoxedFloat);
    addConverterFrom(double.class, Integer.class, Doubleton::toBoxedInteger);
    addConverterFrom(double.class, Long.class, Doubleton::toBoxedLong);
    addConverterFrom(double.class, Short.class, Doubleton::toBoxedShort);

    addConverterFrom(float.class, float.class, Floaton::identity);
    addConverterFrom(float.class, byte.class, Floaton::toByte);
    addConverterFrom(float.class, double.class, Floaton::toDouble);
    addConverterFrom(float.class, int.class, Floaton::toInt);
    addConverterFrom(float.class, long.class, Floaton::toLong);
    addConverterFrom(float.class, short.class, Floaton::toShort);
    addConverterFrom(float.class, Byte.class, Floaton::toBoxedByte);
    addConverterFrom(float.class, Double.class, Floaton::toBoxedDouble);
    addConverterFrom(float.class, Float.class, Floaton::toBoxedFloat);
    addConverterFrom(float.class, Integer.class, Floaton::toBoxedInteger);
    addConverterFrom(float.class, Long.class, Floaton::toBoxedLong);
    addConverterFrom(float.class, Short.class, Floaton::toBoxedShort);

    addConverterFrom(int.class, int.class, Inton::identity);
    addConverterFrom(int.class, byte.class, Inton::toByte);
    addConverterFrom(int.class, double.class, Inton::toDouble);
    addConverterFrom(int.class, float.class, Inton::toFloat);
    addConverterFrom(int.class, short.class, Inton::toShort);
    addConverterFrom(int.class, long.class, Inton::toLong);
    addConverterFrom(int.class, Byte.class, Inton::toBoxedByte);
    addConverterFrom(int.class, Double.class, Inton::toBoxedDouble);
    addConverterFrom(int.class, Float.class, Inton::toBoxedFloat);
    addConverterFrom(int.class, Integer.class, Inton::toBoxedInteger);
    addConverterFrom(int.class, Long.class, Inton::toBoxedLong);
    addConverterFrom(int.class, Short.class, Inton::toBoxedShort);

    addConverterFrom(long.class, long.class, Longton::identity);
    addConverterFrom(long.class, byte.class, Longton::toByte);
    addConverterFrom(long.class, double.class, Longton::toDouble);
    addConverterFrom(long.class, float.class, Longton::toFloat);
    addConverterFrom(long.class, int.class, Longton::toInt);
    addConverterFrom(long.class, short.class, Longton::toShort);
    addConverterFrom(long.class, Byte.class, Longton::toBoxedByte);
    addConverterFrom(long.class, Double.class, Longton::toBoxedDouble);
    addConverterFrom(long.class, Float.class, Longton::toBoxedFloat);
    addConverterFrom(long.class, Integer.class, Longton::toBoxedInteger);
    addConverterFrom(long.class, Long.class, Longton::toBoxedLong);
    addConverterFrom(long.class, Short.class, Longton::toBoxedShort);

    addConverterFrom(short.class, short.class, Shorton::identity);
    addConverterFrom(short.class, byte.class, Shorton::toByte);
    addConverterFrom(short.class, double.class, Shorton::toDouble);
    addConverterFrom(short.class, float.class, Shorton::toFloat);
    addConverterFrom(short.class, int.class, Shorton::toInt);
    addConverterFrom(short.class, long.class, Shorton::toLong);
    addConverterFrom(short.class, Byte.class, Shorton::toBoxedByte);
    addConverterFrom(short.class, Double.class, Shorton::toBoxedDouble);
    addConverterFrom(short.class, Float.class, Shorton::toBoxedFloat);
    addConverterFrom(short.class, Integer.class, Shorton::toBoxedInteger);
    addConverterFrom(short.class, Long.class, Shorton::toBoxedLong);
    addConverterFrom(short.class, Short.class, Shorton::toBoxedShort);

    addConverterFrom(Boolean.class, Boolean.class, Objecton::identity);
    addConverterFrom(Boolean.class, boolean.class, BoxedBooleanton::toBoolean);

    addConverterFrom(Byte.class, byte.class, BoxedByteton::toByte);
    addConverterFrom(Byte.class, double.class, BoxedByteton::toDouble);
    addConverterFrom(Byte.class, float.class, BoxedByteton::toFloat);
    addConverterFrom(Byte.class, int.class, BoxedByteton::toInt);
    addConverterFrom(Byte.class, long.class, BoxedByteton::toLong);
    addConverterFrom(Byte.class, short.class, BoxedByteton::toShort);
    addConverterFrom(Byte.class, Byte.class, BoxedByteton::toBoxedByte);
    addConverterFrom(Byte.class, Double.class, BoxedByteton::toBoxedDouble);
    addConverterFrom(Byte.class, Float.class, BoxedByteton::toBoxedFloat);
    addConverterFrom(Byte.class, Integer.class, BoxedByteton::toBoxedInteger);
    addConverterFrom(Byte.class, Long.class, BoxedByteton::toBoxedLong);
    addConverterFrom(Byte.class, Short.class, BoxedByteton::toBoxedShort);

    addConverterFrom(Character.class, Character.class, Objecton::identity);
    addConverterFrom(Character.class, char.class, BoxedCharacterton::toChar);

    addConverterFrom(Double.class, byte.class, BoxedDoubleton::toByte);
    addConverterFrom(Double.class, double.class, BoxedDoubleton::toDouble);
    addConverterFrom(Double.class, float.class, BoxedDoubleton::toFloat);
    addConverterFrom(Double.class, int.class, BoxedDoubleton::toInt);
    addConverterFrom(Double.class, long.class, BoxedDoubleton::toLong);
    addConverterFrom(Double.class, short.class, BoxedDoubleton::toShort);
    addConverterFrom(Double.class, Byte.class, BoxedDoubleton::toBoxedByte);
    addConverterFrom(Double.class, Double.class, BoxedDoubleton::toBoxedDouble);
    addConverterFrom(Double.class, Float.class, BoxedDoubleton::toBoxedFloat);
    addConverterFrom(Double.class, Integer.class, BoxedDoubleton::toBoxedInteger);
    addConverterFrom(Double.class, Long.class, BoxedDoubleton::toBoxedLong);
    addConverterFrom(Double.class, Short.class, BoxedDoubleton::toBoxedShort);

    addConverterFrom(Float.class, byte.class, BoxedFloaton::toByte);
    addConverterFrom(Float.class, double.class, BoxedFloaton::toDouble);
    addConverterFrom(Float.class, float.class, BoxedFloaton::toFloat);
    addConverterFrom(Float.class, int.class, BoxedFloaton::toInt);
    addConverterFrom(Float.class, long.class, BoxedFloaton::toLong);
    addConverterFrom(Float.class, short.class, BoxedFloaton::toShort);
    addConverterFrom(Float.class, Byte.class, BoxedFloaton::toBoxedByte);
    addConverterFrom(Float.class, Double.class, BoxedFloaton::toBoxedDouble);
    addConverterFrom(Float.class, Float.class, BoxedFloaton::toBoxedFloat);
    addConverterFrom(Float.class, Integer.class, BoxedFloaton::toBoxedInteger);
    addConverterFrom(Float.class, Long.class, BoxedFloaton::toBoxedLong);
    addConverterFrom(Float.class, Short.class, BoxedFloaton::toBoxedShort);

    addConverterFrom(Integer.class, byte.class, BoxedIntegerton::toByte);
    addConverterFrom(Integer.class, double.class, BoxedIntegerton::toDouble);
    addConverterFrom(Integer.class, float.class, BoxedIntegerton::toFloat);
    addConverterFrom(Integer.class, int.class, BoxedIntegerton::toInt);
    addConverterFrom(Integer.class, long.class, BoxedIntegerton::toLong);
    addConverterFrom(Integer.class, short.class, BoxedIntegerton::toShort);
    addConverterFrom(Integer.class, Byte.class, BoxedIntegerton::toBoxedByte);
    addConverterFrom(Integer.class, Double.class, BoxedIntegerton::toBoxedDouble);
    addConverterFrom(Integer.class, Float.class, BoxedIntegerton::toBoxedFloat);
    addConverterFrom(Integer.class, Integer.class, BoxedIntegerton::toBoxedInteger);
    addConverterFrom(Integer.class, Long.class, BoxedIntegerton::toBoxedLong);
    addConverterFrom(Integer.class, Short.class, BoxedIntegerton::toBoxedShort);

    addConverterFrom(Long.class, byte.class, BoxedLongton::toByte);
    addConverterFrom(Long.class, double.class, BoxedLongton::toDouble);
    addConverterFrom(Long.class, float.class, BoxedLongton::toFloat);
    addConverterFrom(Long.class, int.class, BoxedLongton::toInt);
    addConverterFrom(Long.class, long.class, BoxedLongton::toLong);
    addConverterFrom(Long.class, short.class, BoxedLongton::toShort);
    addConverterFrom(Long.class, Byte.class, BoxedLongton::toBoxedByte);
    addConverterFrom(Long.class, Double.class, BoxedLongton::toBoxedDouble);
    addConverterFrom(Long.class, Float.class, BoxedLongton::toBoxedFloat);
    addConverterFrom(Long.class, Integer.class, BoxedLongton::toBoxedInteger);
    addConverterFrom(Long.class, Long.class, BoxedLongton::toBoxedLong);
    addConverterFrom(Long.class, Short.class, BoxedLongton::toBoxedShort);

    addConverterFrom(Object.class, Object.class, Objecton::identity);

    addConverterFrom(Short.class, byte.class, BoxedShorton::toByte);
    addConverterFrom(Short.class, double.class, BoxedShorton::toDouble);
    addConverterFrom(Short.class, float.class, BoxedShorton::toFloat);
    addConverterFrom(Short.class, int.class, BoxedShorton::toInt);
    addConverterFrom(Short.class, long.class, BoxedShorton::toLong);
    addConverterFrom(Short.class, short.class, BoxedShorton::toShort);
    addConverterFrom(Short.class, Byte.class, BoxedShorton::toBoxedByte);
    addConverterFrom(Short.class, Double.class, BoxedShorton::toBoxedDouble);
    addConverterFrom(Short.class, Float.class, BoxedShorton::toBoxedFloat);
    addConverterFrom(Short.class, Integer.class, BoxedShorton::toBoxedInteger);
    addConverterFrom(Short.class, Long.class, BoxedShorton::toBoxedLong);
    addConverterFrom(Short.class, Short.class, BoxedShorton::toBoxedShort);

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
