package ar.com.kfgodel.primitons.arraying;

import ar.com.dgarcia.javaspec.api.JavaSpec;
import ar.com.dgarcia.javaspec.api.JavaSpecRunner;
import ar.com.kfgodel.primitons.PrimitonTestContext;
import ar.com.kfgodel.primitons.api.basic.Byteton;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Verifies the basic conversions for basic to array conversion
 * Created by kfgodel on 30/12/17.
 */
@RunWith(JavaSpecRunner.class)
public class Byte2ArrayOfByteTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a byte to array of byte primiton", () -> {
      context().byte2ArrayOfByte(()-> Byteton::toArray);

      describe("when used", () -> {
        context().byteArrayOutput(()-> context().byte2ArrayOfByte().apply(context().byteInput()));

        it("converts the given value into an array containing that value",()->{
          context().byteInput(()-> (byte)89);
          assertThat(context().byteArrayOutput()).isEqualTo(new byte[]{89});
        });

      });

    });

  }
}