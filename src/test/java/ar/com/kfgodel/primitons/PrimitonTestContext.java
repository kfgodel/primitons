package ar.com.kfgodel.primitons;

import ar.com.dgarcia.javaspec.api.contexts.TestContext;
import ar.com.kfgodel.function.arrays.booleans.arrays.ArrayOfBooleanToArrayOfBooleanFunction;
import ar.com.kfgodel.function.arrays.boxed.booleans.boxed.ArrayOfBoxedBooleanToBoxedBooleanFunction;
import ar.com.kfgodel.function.arrays.boxed.bytes.boxed.ArrayOfBoxedByteToBoxedByteFunction;
import ar.com.kfgodel.function.arrays.boxed.chars.boxed.ArrayOfBoxedCharacterToBoxedCharacterFunction;
import ar.com.kfgodel.function.arrays.boxed.doubles.boxed.ArrayOfBoxedDoubleToBoxedDoubleFunction;
import ar.com.kfgodel.function.arrays.boxed.floats.boxed.ArrayOfBoxedFloatToBoxedFloatFunction;
import ar.com.kfgodel.function.arrays.boxed.ints.boxed.ArrayOfBoxedIntegerToBoxedIntegerFunction;
import ar.com.kfgodel.function.arrays.boxed.longs.boxed.ArrayOfBoxedLongToBoxedLongFunction;
import ar.com.kfgodel.function.arrays.boxed.shorts.boxed.ArrayOfBoxedShortToBoxedShortFunction;
import ar.com.kfgodel.function.arrays.boxed.strings.boxed.ArrayOfStringToStringFunction;
import ar.com.kfgodel.function.arrays.bytes.arrays.ArrayOfByteToArrayOfByteFunction;
import ar.com.kfgodel.function.arrays.chars.arrays.ArrayOfCharToArrayOfCharFunction;
import ar.com.kfgodel.function.arrays.doubles.arrays.ArrayOfDoubleToArrayOfDoubleFunction;
import ar.com.kfgodel.function.arrays.floats.ArrayOfFloatToFloatFunction;
import ar.com.kfgodel.function.arrays.ints.arrays.ArrayOfIntToArrayOfIntFunction;
import ar.com.kfgodel.function.arrays.longs.arrays.ArrayOfLongToArrayOfLongFunction;
import ar.com.kfgodel.function.arrays.objects.ArrayOfObjectToObjectFunction;
import ar.com.kfgodel.function.arrays.shorts.arrays.ArrayOfShortToArrayOfShortFunction;
import ar.com.kfgodel.function.booleans.BooleanToBooleanFunction;
import ar.com.kfgodel.function.booleans.arrays.BooleanToArrayOfBooleanFunction;
import ar.com.kfgodel.function.booleans.boxed.BooleanToBoxedBooleanFunction;
import ar.com.kfgodel.function.boxed.booleans.BoxedBooleanToBooleanFunction;
import ar.com.kfgodel.function.boxed.booleans.boxed.BoxedBooleanToBoxedBooleanFunction;
import ar.com.kfgodel.function.boxed.bytes.*;
import ar.com.kfgodel.function.boxed.bytes.boxed.*;
import ar.com.kfgodel.function.boxed.chars.BoxedCharacterToCharFunction;
import ar.com.kfgodel.function.boxed.chars.boxed.BoxedCharacterToBoxedCharacterFunction;
import ar.com.kfgodel.function.boxed.doubles.*;
import ar.com.kfgodel.function.boxed.doubles.boxed.*;
import ar.com.kfgodel.function.boxed.floats.*;
import ar.com.kfgodel.function.boxed.floats.boxed.*;
import ar.com.kfgodel.function.boxed.ints.*;
import ar.com.kfgodel.function.boxed.ints.boxed.*;
import ar.com.kfgodel.function.boxed.longs.*;
import ar.com.kfgodel.function.boxed.longs.boxed.*;
import ar.com.kfgodel.function.boxed.shorts.*;
import ar.com.kfgodel.function.boxed.shorts.boxed.*;
import ar.com.kfgodel.function.boxed.strings.boxed.StringToStringFunction;
import ar.com.kfgodel.function.bytes.*;
import ar.com.kfgodel.function.bytes.arrays.ByteToArrayOfByteFunction;
import ar.com.kfgodel.function.bytes.boxed.*;
import ar.com.kfgodel.function.chars.CharToCharFunction;
import ar.com.kfgodel.function.chars.arrays.CharToArrayOfCharFunction;
import ar.com.kfgodel.function.chars.boxed.CharToBoxedCharacterFunction;
import ar.com.kfgodel.function.doubles.*;
import ar.com.kfgodel.function.doubles.arrays.DoubleToArrayOfDoubleFunction;
import ar.com.kfgodel.function.doubles.boxed.*;
import ar.com.kfgodel.function.floats.*;
import ar.com.kfgodel.function.floats.boxed.*;
import ar.com.kfgodel.function.ints.*;
import ar.com.kfgodel.function.ints.boxed.*;
import ar.com.kfgodel.function.longs.*;
import ar.com.kfgodel.function.longs.boxed.*;
import ar.com.kfgodel.function.objects.ObjectToObjectFunction;
import ar.com.kfgodel.function.shorts.*;
import ar.com.kfgodel.function.shorts.boxed.*;
import ar.com.kfgodel.primitons.api.repositories.FunctionReposity;
import ar.com.kfgodel.primitons.api.repositories.TypeRepository;

