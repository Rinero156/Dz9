package Radio;

public class Radio {
    private int minStation;
    private int maxStation;
    private int currentFrequency = minStation;
    private int minVolume;
    private int maxVolume;
    public int currentVolume = minVolume;

    public Radio() {
        this.minStation = 0;
        this.maxStation = 9;
        this.minVolume = 0;
        this.maxVolume = 100;
    }

    public Radio(int countStation) {
        this.maxStation = countStation - 1;
    }

    public int getCurrentFrequency() {
        return currentFrequency;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }


    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume <= minVolume) {
            newCurrentVolume = minVolume;
        }
        if (newCurrentVolume >= maxVolume) {
            newCurrentVolume = maxVolume;
        }
        currentVolume = newCurrentVolume;
    }

    public void setDirectAccessToFrequency(int newCurretnFrequency) {
        if (newCurretnFrequency < minStation) {
            newCurretnFrequency = minStation;
        }
        if (newCurretnFrequency > maxStation) {
            newCurretnFrequency = maxStation;
        }
        currentFrequency = newCurretnFrequency;
    }

    public void setNextFrequency() {
        if (currentFrequency == maxStation) {
            currentFrequency = minStation - 1;
        }
        currentFrequency = currentFrequency + 1;
    }

    public void setPrevFrequency() {
        if (currentFrequency == minStation) {
            currentFrequency = maxStation + 1;
        }
        currentFrequency = currentFrequency - 1;
    }

    public void increaseVolume() {
        if (currentVolume > minVolume && currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume && currentVolume < maxVolume) {
            currentVolume = currentVolume - 1;
        }
    }
}
