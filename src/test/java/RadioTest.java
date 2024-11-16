import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void shouldSetRadioStation() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(3);
        int expected = 3;
        int actual = rad.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationAboveMax() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(10);
        int expected = 0;
        int actual = rad.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationBelowMin() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(-1);
        int expected = 9;
        int actual = rad.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseRadioStation() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(3);
        rad.increaseRadioStation();
        int expected = 4;
        int actual = rad.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(80);
        int expected = 80;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMaxStation() {
        Radio rad = new Radio();
        rad.setToMaxStation();
        int expected = 9;
        int actual = rad.currentRadioStation;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeAboveMax() {
        Radio rad = new Radio();
        rad.setCurrentVolume(101);
        int expected = 100;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(50);
        rad.increaseVolume();
        int expected = 51;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeIfAboveMax() {
        Radio rad = new Radio();
        rad.setCurrentVolume(101);
        rad.increaseVolume();
        int expected = 100;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeIfBelowMin() {
        Radio rad = new Radio();
        rad.setCurrentVolume(-3);
        rad.increaseVolume();
        int expected = 1;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(50);
        rad.decreaseVolume();
        int expected = 49;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeIfVolumeAboveMax() {
        Radio rad = new Radio();
        rad.setCurrentVolume(104);
        rad.decreaseVolume();
        int expected = 99;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeIfVolumeBelowMin() {
        Radio rad = new Radio();
        rad.setCurrentVolume(-1);
        rad.decreaseVolume();
        int expected = 0;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}