import java.util.function.Supplier;

/**
 * This type defines the variables used for sharing test context
 * Created by kfgodel on 03/07/17.
 */
public interface PrimitonTestContext extends TestContext {

  BooleanToBooleanFunction boolean2boolean();
  void boolean2boolean(Supplier<BooleanToBooleanFunction> definition);

  BoxedBooleanToBoxedBooleanFunction boxedBoolean2boxedBoolean();
  void boxedBoolean2boxedBoolean(Supplier<BoxedBooleanToBoxedBooleanFunction> definition);

  BoxedByteToBoxedByteFunction boxedByte2boxedByte();
  void boxedByte2boxedByte(Supplier<BoxedByteToBoxedByteFunction> definition);

  BoxedCharacterToBoxedCharacterFunction boxedByte2BoxedByte();
  void boxedByte2BoxedByte(Supplier<BoxedCharacterToBoxedCharacterFunction> definition);

  BoxedDoubleToBoxedDoubleFunction boxedDouble2boxedDouble();
  void boxedDouble2boxedDouble(Supplier<BoxedDoubleToBoxedDoubleFunction> definition);

  BoxedFloatToBoxedFloatFunction boxedFloat2boxedFloat();
  void boxedFloat2boxedFloat(Supplier<BoxedFloatToBoxedFloatFunction> definition);

  BoxedIntegerToBoxedIntegerFunction boxedInteger2boxedInteger();
  void boxedInteger2boxedInteger(Supplier<BoxedIntegerToBoxedIntegerFunction> definition);

  BoxedLongToBoxedLongFunction boxedLong2boxedLong();
  void boxedLong2boxedLong(Supplier<BoxedLongToBoxedLongFunction> definition);

  BoxedShortToBoxedShortFunction boxedShort2boxedShort();
  void boxedShort2boxedShort(Supplier<BoxedShortToBoxedShortFunction> definition);

  ByteToByteFunction byte2byte();
  void byte2byte(Supplier<ByteToByteFunction> definition);

  CharToCharFunction char2char();
  void char2char(Supplier<CharToCharFunction> definition);

  DoubleToDoubleFunction double2double();
  void double2double(Supplier<DoubleToDoubleFunction> definition);

  FloatToFloatFunction float2float();
  void float2float(Supplier<FloatToFloatFunction> definition);

  IntToIntFunction int2int();
  void int2int(Supplier<IntToIntFunction> definition);

  LongToLongFunction long2long();
  void long2long(Supplier<LongToLongFunction> definition);

  ShortToShortFunction short2short();
  void short2short(Supplier<ShortToShortFunction> definition);

  StringToStringFunction string2String();
  void string2String(Supplier<StringToStringFunction> definition);

  ObjectToObjectFunction object2Object();
  void object2Object(Supplier<ObjectToObjectFunction> definition);

  ArrayOfBooleanToArrayOfBooleanFunction booleanArray2BooleanArray();
  void booleanArray2BooleanArray(Supplier<ArrayOfBooleanToArrayOfBooleanFunction> definition);

  ArrayOfByteToArrayOfByteFunction byteArray2ByteArray();
  void byteArray2ByteArray(Supplier<ArrayOfByteToArrayOfByteFunction> definition);

  ArrayOfCharToArrayOfCharFunction charArray2CharArray();
  void charArray2CharArray(Supplier<ArrayOfCharToArrayOfCharFunction> definition);

  ArrayOfDoubleToArrayOfDoubleFunction doubleArray2DoubleArray();
  void doubleArray2DoubleArray(Supplier<ArrayOfDoubleToArrayOfDoubleFunction> definition);

  ArrayOfFloatToFloatFunction floatArray2FloatArray();
  void floatArray2FloatArray(Supplier<ArrayOfFloatToFloatFunction> definition);

  ArrayOfIntToArrayOfIntFunction intArray2IntArray();
  void intArray2IntArray(Supplier<ArrayOfIntToArrayOfIntFunction> definition);

  ArrayOfLongToArrayOfLongFunction longArray2LongArray();
  void longArray2LongArray(Supplier<ArrayOfLongToArrayOfLongFunction> definition);

  ArrayOfShortToArrayOfShortFunction shortArray2ShortArray();
  void shortArray2ShortArray(Supplier<ArrayOfShortToArrayOfShortFunction> definition);

