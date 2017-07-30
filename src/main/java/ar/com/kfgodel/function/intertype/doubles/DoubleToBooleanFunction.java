package ar.com.kfgodel.function.intertype.doubles;

import java.util.function.Function;

/**
 * Created by kfgodel on 23/07/17.
 */
public interface DoubleToBooleanFunction extends Function<Integer, Boolean> {

  boolean apply(double aBoolean);

  @Override
  default Boolean apply(Integer aBoolean){
    return this.apply(aBoolean.intValue());
  }

}
