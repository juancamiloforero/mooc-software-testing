package tudelft.mirror;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MirrorTest {
    @Test
    public void noMirror() {
        String result = new Mirror().mirrorEnds("asdfg");

        Assertions.assertEquals("", result);
    }

    @Test
    public void mirrorWithMoreCharacters() {
        String result = new Mirror().mirrorEnds("abXYZXba");

        Assertions.assertEquals("abX", result);
    }

    @Test
    public void mirrorWithOneCharacter() {
        String result = new Mirror().mirrorEnds("abzsa");

        Assertions.assertEquals("a", result);
    }

    @Test
    public void mirrorWithAllCharacters(){
        String result = new Mirror().mirrorEnds("abba");

        Assertions.assertEquals("abba", result);
    }
}