  ArrayOfStringToStringFunction stringArray2StringArray();
  void stringArray2StringArray(Supplier<ArrayOfStringToStringFunction> definition);

  ArrayOfObjectToObjectFunction objectArray2ObjectArray();
  void objectArray2ObjectArray(Supplier<ArrayOfObjectToObjectFunction> definition);

  ArrayOfBoxedBooleanToBoxedBooleanFunction boxedBooleanArray2boxedBooleanArray();
  void boxedBooleanArray2boxedBooleanArray(Supplier<ArrayOfBoxedBooleanToBoxedBooleanFunction> definition);

  ArrayOfBoxedByteToBoxedByteFunction boxedByteArray2boxedByteArray();
  void boxedByteArray2boxedByteArray(Supplier<ArrayOfBoxedByteToBoxedByteFunction> definition);

  ArrayOfBoxedCharacterToBoxedCharacterFunction boxedCharacterArray2boxedCharacterArray();
  void boxedCharacterArray2boxedCharacterArray(Supplier<ArrayOfBoxedCharacterToBoxedCharacterFunction> definition);

  ArrayOfBoxedDoubleToBoxedDoubleFunction boxedDoubleArray2boxedDoubleArray();
  void boxedDoubleArray2boxedDoubleArray(Supplier<ArrayOfBoxedDoubleToBoxedDoubleFunction> definition);

  ArrayOfBoxedFloatToBoxedFloatFunction boxedFloatArray2boxedFloatArray();
  void boxedFloatArray2boxedFloatArray(Supplier<ArrayOfBoxedFloatToBoxedFloatFunction> definition);

  ArrayOfBoxedIntegerToBoxedIntegerFunction boxedIntegerArray2boxedIntegerArray();
  void boxedIntegerArray2boxedIntegerArray(Supplier<ArrayOfBoxedIntegerToBoxedIntegerFunction> definition);

  ArrayOfBoxedLongToBoxedLongFunction boxedLongArray2boxedLongArray();
  void boxedLongArray2boxedLongArray(Supplier<ArrayOfBoxedLongToBoxedLongFunction> definition);

  ArrayOfBoxedShortToBoxedShortFunction boxedShortArray2boxedShortArray();
  void boxedShortArray2boxedShortArray(Supplier<ArrayOfBoxedShortToBoxedShortFunction> definition);


  Boolean booleanInput();
  void booleanInput(Supplier<Boolean> definition);

  Byte byteInput();
  void byteInput(Supplier<Byte> definition);

  Character charInput();
  void charInput(Supplier<Character> definition);

  Double doubleInput();
  void doubleInput(Supplier<Double> definition);

  Float floatInput();
  void floatInput(Supplier<Float> definition);

  Integer intInput();
  void intInput(Supplier<Integer> definition);

  Long longInput();
  void longInput(Supplier<Long> definition);

  Short shortInput();
  void shortInput(Supplier<Short> definition);

  String stringInput();
  void stringInput(Supplier<String> definition);

  Object objectInput();
  void objectInput(Supplier<Object> definition);

  boolean[] booleanArrayInput();
  void booleanArrayInput(Supplier<boolean[]> definition);

  byte[] byteArrayInput();
  void byteArrayInput(Supplier<byte[]> definition);

  char[] charArrayInput();
  void charArrayInput(Supplier<char[]> definition);

  double[] doubleArrayInput();
  void doubleArrayInput(Supplier<double[]> definition);

  float[] floatArrayInput();
  void floatArrayInput(Supplier<float[]> definition);

  int[] intArrayInput();
  void intArrayInput(Supplier<int[]> definition);

  long[] longArrayInput();
  void longArrayInput(Supplier<long[]> definition);

  short[] shortArrayInput();
  void shortArrayInput(Supplier<short[]> definition);

  String[] stringArrayInput();
  void stringArrayInput(Supplier<String[]> definition);

  Object[] objectArrayInput();
  void objectArrayInput(Supplier<Object[]> definition);

  Boolean[] boxedBooleanArrayInput();
  void boxedBooleanArrayInput(Supplier<Boolean[]> definition);

  Byte[] boxedByteArrayInput();
  void boxedByteArrayInput(Supplier<Byte[]> definition);

  Character[] boxedCharacterArrayInput();
  void boxedCharacterArrayInput(Supplier<Character[]> definition);

  Double[] boxedDoubleArrayInput();
  void boxedDoubleArrayInput(Supplier<Double[]> definition);

  Float[] boxedFloatArrayInput();
  void boxedFloatArrayInput(Supplier<Float[]> definition);

  Integer[] boxedintegerArrayInput();
  void boxedintegerArrayInput(Supplier<Integer[]> definition);

  Long[] boxedLongArrayInput();
  void boxedLongArrayInput(Supplier<Long[]> definition);

