package ar.com.kfgodel.primitons.boxing;

import ar.com.dgarcia.javaspec.api.JavaSpec;
import ar.com.dgarcia.javaspec.api.JavaSpecRunner;
import ar.com.kfgodel.primitons.PrimitonTestContext;
import ar.com.kfgodel.primitons.api.basic.Byteton;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Date: 05/08/17 - 18:11
 */
@RunWith(JavaSpecRunner.class)
public class ByteToBoxedByteTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a byte to Byte primiton", () -> {
      context().byte2boxedByte(()-> Byteton::toBoxedByte);

      describe("when used", () -> {
        context().byteOutput(()-> context().byte2boxedByte().apply(context().byteInput()));

        it("converts the primitive byte into its object counterpart",()->{
          context().byteInput(()-> (byte)56);
          assertThat(context().byteOutput()).isEqualTo(Byte.valueOf((byte)56));
        });

      });
    });

  }
}