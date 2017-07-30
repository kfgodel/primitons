package ar.com.kfgodel.function.intertype.doubles;

import java.util.function.Function;

/**
 * This type defines an operator for primitive boolean types
 * Created by kfgodel on 23/07/17.
 */
public interface DoubleToBooleanFunction extends Function<Double, Boolean> {

  boolean apply(double aBoolean);

  @Override
  default Boolean apply(Double aBoolean){
    return this.apply(aBoolean.doubleValue());
  }

}
