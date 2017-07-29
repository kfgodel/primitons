package ar.com.kfgodel.primitons;

import ar.com.dgarcia.javaspec.api.contexts.TestContext;
import ar.com.kfgodel.function.arrays.*;
import ar.com.kfgodel.function.basic.*;
import ar.com.kfgodel.function.boxed.*;

import java.util.function.IntToLongFunction;
import java.util.function.LongToIntFunction;
import java.util.function.Supplier;

/**
 * This type defines the variables used for sharing test context
 * Created by kfgodel on 03/07/17.
 */
public interface PrimitonTestContext extends TestContext {

  BooleanUnaryOperator boolean2boolean();
  void boolean2boolean(Supplier<BooleanUnaryOperator> definition);

  BoxedBooleanUnaryOperator boxedBoolean2boxedBoolean();
  void boxedBoolean2boxedBoolean(Supplier<BoxedBooleanUnaryOperator> definition);

  BoxedByteUnaryOperator boxedByte2boxedByte();
  void boxedByte2boxedByte(Supplier<BoxedByteUnaryOperator> definition);

  BoxedCharacterUnaryOperator boxedByte2BoxedByte();
  void boxedByte2BoxedByte(Supplier<BoxedCharacterUnaryOperator> definition);

  BoxedDoubleUnaryOperator boxedDouble2boxedDouble();
  void boxedDouble2boxedDouble(Supplier<BoxedDoubleUnaryOperator> definition);

  BoxedFloatUnaryOperator boxedFloat2boxedFloat();
  void boxedFloat2boxedFloat(Supplier<BoxedFloatUnaryOperator> definition);

  BoxedIntegerUnaryOperator boxedInteger2boxedInteger();
  void boxedInteger2boxedInteger(Supplier<BoxedIntegerUnaryOperator> definition);

  BoxedLongUnaryOperator boxedLong2boxedLong();
  void boxedLong2boxedLong(Supplier<BoxedLongUnaryOperator> definition);

  BoxedShortUnaryOperator boxedShort2boxedShort();
  void boxedShort2boxedShort(Supplier<BoxedShortUnaryOperator> definition);

  ByteUnaryOpertor byte2byte();
  void byte2byte(Supplier<ByteUnaryOpertor> definition);

  CharUnaryOpertor char2char();
  void char2char(Supplier<CharUnaryOpertor> definition);

  DoubleUnaryOpertor double2double();
  void double2double(Supplier<DoubleUnaryOpertor> definition);

  FloatUnaryOperator float2float();
  void float2float(Supplier<FloatUnaryOperator> definition);

  IntUnaryOperator int2int();
  void int2int(Supplier<IntUnaryOperator> definition);

  LongUnaryOperator long2long();
  void long2long(Supplier<LongUnaryOperator> definition);

  ShortUnaryOperator short2short();
  void short2short(Supplier<ShortUnaryOperator> definition);

  StringUnaryOperator string2String();
  void string2String(Supplier<StringUnaryOperator> definition);

  ObjectUnaryOperator object2Object();
  void object2Object(Supplier<ObjectUnaryOperator> definition);

  ArrayOfBooleanUnaryOperator booleanArray2BooleanArray();
  void booleanArray2BooleanArray(Supplier<ArrayOfBooleanUnaryOperator> definition);

  ArrayOfByteUnaryOperator byteArray2ByteArray();
  void byteArray2ByteArray(Supplier<ArrayOfByteUnaryOperator> definition);

  ArrayOfCharUnaryOperator charArray2CharArray();
  void charArray2CharArray(Supplier<ArrayOfCharUnaryOperator> definition);

  ArrayOfDoubleUnaryOperator doubleArray2DoubleArray();
  void doubleArray2DoubleArray(Supplier<ArrayOfDoubleUnaryOperator> definition);

  ArrayOfFloatUnaryOperator floatArray2FloatArray();
  void floatArray2FloatArray(Supplier<ArrayOfFloatUnaryOperator> definition);

  ArrayOfIntOperator intArray2IntArray();
  void intArray2IntArray(Supplier<ArrayOfIntOperator> definition);

  ArrayOfLongOperator longArray2LongArray();
  void longArray2LongArray(Supplier<ArrayOfLongOperator> definition);

  ArrayOfShortOperator shortArray2ShortArray();
  void shortArray2ShortArray(Supplier<ArrayOfShortOperator> definition);

  ArrayOfStringUnaryOperator stringArray2StringArray();
  void stringArray2StringArray(Supplier<ArrayOfStringUnaryOperator> definition);

  ArrayOfObjectUnaryOperator objectArray2ObjectArray();
  void objectArray2ObjectArray(Supplier<ArrayOfObjectUnaryOperator> definition);

  ArrayOfBoxedBooleanUnaryOperator boxedBooleanArray2boxedBooleanArray();
  void boxedBooleanArray2boxedBooleanArray(Supplier<ArrayOfBoxedBooleanUnaryOperator> definition);

  ArrayOfBoxedByteUnaryOperator boxedByteArray2boxedByteArray();
  void boxedByteArray2boxedByteArray(Supplier<ArrayOfBoxedByteUnaryOperator> definition);

  ArrayOfBoxedCharacterUnaryOperator boxedCharacterArray2boxedCharacterArray();
  void boxedCharacterArray2boxedCharacterArray(Supplier<ArrayOfBoxedCharacterUnaryOperator> definition);

  ArrayOfBoxedDoubleUnaryOperator boxedDoubleArray2boxedDoubleArray();
  void boxedDoubleArray2boxedDoubleArray(Supplier<ArrayOfBoxedDoubleUnaryOperator> definition);

  ArrayOfBoxedFloatUnaryOperator boxedFloatArray2boxedFloatArray();
  void boxedFloatArray2boxedFloatArray(Supplier<ArrayOfBoxedFloatUnaryOperator> definition);

  ArrayOfBoxedIntegerUnaryOperator boxedIntegerArray2boxedIntegerArray();
  void boxedIntegerArray2boxedIntegerArray(Supplier<ArrayOfBoxedIntegerUnaryOperator> definition);

  ArrayOfBoxedLongUnaryOperator boxedLongArray2boxedLongArray();
  void boxedLongArray2boxedLongArray(Supplier<ArrayOfBoxedLongUnaryOperator> definition);

  ArrayOfBoxedShortUnaryOperator boxedShortArray2boxedShortArray();
  void boxedShortArray2boxedShortArray(Supplier<ArrayOfBoxedShortUnaryOperator> definition);


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




  IntToLongFunction int2Long();
  void int2Long(Supplier<IntToLongFunction> definition);

  LongToIntFunction long2int();
  void long2int(Supplier<LongToIntFunction> definition);

}
