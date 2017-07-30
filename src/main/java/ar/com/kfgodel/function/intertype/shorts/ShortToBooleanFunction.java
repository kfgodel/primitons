package ar.com.kfgodel.function.intertype.shorts;

import java.util.function.Function;

/**
 * Created by kfgodel on 23/07/17.
 */
public interface ShortToBooleanFunction extends Function<Integer, Boolean> {

  boolean apply(short aBoolean);

  @Override
  default Boolean apply(Integer aBoolean){
    return this.apply(aBoolean.intValue());
  }

}
