import org.junit.jupiter.api.Assertions;
import Radio.Radio;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class RadioTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/maxFrequencyTest.csv")
    public void maxFrequency(int frequency, int expected) {
        Radio max = new Radio();
        max.setDirectAccessToFrequency(frequency);
        max.setNextFrequency();

        int actual = max.getCurrentFrequency();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/minFrequencyTest.csv")
    public void minFrequency(int frequency, int expected) {
        Radio min = new Radio();
        min.setDirectAccessToFrequency(frequency);
        min.setPrevFrequency();

        int actual = min.getCurrentFrequency();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/directFrequencyTest.csv")
    public void directFrequency(int frequency, int expected) {
        Radio direct = new Radio();
        direct.setDirectAccessToFrequency(frequency);

        int actual = direct.getCurrentFrequency();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/increaseVolume.csv")
    public void increaseVolume(int volume, int expected) {
        Radio increase = new Radio();
        increase.setCurrentVolume(volume);
        increase.increaseVolume();

        int actual = increase.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/decreaseVolume.csv")
    public void decreaseVolume(int Volume, int expected) {
        Radio increase = new Radio();
        increase.setCurrentVolume(Volume);
        increase.decreaseVolume();

        int actual = increase.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }
}
