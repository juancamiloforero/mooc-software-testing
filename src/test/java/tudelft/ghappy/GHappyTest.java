package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GHappyTest {

    @Test
    public void noString() {
        boolean result = new GHappy().gHappy("gg");

        Assertions.assertTrue(result);
    }

    @Test
    public void gHappyNone() {
        boolean result = new GHappy().gHappy("asdfdgs");

        Assertions.assertFalse(result);
    }

    @Test
    public void gHappyOne() {
        boolean result = new GHappy().gHappy("asdfdsgg");

        Assertions.assertTrue(result);
    }

    @Test
    public void gHappyMany() {
        boolean result = new GHappy().gHappy("asdfggewrtdfgghf");

        Assertions.assertTrue(result);
    }

    @Test
    public void gHappyCancelledBefore() {
        boolean result = new GHappy().gHappy("asdfdsaggdsagfd");

        Assertions.assertFalse(result);
    }

    @Test
    public void gHappyCancelledAfter() {
        boolean result = new GHappy().gHappy("agfdsareggf");

        Assertions.assertFalse(result);
    }


}
