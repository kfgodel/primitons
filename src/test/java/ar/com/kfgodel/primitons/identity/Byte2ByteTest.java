package ar.com.kfgodel.primitons.identity;

import ar.com.dgarcia.javaspec.api.JavaSpec;
import ar.com.dgarcia.javaspec.api.JavaSpecRunner;
import ar.com.kfgodel.primitons.PrimitonTestContext;
import ar.com.kfgodel.primitons.api.basic.Byteton;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * This type verifies the identiy function
 * Date: 29/07/17 - 14:58
 */
@RunWith(JavaSpecRunner.class)
public class Byte2ByteTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a byte to byte primiton", () -> {
      context().byte2byte(()-> Byteton::identity);

      describe("when used", () -> {
        context().byteOutput(()-> context().byte2byte().apply(context().byteInput()));

        it("returns same value as given",()->{
          context().byteInput(()-> (byte)1);
          assertThat(context().byteInput()).isEqualTo((byte)1);
        });

      });
    });
  }
}