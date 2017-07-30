package ar.com.kfgodel.function.intertype.bytes;

import java.util.function.Function;

/**
 * Created by kfgodel on 23/07/17.
 */
public interface ByteToBooleanFunction extends Function<Integer, Boolean> {

  boolean apply(byte aBoolean);

  @Override
  default Boolean apply(Integer aBoolean){
    return this.apply(aBoolean.intValue());
  }

}