  Short[] boxedShortArrayInput();
  void boxedShortArrayInput(Supplier<Short[]> definition);

  Boolean booleanOutput();
  void booleanOutput(Supplier<Boolean> definition);

  Byte byteOutput();
  void byteOutput(Supplier<Byte> definition);

  Character charOutput();
  void charOutput(Supplier<Character> definition);

  Double doubleOutput();
  void doubleOutput(Supplier<Double> definition);

  Float floatOutput();
  void floatOutput(Supplier<Float> definition);

  Integer intOutput();
  void intOutput(Supplier<Integer> definition);

  Long longOutput();
  void longOutput(Supplier<Long> definition);

  Short shortOutput();
  void shortOutput(Supplier<Short> definition);

  String stringOutput();
  void stringOutput(Supplier<String> definition);

  Object objectOutput();
  void objectOutput(Supplier<Object> definition);

  boolean[] booleanArrayOutput();
  void booleanArrayOutput(Supplier<boolean[]> definition);

  byte[] byteArrayOutput();
  void byteArrayOutput(Supplier<byte[]> definition);

  char[] charArrayOutput();
  void charArrayOutput(Supplier<char[]> definition);

  double[] doubleArrayOutput();
  void doubleArrayOutput(Supplier<double[]> definition);

  float[] floatArrayOutput();
  void floatArrayOutput(Supplier<float[]> definition);

  int[] intArrayOutput();
  void intArrayOutput(Supplier<int[]> definition);

  long[] longArrayOutput();
  void longArrayOutput(Supplier<long[]> definition);

  short[] shortArrayOutput();
  void shortArrayOutput(Supplier<short[]> definition);

  String[] stringArrayOutput();
  void stringArrayOutput(Supplier<String[]> definition);

  Object[] objectArrayOutput();
  void objectArrayOutput(Supplier<Object[]> definition);

  Boolean[] boxedBooleanArrayOutput();
  void boxedBooleanArrayOutput(Supplier<Boolean[]> definition);

  Byte[] boxedByteArrayOutput();
  void boxedByteArrayOutput(Supplier<Byte[]> definition);

  Character[] boxedCharacterArrayOutput();
  void boxedCharacterArrayOutput(Supplier<Character[]> definition);

  Double[] boxedDoubleArrayOutput();
  void boxedDoubleArrayOutput(Supplier<Double[]> definition);

  Float[] boxedFloatArrayOutput();
  void boxedFloatArrayOutput(Supplier<Float[]> definition);

  Integer[] boxedintegerArrayOutput();
  void boxedintegerArrayOutput(Supplier<Integer[]> definition);

  Long[] boxedLongArrayOutput();
  void boxedLongArrayOutput(Supplier<Long[]> definition);

  Short[] boxedShortArrayOutput();
  void boxedShortArrayOutput(Supplier<Short[]> definition);

  ByteToFloatFunction byte2float();
  void byte2float(Supplier<ByteToFloatFunction> definition);

  ByteToDoubleFunction byte2double();
  void byte2double(Supplier<ByteToDoubleFunction> definition);

  ByteToIntFunction byte2int();
  void byte2int(Supplier<ByteToIntFunction> definition);

  ByteToLongFunction byte2long();
  void byte2long(Supplier<ByteToLongFunction> definition);

  ByteToShortFunction byte2short();
  void byte2short(Supplier<ByteToShortFunction> definition);

  DoubleToByteFunction double2byte();
  void double2byte(Supplier<DoubleToByteFunction> definition);

  DoubleToFloatFunction double2float();
  void double2float(Supplier<DoubleToFloatFunction> definition);

  DoubleToIntFunction double2int();
  void double2int(Supplier<DoubleToIntFunction> definition);

  DoubleToLongFunction double2long();
  void double2long(Supplier<DoubleToLongFunction> definition);

  DoubleToShortFunction double2short();
  void double2short(Supplier<DoubleToShortFunction> definition);

  FloatToByteFunction float2byte();
  void float2byte(Supplier<FloatToByteFunction> definition);

  FloatToDoubleFunction float2double();
  void float2double(Supplier<FloatToDoubleFunction> definition);

  FloatToIntFunction float2int();
  void float2int(Supplier<FloatToIntFunction> definition);

  FloatToLongFunction float2long();
  void float2long(Supplier<FloatToLongFunction> definition);

  FloatToShortFunction float2short();
  void float2short(Supplier<FloatToShortFunction> definition);

  IntToByteFunction int2byte();
  void int2byte(Supplier<IntToByteFunction> definition);

  IntToFloatFunction int2float();
  void int2float(Supplier<IntToFloatFunction> definition);

  IntToDoubleFunction int2double();
  void int2double(Supplier<IntToDoubleFunction> definition);

  IntToLongFunction int2Long();
  void int2Long(Supplier<IntToLongFunction> definition);

