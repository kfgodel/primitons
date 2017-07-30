package ar.com.kfgodel.function.intertype.chars;

import java.util.function.Function;

/**
 * Created by kfgodel on 23/07/17.
 */
public interface CharToBooleanFunction extends Function<Integer, Boolean> {

  boolean apply(char aBoolean);

  @Override
  default Boolean apply(Integer aBoolean){
    return this.apply(aBoolean.intValue());
  }

}
