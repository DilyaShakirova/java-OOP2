public class Radio {
    public int currentRadioStation;
    public int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > 100) {
            currentVolume = 100;
            return;
        }
        if (newCurrentVolume < 0) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

    public void setToMaxStation() {
        currentRadioStation = 9;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation > 9) return;
        if (newCurrentRadioStation < 0) {
            currentRadioStation = 9;
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public void increaseRadioStation() {
        if (currentRadioStation < 9) currentRadioStation = currentRadioStation + 1;
    }

    public void decreaseRadioStation() {
        if (currentVolume > 0) currentRadioStation = currentRadioStation - 1;
    }

}
