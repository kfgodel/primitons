package ar.com.kfgodel.primitons.arraying;

import ar.com.dgarcia.javaspec.api.JavaSpec;
import ar.com.dgarcia.javaspec.api.JavaSpecRunner;
import ar.com.kfgodel.primitons.PrimitonTestContext;
import ar.com.kfgodel.primitons.api.boxed.BoxedByteton;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Verifies the basic conversions for basic to array conversion
 * Created by kfgodel on 30/12/17.
 */
@RunWith(JavaSpecRunner.class)
public class BoxedByte2ArrayOfBoxedByteTest extends JavaSpec<PrimitonTestContext> {
  @Override
  public void define() {
    describe("a byte to array of byte primiton", () -> {
      context().boxedByte2ArrayOfBoxedByte(()-> BoxedByteton::toArray);

      describe("when used", () -> {
        context().boxedByteArrayOutput(()-> context().boxedByte2ArrayOfBoxedByte().apply(context().byteInput()));

        it("converts the given byte into an array containing that byte",()->{
          context().byteInput(()-> (byte)25);
          assertThat(context().boxedByteArrayOutput()).isEqualTo(new Byte[]{25});
        });

      });

    });

  }
}