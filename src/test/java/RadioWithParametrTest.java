import Radio.Radio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioWithParametrTest {
    @Test
    public void test() {
        Radio radio = new Radio(10);

        radio.setDirectAccessToFrequency(9);

        int expected = 9;
        int actual = radio.getCurrentFrequency();
        Assertions.assertEquals(expected, actual);
    }
}
