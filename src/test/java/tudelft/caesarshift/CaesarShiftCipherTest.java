package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CaesarShiftCipherTest {
    @Test
    public void shortShift() {
        String result = new CaesarShiftCipher().CaesarShiftCipher("ee", 1);
        Assertions.assertEquals("ff", result);
    }

    @Test
    public void largeShift() {
        String result = new CaesarShiftCipher().CaesarShiftCipher("ee", 20);
        Assertions.assertEquals("yy", result);
    }

    @Test
    public void onRangeShift() {
        String result = new CaesarShiftCipher().CaesarShiftCipher("z", 1);
        Assertions.assertEquals("a", result);
    }

    @Test
    public void onRangeShift2() {
        String result = new CaesarShiftCipher().CaesarShiftCipher("a", -2);
        Assertions.assertEquals("y", result);
    }
}
