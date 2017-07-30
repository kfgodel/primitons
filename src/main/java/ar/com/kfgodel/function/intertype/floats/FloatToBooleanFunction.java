package ar.com.kfgodel.function.intertype.floats;

import java.util.function.Function;

/**
 * This type defines an operator for primitive boolean types
 * Created by kfgodel on 23/07/17.
 */
public interface FloatToBooleanFunction extends Function<Float, Boolean> {

  boolean apply(float aBoolean);

  @Override
  default Boolean apply(Float aBoolean){
    return this.apply(aBoolean.floatValue());
  }

}
