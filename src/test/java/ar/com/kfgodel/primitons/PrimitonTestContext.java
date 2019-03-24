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
import ar.com.kfgodel.function.boxed.booleans.arrays.boxed.BoxedBooleanToArrayOfBoxedBooleanFunction;
import ar.com.kfgodel.function.boxed.booleans.boxed.BoxedBooleanToBoxedBooleanFunction;
import ar.com.kfgodel.function.boxed.bytes.BoxedByteToByteFunction;
import ar.com.kfgodel.function.boxed.bytes.BoxedByteToDoubleFunction;
import ar.com.kfgodel.function.boxed.bytes.BoxedByteToFloatFunction;
import ar.com.kfgodel.function.boxed.bytes.BoxedByteToIntFunction;
import ar.com.kfgodel.function.boxed.bytes.BoxedByteToLongFunction;
import ar.com.kfgodel.function.boxed.bytes.BoxedByteToShortFunction;
import ar.com.kfgodel.function.boxed.bytes.arrays.boxed.BoxedByteToArrayOfBoxedByteFunction;
import ar.com.kfgodel.function.boxed.bytes.boxed.BoxedByteToBoxedByteFunction;
import ar.com.kfgodel.function.boxed.bytes.boxed.BoxedByteToBoxedDoubleFunction;
import ar.com.kfgodel.function.boxed.bytes.boxed.BoxedByteToBoxedFloatFunction;
import ar.com.kfgodel.function.boxed.bytes.boxed.BoxedByteToBoxedIntegerFunction;
import ar.com.kfgodel.function.boxed.bytes.boxed.BoxedByteToBoxedLongFunction;
import ar.com.kfgodel.function.boxed.bytes.boxed.BoxedByteToBoxedShortFunction;
import ar.com.kfgodel.function.boxed.chars.BoxedCharacterToCharFunction;
import ar.com.kfgodel.function.boxed.chars.arrays.boxed.BoxedCharacterToArrayOfBoxedCharacterFunction;
import ar.com.kfgodel.function.boxed.chars.boxed.BoxedCharacterToBoxedCharacterFunction;
import ar.com.kfgodel.function.boxed.doubles.BoxedDoubleToByteFunction;
import ar.com.kfgodel.function.boxed.doubles.BoxedDoubleToDoubleFunction;
import ar.com.kfgodel.function.boxed.doubles.BoxedDoubleToFloatFunction;
import ar.com.kfgodel.function.boxed.doubles.BoxedDoubleToIntFunction;
import ar.com.kfgodel.function.boxed.doubles.BoxedDoubleToLongFunction;
import ar.com.kfgodel.function.boxed.doubles.BoxedDoubleToShortFunction;
import ar.com.kfgodel.function.boxed.doubles.arrays.boxed.BoxedDoubleToArrayOfBoxedDoubleFunction;
import ar.com.kfgodel.function.boxed.doubles.boxed.BoxedDoubleToBoxedByteFunction;
import ar.com.kfgodel.function.boxed.doubles.boxed.BoxedDoubleToBoxedDoubleFunction;
import ar.com.kfgodel.function.boxed.doubles.boxed.BoxedDoubleToBoxedFloatFunction;
import ar.com.kfgodel.function.boxed.doubles.boxed.BoxedDoubleToBoxedIntegerFunction;
import ar.com.kfgodel.function.boxed.doubles.boxed.BoxedDoubleToBoxedLongFunction;
import ar.com.kfgodel.function.boxed.doubles.boxed.BoxedDoubleToBoxedShortFunction;
import ar.com.kfgodel.function.boxed.floats.BoxedFloatToByteFunction;
import ar.com.kfgodel.function.boxed.floats.BoxedFloatToDoubleFunction;
import ar.com.kfgodel.function.boxed.floats.BoxedFloatToFloatFunction;
import ar.com.kfgodel.function.boxed.floats.BoxedFloatToIntFunction;
import ar.com.kfgodel.function.boxed.floats.BoxedFloatToLongFunction;
import ar.com.kfgodel.function.boxed.floats.BoxedFloatToShortFunction;
import ar.com.kfgodel.function.boxed.floats.arrays.boxed.BoxedFloatToArrayOfBoxedFloatFunction;
import ar.com.kfgodel.function.boxed.floats.boxed.BoxedFloatToBoxedByteFunction;
import ar.com.kfgodel.function.boxed.floats.boxed.BoxedFloatToBoxedDoubleFunction;
import ar.com.kfgodel.function.boxed.floats.boxed.BoxedFloatToBoxedFloatFunction;
import ar.com.kfgodel.function.boxed.floats.boxed.BoxedFloatToBoxedIntegerFunction;
import ar.com.kfgodel.function.boxed.floats.boxed.BoxedFloatToBoxedLongFunction;
import ar.com.kfgodel.function.boxed.floats.boxed.BoxedFloatToBoxedShortFunction;
import ar.com.kfgodel.function.boxed.ints.BoxedIntegerToByteFunction;
import ar.com.kfgodel.function.boxed.ints.BoxedIntegerToDoubleFunction;
import ar.com.kfgodel.function.boxed.ints.BoxedIntegerToFloatFunction;
import ar.com.kfgodel.function.boxed.ints.BoxedIntegerToIntFunction;
import ar.com.kfgodel.function.boxed.ints.BoxedIntegerToLongFunction;
import ar.com.kfgodel.function.boxed.ints.BoxedIntegerToShortFunction;
import ar.com.kfgodel.function.boxed.ints.arrays.boxed.BoxedIntegerToArrayOfBoxedIntegerFunction;
import ar.com.kfgodel.function.boxed.ints.boxed.BoxedIntegerToBoxedByteFunction;
import ar.com.kfgodel.function.boxed.ints.boxed.BoxedIntegerToBoxedDoubleFunction;
import ar.com.kfgodel.function.boxed.ints.boxed.BoxedIntegerToBoxedFloatFunction;
import ar.com.kfgodel.function.boxed.ints.boxed.BoxedIntegerToBoxedIntegerFunction;
import ar.com.kfgodel.function.boxed.ints.boxed.BoxedIntegerToBoxedLongFunction;
import ar.com.kfgodel.function.boxed.ints.boxed.BoxedIntegerToBoxedShortFunction;
import ar.com.kfgodel.function.boxed.longs.BoxedLongToByteFunction;
import ar.com.kfgodel.function.boxed.longs.BoxedLongToDoubleFunction;
import ar.com.kfgodel.function.boxed.longs.BoxedLongToFloatFunction;
import ar.com.kfgodel.function.boxed.longs.BoxedLongToIntFunction;
import ar.com.kfgodel.function.boxed.longs.BoxedLongToLongFunction;
import ar.com.kfgodel.function.boxed.longs.BoxedLongToShortFunction;
import ar.com.kfgodel.function.boxed.longs.arrays.boxed.BoxedLongToArrayOfBoxedLongFunction;
import ar.com.kfgodel.function.boxed.longs.boxed.BoxedLongToBoxedByteFunction;
import ar.com.kfgodel.function.boxed.longs.boxed.BoxedLongToBoxedDoubleFunction;
import ar.com.kfgodel.function.boxed.longs.boxed.BoxedLongToBoxedFloatFunction;
import ar.com.kfgodel.function.boxed.longs.boxed.BoxedLongToBoxedIntegerFunction;
import ar.com.kfgodel.function.boxed.longs.boxed.BoxedLongToBoxedLongFunction;
import ar.com.kfgodel.function.boxed.longs.boxed.BoxedLongToBoxedShortFunction;
import ar.com.kfgodel.function.boxed.shorts.BoxedShortToByteFunction;
import ar.com.kfgodel.function.boxed.shorts.BoxedShortToDoubleFunction;
import ar.com.kfgodel.function.boxed.shorts.BoxedShortToFloatFunction;
import ar.com.kfgodel.function.boxed.shorts.BoxedShortToIntFunction;
import ar.com.kfgodel.function.boxed.shorts.BoxedShortToLongFunction;
import ar.com.kfgodel.function.boxed.shorts.BoxedShortToShortFunction;
import ar.com.kfgodel.function.boxed.shorts.arrays.boxed.BoxedShortToArrayOfBoxedShortFunction;
import ar.com.kfgodel.function.boxed.shorts.boxed.BoxedShortToBoxedByteFunction;
import ar.com.kfgodel.function.boxed.shorts.boxed.BoxedShortToBoxedDoubleFunction;
import ar.com.kfgodel.function.boxed.shorts.boxed.BoxedShortToBoxedFloatFunction;
import ar.com.kfgodel.function.boxed.shorts.boxed.BoxedShortToBoxedIntegerFunction;
import ar.com.kfgodel.function.boxed.shorts.boxed.BoxedShortToBoxedLongFunction;
import ar.com.kfgodel.function.boxed.shorts.boxed.BoxedShortToBoxedShortFunction;
import ar.com.kfgodel.function.boxed.strings.arrays.boxed.StringToArrayOfStringFunction;
import ar.com.kfgodel.function.boxed.strings.boxed.StringToStringFunction;
import ar.com.kfgodel.function.bytes.ByteToByteFunction;
import ar.com.kfgodel.function.bytes.ByteToDoubleFunction;
import ar.com.kfgodel.function.bytes.ByteToFloatFunction;
import ar.com.kfgodel.function.bytes.ByteToIntFunction;
import ar.com.kfgodel.function.bytes.ByteToLongFunction;
import ar.com.kfgodel.function.bytes.ByteToShortFunction;
import ar.com.kfgodel.function.bytes.arrays.ByteToArrayOfByteFunction;
import ar.com.kfgodel.function.bytes.boxed.ByteToBoxedByteFunction;
import ar.com.kfgodel.function.bytes.boxed.ByteToBoxedDoubleFunction;
import ar.com.kfgodel.function.bytes.boxed.ByteToBoxedFloatFunction;
import ar.com.kfgodel.function.bytes.boxed.ByteToBoxedIntegerFunction;
import ar.com.kfgodel.function.bytes.boxed.ByteToBoxedLongFunction;
import ar.com.kfgodel.function.bytes.boxed.ByteToBoxedShortFunction;
import ar.com.kfgodel.function.chars.CharToCharFunction;
import ar.com.kfgodel.function.chars.arrays.CharToArrayOfCharFunction;
import ar.com.kfgodel.function.chars.boxed.CharToBoxedCharacterFunction;
import ar.com.kfgodel.function.doubles.DoubleToByteFunction;
import ar.com.kfgodel.function.doubles.DoubleToDoubleFunction;
import ar.com.kfgodel.function.doubles.DoubleToFloatFunction;
import ar.com.kfgodel.function.doubles.DoubleToIntFunction;
import ar.com.kfgodel.function.doubles.DoubleToLongFunction;
import ar.com.kfgodel.function.doubles.DoubleToShortFunction;
import ar.com.kfgodel.function.doubles.arrays.DoubleToArrayOfDoubleFunction;
import ar.com.kfgodel.function.doubles.boxed.DoubleToBoxedByteFunction;
import ar.com.kfgodel.function.doubles.boxed.DoubleToBoxedDoubleFunction;
import ar.com.kfgodel.function.doubles.boxed.DoubleToBoxedFloatFunction;
import ar.com.kfgodel.function.doubles.boxed.DoubleToBoxedIntegerFunction;
import ar.com.kfgodel.function.doubles.boxed.DoubleToBoxedLongFunction;
import ar.com.kfgodel.function.doubles.boxed.DoubleToBoxedShortFunction;
import ar.com.kfgodel.function.floats.FloatToByteFunction;
import ar.com.kfgodel.function.floats.FloatToDoubleFunction;
import ar.com.kfgodel.function.floats.FloatToFloatFunction;
import ar.com.kfgodel.function.floats.FloatToIntFunction;
import ar.com.kfgodel.function.floats.FloatToLongFunction;
import ar.com.kfgodel.function.floats.FloatToShortFunction;
import ar.com.kfgodel.function.floats.arrays.FloatToArrayOfFloatFunction;
import ar.com.kfgodel.function.floats.boxed.FloatToBoxedByteFunction;
import ar.com.kfgodel.function.floats.boxed.FloatToBoxedDoubleFunction;
import ar.com.kfgodel.function.floats.boxed.FloatToBoxedFloatFunction;
import ar.com.kfgodel.function.floats.boxed.FloatToBoxedIntegerFunction;
import ar.com.kfgodel.function.floats.boxed.FloatToBoxedLongFunction;
import ar.com.kfgodel.function.floats.boxed.FloatToBoxedShortFunction;
import ar.com.kfgodel.function.ints.IntToByteFunction;
import ar.com.kfgodel.function.ints.IntToDoubleFunction;
import ar.com.kfgodel.function.ints.IntToFloatFunction;
import ar.com.kfgodel.function.ints.IntToIntFunction;
import ar.com.kfgodel.function.ints.IntToLongFunction;
import ar.com.kfgodel.function.ints.IntToShortFunction;
import ar.com.kfgodel.function.ints.arrays.IntToArrayOfIntFunction;
import ar.com.kfgodel.function.ints.boxed.IntToBoxedByteFunction;
import ar.com.kfgodel.function.ints.boxed.IntToBoxedDoubleFunction;
import ar.com.kfgodel.function.ints.boxed.IntToBoxedFloatFunction;
import ar.com.kfgodel.function.ints.boxed.IntToBoxedIntegerFunction;
import ar.com.kfgodel.function.ints.boxed.IntToBoxedLongFunction;
import ar.com.kfgodel.function.ints.boxed.IntToBoxedShortFunction;
import ar.com.kfgodel.function.longs.LongToByteFunction;
import ar.com.kfgodel.function.longs.LongToDoubleFunction;
import ar.com.kfgodel.function.longs.LongToFloatFunction;
import ar.com.kfgodel.function.longs.LongToIntFunction;
import ar.com.kfgodel.function.longs.LongToLongFunction;
import ar.com.kfgodel.function.longs.LongToShortFunction;
import ar.com.kfgodel.function.longs.arrays.LongToArrayOfLongFunction;
import ar.com.kfgodel.function.longs.boxed.LongToBoxedByteFunction;
import ar.com.kfgodel.function.longs.boxed.LongToBoxedDoubleFunction;
import ar.com.kfgodel.function.longs.boxed.LongToBoxedFloatFunction;
import ar.com.kfgodel.function.longs.boxed.LongToBoxedIntegerFunction;
import ar.com.kfgodel.function.longs.boxed.LongToBoxedLongFunction;
import ar.com.kfgodel.function.longs.boxed.LongToBoxedShortFunction;
import ar.com.kfgodel.function.objects.ObjectToObjectFunction;
import ar.com.kfgodel.function.objects.arrays.ObjectToArrayOfObjectFunction;
import ar.com.kfgodel.function.shorts.ShortToByteFunction;
import ar.com.kfgodel.function.shorts.ShortToDoubleFunction;
import ar.com.kfgodel.function.shorts.ShortToFloatFunction;
import ar.com.kfgodel.function.shorts.ShortToIntFunction;
import ar.com.kfgodel.function.shorts.ShortToLongFunction;
import ar.com.kfgodel.function.shorts.ShortToShortFunction;
import ar.com.kfgodel.function.shorts.ShortToStringFunction;
import ar.com.kfgodel.function.shorts.arrays.ShortToArrayOfShortFunction;
import ar.com.kfgodel.function.shorts.boxed.ShortToBoxedByteFunction;
import ar.com.kfgodel.function.shorts.boxed.ShortToBoxedDoubleFunction;
import ar.com.kfgodel.function.shorts.boxed.ShortToBoxedFloatFunction;
import ar.com.kfgodel.function.shorts.boxed.ShortToBoxedIntegerFunction;
import ar.com.kfgodel.function.shorts.boxed.ShortToBoxedLongFunction;
import ar.com.kfgodel.function.shorts.boxed.ShortToBoxedShortFunction;
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

  Integer[] boxedIntegerArrayOutput();
  void boxedIntegerArrayOutput(Supplier<Integer[]> definition);

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

  ShortToStringFunction short2String();
  void short2String(Supplier<ShortToStringFunction> definition);


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

  FloatToArrayOfFloatFunction float2ArrayOfFloat();
  void float2ArrayOfFloat(Supplier<FloatToArrayOfFloatFunction> definition);

  IntToArrayOfIntFunction int2ArrayOfInteger();
  void int2ArrayOfInteger(Supplier<IntToArrayOfIntFunction> definition);

  LongToArrayOfLongFunction long2ArrayOfLong();
  void long2ArrayOfLong(Supplier<LongToArrayOfLongFunction> definition);

  ShortToArrayOfShortFunction short2ArrayOfShort();
  void short2ArrayOfShort(Supplier<ShortToArrayOfShortFunction> definition);

  <I,O> ObjectToArrayOfObjectFunction<I,O> object2ArrayOfObject();
  void object2ArrayOfObject(Supplier<ObjectToArrayOfObjectFunction> definition);

  StringToArrayOfStringFunction string2ArrayOfString();
  void string2ArrayOfString(Supplier<StringToArrayOfStringFunction> definition);

  BoxedIntegerToArrayOfBoxedIntegerFunction boxedInteger2ArrayOfBoxedInteger();
  void boxedInteger2ArrayOfBoxedInteger(Supplier<BoxedIntegerToArrayOfBoxedIntegerFunction> definition);

  BoxedLongToArrayOfBoxedLongFunction boxedLong2ArrayOfBoxedLong();
  void boxedLong2ArrayOfBoxedLong(Supplier<BoxedLongToArrayOfBoxedLongFunction> definition);

  BoxedFloatToArrayOfBoxedFloatFunction boxedFloat2ArrayOfBoxedFloat();
  void boxedFloat2ArrayOfBoxedFloat(Supplier<BoxedFloatToArrayOfBoxedFloatFunction> definition);

  BoxedDoubleToArrayOfBoxedDoubleFunction boxedDouble2ArrayOfBoxedDouble();
  void boxedDouble2ArrayOfBoxedDouble(Supplier<BoxedDoubleToArrayOfBoxedDoubleFunction> definition);

  BoxedShortToArrayOfBoxedShortFunction boxedShort2ArrayOfBoxedShort();
  void boxedShort2ArrayOfBoxedShort(Supplier<BoxedShortToArrayOfBoxedShortFunction> definition);

  BoxedByteToArrayOfBoxedByteFunction boxedByte2ArrayOfBoxedByte();
  void boxedByte2ArrayOfBoxedByte(Supplier<BoxedByteToArrayOfBoxedByteFunction> definition);

  BoxedBooleanToArrayOfBoxedBooleanFunction boxedBoolean2ArrayOfBoxedBoolean();
  void boxedBoolean2ArrayOfBoxedBoolean(Supplier<BoxedBooleanToArrayOfBoxedBooleanFunction> definition);

  BoxedCharacterToArrayOfBoxedCharacterFunction boxedCharacter2ArrayOfBoxedCharacter();
  void boxedCharacter2ArrayOfBoxedCharacter(Supplier<BoxedCharacterToArrayOfBoxedCharacterFunction> definition);

}
