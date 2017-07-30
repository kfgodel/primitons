package ar.com.kfgodel.function.intertype.floats;

import java.util.function.Function;

/**
 * Created by kfgodel on 23/07/17.
 */
public interface FloatToBooleanFunction extends Function<Integer, Boolean> {

  boolean apply(float aBoolean);

  @Override
  default Boolean apply(Integer aBoolean){
    return this.apply(aBoolean.intValue());
  }

}