  IntToShortFunction int2short();
  void int2short(Supplier<IntToShortFunction> definition);

  LongToByteFunction long2byte();
  void long2byte(Supplier<LongToByteFunction> definition);

  LongToDoubleFunction long2double();
  void long2double(Supplier<LongToDoubleFunction> definition);

  LongToFloatFunction long2float();
  void long2float(Supplier<LongToFloatFunction> definition);

  LongToIntFunction long2int();
  void long2int(Supplier<LongToIntFunction> definition);

  LongToShortFunction long2short();
  void long2short(Supplier<LongToShortFunction> definition);

  ShortToByteFunction short2byte();
  void short2byte(Supplier<ShortToByteFunction> definition);

  ShortToDoubleFunction short2double();
  void short2double(Supplier<ShortToDoubleFunction> definition);

  ShortToFloatFunction short2float();
  void short2float(Supplier<ShortToFloatFunction> definition);

  ShortToIntFunction short2int();
  void short2int(Supplier<ShortToIntFunction> definition);

  ShortToLongFunction short2long();
  void short2long(Supplier<ShortToLongFunction> definition);


  BooleanToBoxedBooleanFunction boolean2boxedBoolean();
  void boolean2boxedBoolean(Supplier<BooleanToBoxedBooleanFunction> definition);

  ByteToBoxedByteFunction byte2boxedByte();
  void byte2boxedByte(Supplier<ByteToBoxedByteFunction> definition);

  CharToBoxedCharacterFunction char2boxedCharacter();
  void char2boxedCharacter(Supplier<CharToBoxedCharacterFunction> definition);

  DoubleToBoxedDoubleFunction double2boxedDouble();
  void double2boxedDouble(Supplier<DoubleToBoxedDoubleFunction> definition);

  FloatToBoxedFloatFunction float2boxedFloat();
  void float2boxedFloat(Supplier<FloatToBoxedFloatFunction> definition);

  IntToBoxedIntegerFunction int2boxedInteger();
  void int2boxedInteger(Supplier<IntToBoxedIntegerFunction> definition);

  LongToBoxedLongFunction long2boxedLong();
  void long2boxedLong(Supplier<LongToBoxedLongFunction> definition);

  ShortToBoxedShortFunction short2boxedShort();
  void short2boxedShort(Supplier<ShortToBoxedShortFunction> definition);

  BoxedBooleanToBooleanFunction boxedBoolean2Boolean();
  void boxedBoolean2Boolean(Supplier<BoxedBooleanToBooleanFunction> definition);

  BoxedByteToByteFunction boxedByte2Byte();
  void boxedByte2Byte(Supplier<BoxedByteToByteFunction> definition);

  BoxedByteToDoubleFunction boxedByte2Double();
  void boxedByte2Double(Supplier<BoxedByteToDoubleFunction> definition);

  BoxedByteToFloatFunction boxedByte2Float();
  void boxedByte2Float(Supplier<BoxedByteToFloatFunction> definition);

  BoxedByteToIntFunction boxedByte2Int();
  void boxedByte2Int(Supplier<BoxedByteToIntFunction> definition);

  BoxedByteToLongFunction boxedByte2Long();
  void boxedByte2Long(Supplier<BoxedByteToLongFunction> definition);

  BoxedByteToShortFunction boxedByte2Short();
  void boxedByte2Short(Supplier<BoxedByteToShortFunction> definition);

  BoxedCharacterToCharFunction boxedCharacter2Char();
  void boxedCharacter2Char(Supplier<BoxedCharacterToCharFunction> definition);

  BoxedDoubleToByteFunction boxedDouble2Byte();
  void boxedDouble2Byte(Supplier<BoxedDoubleToByteFunction> definition);

  BoxedDoubleToDoubleFunction boxedDouble2Double();
  void boxedDouble2Double(Supplier<BoxedDoubleToDoubleFunction> definition);

  BoxedDoubleToFloatFunction boxedDouble2Float();
  void boxedDouble2Float(Supplier<BoxedDoubleToFloatFunction> definition);

  BoxedDoubleToIntFunction boxedDouble2Int();
  void boxedDouble2Int(Supplier<BoxedDoubleToIntFunction> definition);

  BoxedDoubleToLongFunction boxedDouble2Long();
  void boxedDouble2Long(Supplier<BoxedDoubleToLongFunction> definition);

  BoxedDoubleToShortFunction boxedDouble2Short();
  void boxedDouble2Short(Supplier<BoxedDoubleToShortFunction> definition);

  BoxedFloatToByteFunction boxedFloat2Byte();
  void boxedFloat2Byte(Supplier<BoxedFloatToByteFunction> definition);

  BoxedFloatToDoubleFunction boxedFloat2Double();
  void boxedFloat2Double(Supplier<BoxedFloatToDoubleFunction> definition);

