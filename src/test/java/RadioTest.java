import org.junit.jupiter.api.Assertions;
import Radio.Radio;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class RadioTest {

    @ParameterizedTest
    @CsvSource({
            "9,0",
            "4,5",
            "0,1"
    })
//    @CsvFileSource(files = "src/test/resources/maxFrequencyTest.csv")
    public void maxFrequency(int Frequency, int expected) {
        Radio max = new Radio();
        max.setNext(Frequency);

        int actual = max.getCurrentFrequency();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "0,9",
            "4,3",
            "9,8"
    })
    public void minFrequency(int Frequency, int expected) {
        Radio min = new Radio();
        min.setPrev(Frequency);

        int actual = min.getCurrentFrequency();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "-1,0",
            "4,4",
            "10,0"
    })
    public void directFrequency(int Frequency, int expected) {
        Radio direct = new Radio();
        direct.setDirectAccessToFrequency(Frequency);

        int actual = direct.getCurrentFrequency();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "0,1",
            "4,5",
            "10,10"
    })
    public void increaseVolume(int Volume, int expected) {
        Radio increase = new Radio();
        increase.increaseVolume(Volume);

        int actual = increase.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @ParameterizedTest
    @CsvSource({
            "0,0",
            "4,3",
            "10,9"
    })
    public void decreaseVolume(int Volume, int expected) {
        Radio increase = new Radio();
        increase.decreaseVolume(Volume);

        int actual = increase.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }
}
