package ar.com.kfgodel.primitons.numeric;

import ar.com.dgarcia.javaspec.api.JavaSpec;
import ar.com.dgarcia.javaspec.api.JavaSpecRunner;
import ar.com.kfgodel.primitons.PrimitonTestContext;
import ar.com.kfgodel.primitons.api.basic.Doubleton;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * This type verifies the behavior of the double to byte converter
 * Created by kfgodel on 03/07/17.
 */
@RunWith(JavaSpecRunner.class)
public class Double2ByteTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a double to byte primiton", () -> {
      context().double2byte(()-> Doubleton::toByte);

      describe("when used", () -> {
        context().byteOutput(()-> context().double2byte().apply(context().doubleInput()));

        it("converts a primitive double into a primitive byte",()->{
          context().doubleInput(()-> 100d);
          assertThat(context().byteOutput()).isEqualTo((byte)100);
        });

        it("converts the maximum byte value without truncation",()->{
          context().doubleInput(()-> 127d);
          assertThat(context().byteOutput()).isEqualTo(Byte.MAX_VALUE);
        });

        it("converts the minimum byte value without truncation",()->{
          context().doubleInput(()-> -128d);
          assertThat(context().byteOutput()).isEqualTo(Byte.MIN_VALUE);
        });
        
        it("converts any value bigger than maximum byte with truncation",()->{
          context().doubleInput(()-> Double.MAX_VALUE);
          assertThat(context().byteOutput()).isEqualTo((byte)-1); //Most significant bits are lost
        });

        it("converts any value smaller than minimum byte with truncation",()->{
          context().doubleInput(()-> Double.MIN_VALUE);
          assertThat(context().byteOutput()).isEqualTo((byte)0); //Most significant bits are lost
        });

      });

    });
  }
}