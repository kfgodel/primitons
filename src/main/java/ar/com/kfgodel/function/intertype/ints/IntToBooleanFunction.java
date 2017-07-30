package ar.com.kfgodel.function.intertype.ints;

import java.util.function.Function;

/**
 * This type defines an operator for primitive boolean types
 * Created by kfgodel on 23/07/17.
 */
public interface IntToBooleanFunction extends Function<Integer, Boolean> {

  boolean apply(int aBoolean);

  @Override
  default Boolean apply(Integer aBoolean){
    return this.apply(aBoolean.intValue());
  }

}
