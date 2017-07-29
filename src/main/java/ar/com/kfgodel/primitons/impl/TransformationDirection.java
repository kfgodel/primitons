package ar.com.kfgodel.primitons.impl;

/**
 * This type represents a pair of types indicating the source and destintation classes for which a primiton function is required
 * Date: 29/07/17 - 14:00
 */
public class TransformationDirection<I,O> {

  private Class<I> inputType;
  private Class<O> outputType;
  private int cachedHashcode;

  public Class<I> getInputType() {
    return inputType;
  }

  public Class<O> getOutputType() {
    return outputType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof TransformationDirection)) {
      return false;
    }

    TransformationDirection<?, ?> that = (TransformationDirection<?, ?>) o;
    return inputType.equals(that.inputType) && outputType.equals(that.outputType);
  }

  @Override
  public int hashCode() {
    return cachedHashcode;
  }


  @Override
  public String toString() {
    return "From: " + inputType +
      " to: " + outputType ;
  }

  public static<I,O> TransformationDirection<I,O> create(Class<I> inputType, Class<O> outputType) {
    TransformationDirection<I,O> direction = new TransformationDirection<>();
    direction.inputType = inputType;
    direction.outputType = outputType;
    direction.cacheHashcode();
    return direction;
  }

  private void cacheHashcode() {
    this.cachedHashcode = 31 * inputType.hashCode() + outputType.hashCode();
  }

}