  BoxedFloatToFloatFunction boxedFloat2Float();
  void boxedFloat2Float(Supplier<BoxedFloatToFloatFunction> definition);

  BoxedFloatToIntFunction boxedFloat2Int();
  void boxedFloat2Int(Supplier<BoxedFloatToIntFunction> definition);

  BoxedFloatToLongFunction boxedFloat2Long();
  void boxedFloat2Long(Supplier<BoxedFloatToLongFunction> definition);

  BoxedFloatToShortFunction boxedFloat2Short();
  void boxedFloat2Short(Supplier<BoxedFloatToShortFunction> definition);

  BoxedIntegerToByteFunction boxedInteger2Byte();
  void boxedInteger2Byte(Supplier<BoxedIntegerToByteFunction> definition);

  BoxedIntegerToDoubleFunction boxedInteger2Double();
  void boxedInteger2Double(Supplier<BoxedIntegerToDoubleFunction> definition);

  BoxedIntegerToFloatFunction boxedInteger2Float();
  void boxedInteger2Float(Supplier<BoxedIntegerToFloatFunction> definition);

  BoxedIntegerToIntFunction boxedInteger2Int();
  void boxedInteger2Int(Supplier<BoxedIntegerToIntFunction> definition);

  BoxedIntegerToLongFunction boxedInteger2Long();
  void boxedInteger2Long(Supplier<BoxedIntegerToLongFunction> definition);

  BoxedIntegerToShortFunction boxedInteger2Short();
  void boxedInteger2Short(Supplier<BoxedIntegerToShortFunction> definition);

  BoxedLongToByteFunction boxedLong2Byte();
  void boxedLong2Byte(Supplier<BoxedLongToByteFunction> definition);

  BoxedLongToDoubleFunction boxedLong2Double();
  void boxedLong2Double(Supplier<BoxedLongToDoubleFunction> definition);

  BoxedLongToFloatFunction boxedLong2Float();
  void boxedLong2Float(Supplier<BoxedLongToFloatFunction> definition);

  BoxedLongToIntFunction boxedLong2Int();
  void boxedLong2Int(Supplier<BoxedLongToIntFunction> definition);

  BoxedLongToLongFunction boxedLong2Long();
  void boxedLong2Long(Supplier<BoxedLongToLongFunction> definition);

  BoxedLongToShortFunction boxedLong2Short();
  void boxedLong2Short(Supplier<BoxedLongToShortFunction> definition);

  BoxedShortToByteFunction boxedShort2Byte();
  void boxedShort2Byte(Supplier<BoxedShortToByteFunction> definition);

  BoxedShortToDoubleFunction boxedShort2Double();
  void boxedShort2Double(Supplier<BoxedShortToDoubleFunction> definition);

  BoxedShortToFloatFunction boxedShort2Float();
  void boxedShort2Float(Supplier<BoxedShortToFloatFunction> definition);

  BoxedShortToIntFunction boxedShort2Int();
  void boxedShort2Int(Supplier<BoxedShortToIntFunction> definition);

  BoxedShortToLongFunction boxedShort2Long();
  void boxedShort2Long(Supplier<BoxedShortToLongFunction> definition);

  BoxedShortToShortFunction boxedShort2Short();
  void boxedShort2Short(Supplier<BoxedShortToShortFunction> definition);

  ByteToBoxedDoubleFunction byte2BoxedDouble();
  void byte2BoxedDouble(Supplier<ByteToBoxedDoubleFunction> definition);

  ByteToBoxedFloatFunction byte2BoxedFloat();
  void byte2BoxedFloat(Supplier<ByteToBoxedFloatFunction> definition);

  ByteToBoxedIntegerFunction byte2BoxedInteger();
  void byte2BoxedInteger(Supplier<ByteToBoxedIntegerFunction> definition);

  ByteToBoxedLongFunction byte2BoxedLong();
  void byte2BoxedLong(Supplier<ByteToBoxedLongFunction> definition);

  ByteToBoxedShortFunction byte2BoxedShort();
  void byte2BoxedShort(Supplier<ByteToBoxedShortFunction> definition);

  DoubleToBoxedByteFunction double2BoxedByte();
  void double2BoxedByte(Supplier<DoubleToBoxedByteFunction> definition);

  DoubleToBoxedFloatFunction double2BoxedFloat();
  void double2BoxedFloat(Supplier<DoubleToBoxedFloatFunction> definition);

  DoubleToBoxedIntegerFunction double2BoxedInteger();
  void double2BoxedInteger(Supplier<DoubleToBoxedIntegerFunction> definition);

  DoubleToBoxedLongFunction double2BoxedLong();
  void double2BoxedLong(Supplier<DoubleToBoxedLongFunction> definition);

  DoubleToBoxedShortFunction double2BoxedShort();
  void double2BoxedShort(Supplier<DoubleToBoxedShortFunction> definition);

