package Radio;

public class Radio {
    private int currentFrequency;
    private int currentVolume;

    public int getCurrentFrequency() {
        return currentFrequency;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int setNext(int newCurretnFrequency) {
        if (newCurretnFrequency >= 9) {
            return currentFrequency = 0;
        }
        return currentFrequency = newCurretnFrequency + 1;
    }

    public int setPrev(int newCurretnFrequency) {
        if (newCurretnFrequency <= 0) {
            return currentFrequency = 9;
        }
        return currentFrequency = newCurretnFrequency - 1;
    }

    public void setDirectAccessToFrequency(int newCurretnFrequency) {
        if (newCurretnFrequency < 0) {
            return;
        }
        if (newCurretnFrequency > 9) {
            return;
        }
        currentFrequency = newCurretnFrequency;
    }

    public int increaseVolume(int newCurrentVolume) {
        if (newCurrentVolume == 10) {
            return currentVolume = 10;
        }
        return currentVolume = newCurrentVolume + 1;
    }

    public int decreaseVolume(int newCurrentVolume) {
        if (newCurrentVolume == 0) {
            return currentVolume = 0;
        }
        return currentVolume = newCurrentVolume - 1;
    }
}
