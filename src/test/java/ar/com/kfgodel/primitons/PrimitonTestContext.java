package ar.com.kfgodel.primitons;

import ar.com.dgarcia.javaspec.api.contexts.TestContext;
import ar.com.kfgodel.function.BooleanUnaryOperator;

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

  IntToLongFunction int2Long();
  void int2Long(Supplier<IntToLongFunction> definition);

  Integer intInput();
  void intInput(Supplier<Integer> definition);

  Long longOutput();
  void longOutput(Supplier<Long> definition);

  LongToIntFunction long2int();
  void long2int(Supplier<LongToIntFunction> definition);

  Long longInput();
  void longInput(Supplier<Long> definition);

  Integer intOutput();
  void intOutput(Supplier<Integer> definition);

  Boolean booleanInput();
  void booleanInput(Supplier<Boolean> definition);

  Boolean booleanOutput();
  void booleanOutput(Supplier<Boolean> definition);

}