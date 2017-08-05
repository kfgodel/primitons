package ar.com.kfgodel.primitons.unboxing;

import ar.com.dgarcia.javaspec.api.JavaSpec;
import ar.com.dgarcia.javaspec.api.JavaSpecRunner;
import ar.com.kfgodel.primitons.PrimitonTestContext;
import ar.com.kfgodel.primitons.api.boxed.BoxedByteton;
import ar.com.kfgodel.primitons.api.exceptions.UnmappableException;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Verifies the basic conversions for object to primitive conversion
 * Created by kfgodel on 23/07/17.
 */
@RunWith(JavaSpecRunner.class)
public class BoxedByte2ByteTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a Byte to byte primiton", () -> {
      context().boxedByte2Byte(()-> BoxedByteton::toByte);

      describe("when used", () -> {
        context().byteOutput(()-> context().boxedByte2Byte().apply(context().byteInput()));

        it("converts the object to its primitive counterpart",()->{
          context().byteInput(()-> Byte.valueOf((byte)78));
          assertThat(context().byteOutput()).isEqualTo((byte)78);
        });

        itThrows(UnmappableException.class, "if value is null",()->{
          context().boxedByte2Byte().apply(null);
        }, e ->{
          assertThat(e).hasMessage("Value[null] is not convertible to type [byte]");
        });

      });

    });

  }
}