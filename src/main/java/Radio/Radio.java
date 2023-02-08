package Radio;

public class Radio {
    private int currentFrequency;
    public int currentVolume;

    public int getCurrentFrequency() {
        return currentFrequency;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume <= 0) {
            newCurrentVolume = 0;
        }
        if (newCurrentVolume >= 10) {
            newCurrentVolume = 10;
        }
        currentVolume = newCurrentVolume;
    }

    public void setDirectAccessToFrequency(int newCurretnFrequency) {
        if (newCurretnFrequency < 0) {
            newCurretnFrequency = 0;
        }
        if (newCurretnFrequency > 9) {
            newCurretnFrequency = 9;
        }
        currentFrequency = newCurretnFrequency;
    }

    public void setNextFrequency() {
        if (currentFrequency == 9) {
            currentFrequency = -1;
        }
        currentFrequency = currentFrequency + 1;
    }

    public void setPrevFrequency() {
        if (currentFrequency == 0) {
            currentFrequency = 10;
        }
        currentFrequency = currentFrequency - 1;
    }

    public void increaseVolume() {
        if (currentVolume > 0 && currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 1 && currentVolume < 10) {
            currentVolume = currentVolume - 1;
        }
    }
}
