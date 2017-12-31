package ar.com.kfgodel.primitons.impl.initializers;

import ar.com.kfgodel.primitons.api.basic.*;
import ar.com.kfgodel.primitons.api.boxed.*;
import ar.com.kfgodel.primitons.api.repositories.FunctionReposity;

/**
 * This class initializes a primiton repository for the basic primiton functions
 *
 * Date: 30/12/17 - 21:28
 */
public class FunctionRepositoryInitializer {

  public void initialize(FunctionReposity reposity){
    reposity.addConverterFrom(boolean.class, boolean.class, Booleanton::identity);
    reposity.addConverterFrom(boolean.class, Boolean.class, Booleanton::toBoxedBoolean);
    reposity.addConverterFrom(boolean.class, boolean[].class, Booleanton::toArray);

    reposity.addConverterFrom(byte.class, byte.class, Byteton::identity);
    reposity.addConverterFrom(byte.class, double.class, Byteton::toDouble);
    reposity.addConverterFrom(byte.class, float.class, Byteton::toFloat);
    reposity.addConverterFrom(byte.class, int.class, Byteton::toInt);
    reposity.addConverterFrom(byte.class, long.class, Byteton::toLong);
    reposity.addConverterFrom(byte.class, short.class, Byteton::toShort);
    reposity.addConverterFrom(byte.class, Byte.class, Byteton::toBoxedByte);
    reposity.addConverterFrom(byte.class, Double.class, Byteton::toBoxedDouble);
    reposity.addConverterFrom(byte.class, Float.class, Byteton::toBoxedFloat);
    reposity.addConverterFrom(byte.class, Integer.class, Byteton::toBoxedInteger);
    reposity.addConverterFrom(byte.class, Long.class, Byteton::toBoxedLong);
    reposity.addConverterFrom(byte.class, Short.class, Byteton::toBoxedShort);
    reposity.addConverterFrom(byte.class, byte[].class, Byteton::toArray);

    reposity.addConverterFrom(char.class, char.class, Charton::identity);
    reposity.addConverterFrom(char.class, Character.class, Charton::toBoxedCharacter);
    reposity.addConverterFrom(char.class, char[].class, Charton::toArray);

    reposity.addConverterFrom(double.class, double.class, Doubleton::identity);
    reposity.addConverterFrom(double.class, byte.class, Doubleton::toByte);
    reposity.addConverterFrom(double.class, float.class, Doubleton::toFloat);
    reposity.addConverterFrom(double.class, int.class, Doubleton::toInt);
    reposity.addConverterFrom(double.class, long.class, Doubleton::toLong);
    reposity.addConverterFrom(double.class, short.class, Doubleton::toShort);
    reposity.addConverterFrom(double.class, Byte.class, Doubleton::toBoxedByte);
    reposity.addConverterFrom(double.class, Double.class, Doubleton::toBoxedDouble);
    reposity.addConverterFrom(double.class, Float.class, Doubleton::toBoxedFloat);
    reposity.addConverterFrom(double.class, Integer.class, Doubleton::toBoxedInteger);
    reposity.addConverterFrom(double.class, Long.class, Doubleton::toBoxedLong);
    reposity.addConverterFrom(double.class, Short.class, Doubleton::toBoxedShort);
    reposity.addConverterFrom(double.class, double[].class, Doubleton::toArray);

    reposity.addConverterFrom(float.class, float.class, Floaton::identity);
    reposity.addConverterFrom(float.class, byte.class, Floaton::toByte);
    reposity.addConverterFrom(float.class, double.class, Floaton::toDouble);
    reposity.addConverterFrom(float.class, int.class, Floaton::toInt);
    reposity.addConverterFrom(float.class, long.class, Floaton::toLong);
    reposity.addConverterFrom(float.class, short.class, Floaton::toShort);
    reposity.addConverterFrom(float.class, Byte.class, Floaton::toBoxedByte);
    reposity.addConverterFrom(float.class, Double.class, Floaton::toBoxedDouble);
    reposity.addConverterFrom(float.class, Float.class, Floaton::toBoxedFloat);
    reposity.addConverterFrom(float.class, Integer.class, Floaton::toBoxedInteger);
    reposity.addConverterFrom(float.class, Long.class, Floaton::toBoxedLong);
    reposity.addConverterFrom(float.class, Short.class, Floaton::toBoxedShort);
    reposity.addConverterFrom(float.class, float[].class, Floaton::toArray);

    reposity.addConverterFrom(int.class, int.class, Inton::identity);
    reposity.addConverterFrom(int.class, byte.class, Inton::toByte);
    reposity.addConverterFrom(int.class, double.class, Inton::toDouble);
    reposity.addConverterFrom(int.class, float.class, Inton::toFloat);
    reposity.addConverterFrom(int.class, short.class, Inton::toShort);
    reposity.addConverterFrom(int.class, long.class, Inton::toLong);
    reposity.addConverterFrom(int.class, Byte.class, Inton::toBoxedByte);
    reposity.addConverterFrom(int.class, Double.class, Inton::toBoxedDouble);
    reposity.addConverterFrom(int.class, Float.class, Inton::toBoxedFloat);
    reposity.addConverterFrom(int.class, Integer.class, Inton::toBoxedInteger);
    reposity.addConverterFrom(int.class, Long.class, Inton::toBoxedLong);
    reposity.addConverterFrom(int.class, Short.class, Inton::toBoxedShort);
    reposity.addConverterFrom(int.class, int[].class, Inton::toArray);

    reposity.addConverterFrom(long.class, long.class, Longton::identity);
    reposity.addConverterFrom(long.class, byte.class, Longton::toByte);
    reposity.addConverterFrom(long.class, double.class, Longton::toDouble);
    reposity.addConverterFrom(long.class, float.class, Longton::toFloat);
    reposity.addConverterFrom(long.class, int.class, Longton::toInt);
    reposity.addConverterFrom(long.class, short.class, Longton::toShort);
    reposity.addConverterFrom(long.class, Byte.class, Longton::toBoxedByte);
    reposity.addConverterFrom(long.class, Double.class, Longton::toBoxedDouble);
    reposity.addConverterFrom(long.class, Float.class, Longton::toBoxedFloat);
    reposity.addConverterFrom(long.class, Integer.class, Longton::toBoxedInteger);
    reposity.addConverterFrom(long.class, Long.class, Longton::toBoxedLong);
    reposity.addConverterFrom(long.class, Short.class, Longton::toBoxedShort);
    reposity.addConverterFrom(long.class, long[].class, Longton::toArray);

    reposity.addConverterFrom(short.class, short.class, Shorton::identity);
    reposity.addConverterFrom(short.class, byte.class, Shorton::toByte);
    reposity.addConverterFrom(short.class, double.class, Shorton::toDouble);
    reposity.addConverterFrom(short.class, float.class, Shorton::toFloat);
    reposity.addConverterFrom(short.class, int.class, Shorton::toInt);
    reposity.addConverterFrom(short.class, long.class, Shorton::toLong);
    reposity.addConverterFrom(short.class, Byte.class, Shorton::toBoxedByte);
    reposity.addConverterFrom(short.class, Double.class, Shorton::toBoxedDouble);
    reposity.addConverterFrom(short.class, Float.class, Shorton::toBoxedFloat);
    reposity.addConverterFrom(short.class, Integer.class, Shorton::toBoxedInteger);
    reposity.addConverterFrom(short.class, Long.class, Shorton::toBoxedLong);
    reposity.addConverterFrom(short.class, Short.class, Shorton::toBoxedShort);
    reposity.addConverterFrom(short.class, short[].class, Shorton::toArray);

    reposity.addConverterFrom(void.class, void.class, Objecton::identity);
    reposity.addConverterFrom(void.class, Void.class, Objecton::identity);

    reposity.addConverterFrom(Boolean.class, Boolean.class, Objecton::identity);
    reposity.addConverterFrom(Boolean.class, boolean.class, BoxedBooleanton::toBoolean);
    reposity.addConverterFrom(Boolean.class, Boolean[].class, BoxedBooleanton::toArray);

    reposity.addConverterFrom(Byte.class, byte.class, BoxedByteton::toByte);
    reposity.addConverterFrom(Byte.class, double.class, BoxedByteton::toDouble);
    reposity.addConverterFrom(Byte.class, float.class, BoxedByteton::toFloat);
    reposity.addConverterFrom(Byte.class, int.class, BoxedByteton::toInt);
    reposity.addConverterFrom(Byte.class, long.class, BoxedByteton::toLong);
    reposity.addConverterFrom(Byte.class, short.class, BoxedByteton::toShort);
    reposity.addConverterFrom(Byte.class, Byte.class, BoxedByteton::toBoxedByte);
    reposity.addConverterFrom(Byte.class, Double.class, BoxedByteton::toBoxedDouble);
    reposity.addConverterFrom(Byte.class, Float.class, BoxedByteton::toBoxedFloat);
    reposity.addConverterFrom(Byte.class, Integer.class, BoxedByteton::toBoxedInteger);
    reposity.addConverterFrom(Byte.class, Long.class, BoxedByteton::toBoxedLong);
    reposity.addConverterFrom(Byte.class, Short.class, BoxedByteton::toBoxedShort);
    reposity.addConverterFrom(Byte.class, Byte[].class, BoxedByteton::toArray);

    reposity.addConverterFrom(Character.class, Character.class, Objecton::identity);
    reposity.addConverterFrom(Character.class, char.class, BoxedCharacterton::toChar);
    reposity.addConverterFrom(Character.class, Character[].class, BoxedCharacterton::toArray);

    reposity.addConverterFrom(Double.class, byte.class, BoxedDoubleton::toByte);
    reposity.addConverterFrom(Double.class, double.class, BoxedDoubleton::toDouble);
    reposity.addConverterFrom(Double.class, float.class, BoxedDoubleton::toFloat);
    reposity.addConverterFrom(Double.class, int.class, BoxedDoubleton::toInt);
    reposity.addConverterFrom(Double.class, long.class, BoxedDoubleton::toLong);
    reposity.addConverterFrom(Double.class, short.class, BoxedDoubleton::toShort);
    reposity.addConverterFrom(Double.class, Byte.class, BoxedDoubleton::toBoxedByte);
    reposity.addConverterFrom(Double.class, Double.class, BoxedDoubleton::toBoxedDouble);
    reposity.addConverterFrom(Double.class, Float.class, BoxedDoubleton::toBoxedFloat);
    reposity.addConverterFrom(Double.class, Integer.class, BoxedDoubleton::toBoxedInteger);
    reposity.addConverterFrom(Double.class, Long.class, BoxedDoubleton::toBoxedLong);
    reposity.addConverterFrom(Double.class, Short.class, BoxedDoubleton::toBoxedShort);
    reposity.addConverterFrom(Double.class, Double[].class, BoxedDoubleton::toArray);

    reposity.addConverterFrom(Float.class, byte.class, BoxedFloaton::toByte);
    reposity.addConverterFrom(Float.class, double.class, BoxedFloaton::toDouble);
    reposity.addConverterFrom(Float.class, float.class, BoxedFloaton::toFloat);
    reposity.addConverterFrom(Float.class, int.class, BoxedFloaton::toInt);
    reposity.addConverterFrom(Float.class, long.class, BoxedFloaton::toLong);
    reposity.addConverterFrom(Float.class, short.class, BoxedFloaton::toShort);
    reposity.addConverterFrom(Float.class, Byte.class, BoxedFloaton::toBoxedByte);
    reposity.addConverterFrom(Float.class, Double.class, BoxedFloaton::toBoxedDouble);
    reposity.addConverterFrom(Float.class, Float.class, BoxedFloaton::toBoxedFloat);
    reposity.addConverterFrom(Float.class, Integer.class, BoxedFloaton::toBoxedInteger);
    reposity.addConverterFrom(Float.class, Long.class, BoxedFloaton::toBoxedLong);
    reposity.addConverterFrom(Float.class, Short.class, BoxedFloaton::toBoxedShort);
    reposity.addConverterFrom(Float.class, Float[].class, BoxedFloaton::toArray);

    reposity.addConverterFrom(Integer.class, byte.class, BoxedIntegerton::toByte);
    reposity.addConverterFrom(Integer.class, double.class, BoxedIntegerton::toDouble);
    reposity.addConverterFrom(Integer.class, float.class, BoxedIntegerton::toFloat);
    reposity.addConverterFrom(Integer.class, int.class, BoxedIntegerton::toInt);
    reposity.addConverterFrom(Integer.class, long.class, BoxedIntegerton::toLong);
    reposity.addConverterFrom(Integer.class, short.class, BoxedIntegerton::toShort);
    reposity.addConverterFrom(Integer.class, Byte.class, BoxedIntegerton::toBoxedByte);
    reposity.addConverterFrom(Integer.class, Double.class, BoxedIntegerton::toBoxedDouble);
    reposity.addConverterFrom(Integer.class, Float.class, BoxedIntegerton::toBoxedFloat);
    reposity.addConverterFrom(Integer.class, Integer.class, BoxedIntegerton::toBoxedInteger);
    reposity.addConverterFrom(Integer.class, Long.class, BoxedIntegerton::toBoxedLong);
    reposity.addConverterFrom(Integer.class, Short.class, BoxedIntegerton::toBoxedShort);
    reposity.addConverterFrom(Integer.class, Integer[].class, BoxedIntegerton::toArray);

    reposity.addConverterFrom(Long.class, byte.class, BoxedLongton::toByte);
    reposity.addConverterFrom(Long.class, double.class, BoxedLongton::toDouble);
    reposity.addConverterFrom(Long.class, float.class, BoxedLongton::toFloat);
    reposity.addConverterFrom(Long.class, int.class, BoxedLongton::toInt);
    reposity.addConverterFrom(Long.class, long.class, BoxedLongton::toLong);
    reposity.addConverterFrom(Long.class, short.class, BoxedLongton::toShort);
    reposity.addConverterFrom(Long.class, Byte.class, BoxedLongton::toBoxedByte);
    reposity.addConverterFrom(Long.class, Double.class, BoxedLongton::toBoxedDouble);
    reposity.addConverterFrom(Long.class, Float.class, BoxedLongton::toBoxedFloat);
    reposity.addConverterFrom(Long.class, Integer.class, BoxedLongton::toBoxedInteger);
    reposity.addConverterFrom(Long.class, Long.class, BoxedLongton::toBoxedLong);
    reposity.addConverterFrom(Long.class, Short.class, BoxedLongton::toBoxedShort);
    reposity.addConverterFrom(Long.class, Long[].class, BoxedLongton::toArray);

    reposity.addConverterFrom(Object.class, Object.class, Objecton::identity);
    reposity.addConverterFrom(Object.class, Object[].class, Objecton::toArray);

    reposity.addConverterFrom(Void.class, Void.class, Objecton::identity);
    reposity.addConverterFrom(Void.class, void.class, Objecton::identity);

    reposity.addConverterFrom(Short.class, byte.class, BoxedShorton::toByte);
    reposity.addConverterFrom(Short.class, double.class, BoxedShorton::toDouble);
    reposity.addConverterFrom(Short.class, float.class, BoxedShorton::toFloat);
    reposity.addConverterFrom(Short.class, int.class, BoxedShorton::toInt);
    reposity.addConverterFrom(Short.class, long.class, BoxedShorton::toLong);
    reposity.addConverterFrom(Short.class, short.class, BoxedShorton::toShort);
    reposity.addConverterFrom(Short.class, Byte.class, BoxedShorton::toBoxedByte);
    reposity.addConverterFrom(Short.class, Double.class, BoxedShorton::toBoxedDouble);
    reposity.addConverterFrom(Short.class, Float.class, BoxedShorton::toBoxedFloat);
    reposity.addConverterFrom(Short.class, Integer.class, BoxedShorton::toBoxedInteger);
    reposity.addConverterFrom(Short.class, Long.class, BoxedShorton::toBoxedLong);
    reposity.addConverterFrom(Short.class, Short.class, BoxedShorton::toBoxedShort);
    reposity.addConverterFrom(Short.class, Short[].class, BoxedShorton::toArray);

    reposity.addConverterFrom(String.class, String.class, Objecton::identity);
    reposity.addConverterFrom(String.class, String[].class, Strington::toArray);

    reposity.addConverterFrom(boolean[].class, boolean[].class, Objecton::identity);
    reposity.addConverterFrom(byte[].class, byte[].class, Objecton::identity);
    reposity.addConverterFrom(char[].class, char[].class, Objecton::identity);
    reposity.addConverterFrom(double[].class, double[].class, Objecton::identity);
    reposity.addConverterFrom(float[].class, float[].class, Objecton::identity);
    reposity.addConverterFrom(int[].class, int[].class, Objecton::identity);
    reposity.addConverterFrom(long[].class, long[].class, Objecton::identity);
    reposity.addConverterFrom(short[].class, short[].class, Objecton::identity);

    reposity.addConverterFrom(String[].class, String[].class, Objecton::identity);
    reposity.addConverterFrom(Object[].class, Object[].class, Objecton::identity);
    reposity.addConverterFrom(Boolean[].class, Boolean[].class, Objecton::identity);
    reposity.addConverterFrom(Byte[].class, Byte[].class, Objecton::identity);
    reposity.addConverterFrom(Character[].class, Character[].class, Objecton::identity);
    reposity.addConverterFrom(Double[].class, Double[].class, Objecton::identity);
    reposity.addConverterFrom(Float[].class, Float[].class, Objecton::identity);
    reposity.addConverterFrom(Integer[].class, Integer[].class, Objecton::identity);
    reposity.addConverterFrom(Long[].class, Long[].class, Objecton::identity);
    reposity.addConverterFrom(Short[].class, Short[].class, Objecton::identity);
  }

  public static FunctionRepositoryInitializer create() {
    FunctionRepositoryInitializer initializer = new FunctionRepositoryInitializer();
    return initializer;
  }

}
