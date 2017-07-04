package ar.com.kfgodel.primitons;

import ar.com.dgarcia.javaspec.api.contexts.TestContext;

import java.util.function.IntToLongFunction;
import java.util.function.Supplier;

/**
 * This type defines the variables used for sharing test context
 * Created by kfgodel on 03/07/17.
 */
public interface PrimitonTestContext extends TestContext {

  IntToLongFunction int2Long();
  void int2Long(Supplier<IntToLongFunction> definition);

  Integer intInput();
  void intInput(Supplier<Integer> definition);

  Long longOutput();
  void longOutput(Supplier<Long> definition);


}