  FloatToBoxedByteFunction float2BoxedByte();
  void float2BoxedByte(Supplier<FloatToBoxedByteFunction> definition);

  FloatToBoxedDoubleFunction float2BoxedDouble();
  void float2BoxedDouble(Supplier<FloatToBoxedDoubleFunction> definition);

  FloatToBoxedIntegerFunction float2BoxedInteger();
  void float2BoxedInteger(Supplier<FloatToBoxedIntegerFunction> definition);

  FloatToBoxedLongFunction float2BoxedLong();
  void float2BoxedLong(Supplier<FloatToBoxedLongFunction> definition);

  FloatToBoxedShortFunction float2BoxedShort();
  void float2BoxedShort(Supplier<FloatToBoxedShortFunction> definition);

  IntToBoxedByteFunction int2BoxedByte();
  void int2BoxedByte(Supplier<IntToBoxedByteFunction> definition);

  IntToBoxedDoubleFunction int2BoxedDouble();
  void int2BoxedDouble(Supplier<IntToBoxedDoubleFunction> definition);

  IntToBoxedFloatFunction int2BoxedFloat();
  void int2BoxedFloat(Supplier<IntToBoxedFloatFunction> definition);

  IntToBoxedLongFunction int2BoxedLong();
  void int2BoxedLong(Supplier<IntToBoxedLongFunction> definition);

  IntToBoxedShortFunction int2BoxedShort();
  void int2BoxedShort(Supplier<IntToBoxedShortFunction> definition);

  LongToBoxedByteFunction long2BoxedByte();
  void long2BoxedByte(Supplier<LongToBoxedByteFunction> definition);

  LongToBoxedDoubleFunction long2BoxedDouble();
  void long2BoxedDouble(Supplier<LongToBoxedDoubleFunction> definition);

  LongToBoxedFloatFunction long2BoxedFloat();
  void long2BoxedFloat(Supplier<LongToBoxedFloatFunction> definition);

  LongToBoxedIntegerFunction long2BoxedInteger();
  void long2BoxedInteger(Supplier<LongToBoxedIntegerFunction> definition);

  LongToBoxedShortFunction long2BoxedShort();
  void long2BoxedShort(Supplier<LongToBoxedShortFunction> definition);

  ShortToBoxedByteFunction short2BoxedByte();
  void short2BoxedByte(Supplier<ShortToBoxedByteFunction> definition);

  ShortToBoxedDoubleFunction short2BoxedDouble();
  void short2BoxedDouble(Supplier<ShortToBoxedDoubleFunction> definition);

  ShortToBoxedFloatFunction short2BoxedFloat();
  void short2BoxedFloat(Supplier<ShortToBoxedFloatFunction> definition);

  ShortToBoxedIntegerFunction short2BoxedInteger();
  void short2BoxedInteger(Supplier<ShortToBoxedIntegerFunction> definition);

  ShortToBoxedLongFunction short2BoxedLong();
  void short2BoxedLong(Supplier<ShortToBoxedLongFunction> definition);

  BoxedByteToBoxedDoubleFunction boxedByte2BoxedDouble();
  void boxedByte2BoxedDouble(Supplier<BoxedByteToBoxedDoubleFunction> definition);

  BoxedByteToBoxedFloatFunction boxedByte2BoxedFloat();
  void boxedByte2BoxedFloat(Supplier<BoxedByteToBoxedFloatFunction> definition);

  BoxedByteToBoxedIntegerFunction boxedByte2BoxedInteger();
  void boxedByte2BoxedInteger(Supplier<BoxedByteToBoxedIntegerFunction> definition);

  BoxedByteToBoxedLongFunction boxedByte2BoxedLong();
  void boxedByte2BoxedLong(Supplier<BoxedByteToBoxedLongFunction> definition);

  BoxedByteToBoxedShortFunction boxedByte2BoxedShort();
  void boxedByte2BoxedShort(Supplier<BoxedByteToBoxedShortFunction> definition);

  BoxedDoubleToBoxedByteFunction boxedDouble2BoxedByte();
  void boxedDouble2BoxedByte(Supplier<BoxedDoubleToBoxedByteFunction> definition);

  BoxedDoubleToBoxedFloatFunction boxedDouble2BoxedFloat();
  void boxedDouble2BoxedFloat(Supplier<BoxedDoubleToBoxedFloatFunction> definition);

  BoxedDoubleToBoxedIntegerFunction boxedDouble2BoxedInteger();
  void boxedDouble2BoxedInteger(Supplier<BoxedDoubleToBoxedIntegerFunction> definition);

  BoxedDoubleToBoxedLongFunction boxedDouble2BoxedLong();
  void boxedDouble2BoxedLong(Supplier<BoxedDoubleToBoxedLongFunction> definition);

  BoxedDoubleToBoxedShortFunction boxedDouble2BoxedShort();
  void boxedDouble2BoxedShort(Supplier<BoxedDoubleToBoxedShortFunction> definition);

