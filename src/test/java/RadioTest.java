import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio rad = new Radio(30);

    @Test
    public void shouldSetRadioStation() {
        rad.setCurrentRadioStation(3);
        int expected = 3;
        int actual = rad.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationAboveMax() {
        rad.setCurrentRadioStation(30);
        int expected = 0;
        int actual = rad.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationBelowMin() {
        rad.setCurrentRadioStation(-1);
        int expected = 29;
        int actual = rad.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseRadioStation() {
        rad.setCurrentRadioStation(3);
        rad.decreaseRadioStation();
        int expected = 2;
        int actual = rad.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseRadioStationIfMax() {
        rad.setCurrentRadioStation(29);
        rad.decreaseRadioStation();
        int expected = 28;
        int actual = rad.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseRadioStationIfMin() {
        rad.setCurrentRadioStation(0);
        rad.decreaseRadioStation();
        int expected = 29;
        int actual = rad.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseRadioStationBelowMin() {
        rad.setCurrentRadioStation(-1);
        rad.decreaseRadioStation();
        int expected = 28;
        int actual = rad.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseRadioStationAboveMax() {
        rad.setCurrentRadioStation(30);
        rad.decreaseRadioStation();
        int expected = 29;
        int actual = rad.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseRadioStation() {
        rad.setCurrentRadioStation(3);
        rad.increaseRadioStation();
        int expected = 4;
        int actual = rad.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseRadioStationMax() {
        rad.setCurrentRadioStation(29);
        rad.increaseRadioStation();
        int expected = 0;
        int actual = rad.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseRadioStationMin() {
        rad.setCurrentRadioStation(0);
        rad.increaseRadioStation();
        int expected = 1;
        int actual = rad.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseRadioStationBelowMin() {
        rad.setCurrentRadioStation(-1);
        rad.increaseRadioStation();
        int expected = 0;
        int actual = rad.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseRadioStationAboveMax() {
        rad.setCurrentRadioStation(30);
        rad.increaseRadioStation();
        int expected = 1;
        int actual = rad.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume() {
        rad.setCurrentVolume(80);
        int expected = 80;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeAboveMax() {
        rad.setCurrentVolume(101);
        int expected = 100;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        rad.setCurrentVolume(50);
        rad.increaseVolume();
        int expected = 51;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeIfAboveMax() {
        rad.setCurrentVolume(101);
        rad.increaseVolume();
        int expected = 100;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeIfBelowMin() {
        rad.setCurrentVolume(-3);
        rad.increaseVolume();
        int expected = 1;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() {
        rad.setCurrentVolume(50);
        rad.decreaseVolume();
        int expected = 49;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeIfVolumeAboveMax() {
        rad.setCurrentVolume(104);
        rad.decreaseVolume();
        int expected = 99;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeIfVolumeBelowMin() {
        rad.setCurrentVolume(-1);
        rad.decreaseVolume();
        int expected = 0;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}
