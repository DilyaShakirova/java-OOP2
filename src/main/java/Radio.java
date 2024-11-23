public class Radio {
    private int currentRadioStation;
    private int currentVolume;
    private int minVolume;
    private int maxVolume = 100;
    private int numberRadioStations = 10;
    private int maxRadioStation = numberRadioStations - 1;

    public Radio(int numberRadioStations) {
        this.numberRadioStations = numberRadioStations;
        this.maxRadioStation = numberRadioStations - 1;
    }

    public Radio() {
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > maxVolume) {
            currentVolume = maxVolume;
            return;
        }
        if (newCurrentVolume < minVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation > maxRadioStation) {
            currentRadioStation = 0;
            return;
        }
        if (newCurrentRadioStation < 0) {
            currentRadioStation = maxRadioStation;
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public void increaseRadioStation() {
        if (currentRadioStation < maxRadioStation) currentRadioStation = currentRadioStation + 1;
        else currentRadioStation = 0;
    }

    public void decreaseRadioStation() {
        if (currentRadioStation > 0) currentRadioStation = currentRadioStation - 1;
        else currentRadioStation = maxRadioStation;
    }

}