  BoxedFloatToBoxedByteFunction boxedFloat2BoxedByte();
  void boxedFloat2BoxedByte(Supplier<BoxedFloatToBoxedByteFunction> definition);

  BoxedFloatToBoxedDoubleFunction boxedFloat2BoxedDouble();
  void boxedFloat2BoxedDouble(Supplier<BoxedFloatToBoxedDoubleFunction> definition);

  BoxedFloatToBoxedIntegerFunction boxedFloat2BoxedInteger();
  void boxedFloat2BoxedInteger(Supplier<BoxedFloatToBoxedIntegerFunction> definition);

  BoxedFloatToBoxedLongFunction boxedFloat2BoxedLong();
  void boxedFloat2BoxedLong(Supplier<BoxedFloatToBoxedLongFunction> definition);

  BoxedFloatToBoxedShortFunction boxedFloat2BoxedShort();
  void boxedFloat2BoxedShort(Supplier<BoxedFloatToBoxedShortFunction> definition);

  BoxedIntegerToBoxedByteFunction boxedInteger2BoxedByte();
  void boxedInteger2BoxedByte(Supplier<BoxedIntegerToBoxedByteFunction> definition);

  BoxedIntegerToBoxedDoubleFunction boxedInteger2BoxedDouble();
  void boxedInteger2BoxedDouble(Supplier<BoxedIntegerToBoxedDoubleFunction> definition);

  BoxedIntegerToBoxedFloatFunction boxedInteger2BoxedFloat();
  void boxedInteger2BoxedFloat(Supplier<BoxedIntegerToBoxedFloatFunction> definition);

  BoxedIntegerToBoxedLongFunction boxedInteger2BoxedLong();
  void boxedInteger2BoxedLong(Supplier<BoxedIntegerToBoxedLongFunction> definition);

  BoxedIntegerToBoxedShortFunction boxedInteger2BoxedShort();
  void boxedInteger2BoxedShort(Supplier<BoxedIntegerToBoxedShortFunction> definition);

  BoxedLongToBoxedByteFunction boxedLong2BoxedByte();
  void boxedLong2BoxedByte(Supplier<BoxedLongToBoxedByteFunction> definition);

  BoxedLongToBoxedDoubleFunction boxedLong2BoxedDouble();
  void boxedLong2BoxedDouble(Supplier<BoxedLongToBoxedDoubleFunction> definition);

  BoxedLongToBoxedFloatFunction boxedLong2BoxedFloat();
  void boxedLong2BoxedFloat(Supplier<BoxedLongToBoxedFloatFunction> definition);

  BoxedLongToBoxedIntegerFunction boxedLong2BoxedInteger();
  void boxedLong2BoxedInteger(Supplier<BoxedLongToBoxedIntegerFunction> definition);

  BoxedLongToBoxedShortFunction boxedLong2BoxedShort();
  void boxedLong2BoxedShort(Supplier<BoxedLongToBoxedShortFunction> definition);

  BoxedShortToBoxedByteFunction boxedShort2BoxedByte();
  void boxedShort2BoxedByte(Supplier<BoxedShortToBoxedByteFunction> definition);

  BoxedShortToBoxedDoubleFunction boxedShort2BoxedDouble();
  void boxedShort2BoxedDouble(Supplier<BoxedShortToBoxedDoubleFunction> definition);

  BoxedShortToBoxedFloatFunction boxedShort2BoxedFloat();
  void boxedShort2BoxedFloat(Supplier<BoxedShortToBoxedFloatFunction> definition);

  BoxedShortToBoxedIntegerFunction boxedShort2BoxedInteger();
  void boxedShort2BoxedInteger(Supplier<BoxedShortToBoxedIntegerFunction> definition);

  BoxedShortToBoxedLongFunction boxedShort2BoxedLong();
  void boxedShort2BoxedLong(Supplier<BoxedShortToBoxedLongFunction> definition);

  TypeRepository typeRepository();
  void typeRepository(Supplier<TypeRepository> definition);

  FunctionReposity functionRepository();
  void functionRepository(Supplier<FunctionReposity> definition);

  BooleanToArrayOfBooleanFunction boolean2ArrayOfBoolean();
  void boolean2ArrayOfBoolean(Supplier<BooleanToArrayOfBooleanFunction> definition);

  ByteToArrayOfByteFunction byte2ArrayOfByte();
  void byte2ArrayOfByte(Supplier<ByteToArrayOfByteFunction> definition);

  CharToArrayOfCharFunction char2ArrayOfChar();
  void char2ArrayOfChar(Supplier<CharToArrayOfCharFunction> definition);

  DoubleToArrayOfDoubleFunction double2ArrayOfDouble();
  void double2ArrayOfDouble(Supplier<DoubleToArrayOfDoubleFunction> definition);


}
