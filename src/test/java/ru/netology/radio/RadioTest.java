package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void shouldInstallNumberARadioStation() {
        Radio rad = new Radio();
        rad.setNumberCurrentRadioStation(1);
        int expected = 1;
        int actual = rad.getNumberCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMaxNumberRadioStation() {
        Radio rad = new Radio();
        rad.setToMaxNumberRadioStation();

        int expected = 9;
        int actual = rad.getNumberCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMinNumberRadioStation() {
        Radio rad = new Radio();
        rad.setToMinNumberRadioStation();

        int expected = 0;
        int actual = rad.getNumberCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetNumberRadioStationAboveMax() {
        Radio rad = new Radio();
        rad.setNumberCurrentRadioStation(10);

        int expected = 0;
        int actual = rad.getNumberCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetNumberRadioStationBelowMin() {
        Radio rad = new Radio();
        rad.setNumberCurrentRadioStation(-1);

        int expected = 0;
        int actual = rad.getNumberCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToNextNumberARadioStation() {
        Radio rad = new Radio();
        rad.setNumberCurrentRadioStation(1);
        rad.setNextNumberRadioStation();


        int expected = 2;
        int actual = rad.getNumberCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToPrevNumberARadioStation() {
        Radio rad = new Radio();
        rad.setNumberCurrentRadioStation(3);
        rad.setPrevNumberRadioStation();

        int expected = 2;
        int actual = rad.getNumberCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCheckTheLargestBorderStation1() {
        Radio rad = new Radio();
        rad.setNumberCurrentRadioStation(9);
        rad.setNextNumberRadioStation();

        int expected = 0;
        int actual = rad.getNumberCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCheckTheLargestBorderStation2() {
        Radio rad = new Radio();
        rad.setNumberCurrentRadioStation(10);
        rad.setNextNumberRadioStation();

        int expected = 1;
        int actual = rad.getNumberCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCheckTheSmallestBorderStation1() {
        Radio rad = new Radio();
        rad.setNumberCurrentRadioStation(0);
        rad.setPrevNumberRadioStation();

        int expected = 9;
        int actual = rad.getNumberCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCheckTheSmallestBorderStation2() {
        Radio rad = new Radio();
        rad.setNumberCurrentRadioStation(-1);
        rad.setPrevNumberRadioStation();

        int expected = 9;
        int actual = rad.getNumberCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMaxVolume() {
        Radio rad = new Radio();
        rad.setToMaxVolume();

        int expected = 10;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMinVolume() {
        Radio rad = new Radio();
        rad.setToMinVolume();

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetIncreaseVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(9);
        rad.setIncreaseVolume();

        int expected = 10;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetTurnDownTheVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(1);
        rad.setTurnDownTheVolume();

        int expected = 0;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeAboveMax() {
        Radio rad = new Radio();
        rad.setCurrentVolume(11);

        int expected = 0;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeBelowMin() {
        Radio rad = new Radio();
        rad.setCurrentVolume(-1);

        int expected = 0;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCheckTheSmallestBorderVolume1() {
        Radio rad = new Radio();
        rad.setCurrentVolume(0);
        rad.setTurnDownTheVolume();

        int expected = 0;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCheckTheSmallestBorderVolume2() {
        Radio rad = new Radio();
        rad.setCurrentVolume(-1);
        rad.setTurnDownTheVolume();

        int expected = 0;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCheckTheLargestBorderVolume1() {
        Radio rad = new Radio();
        rad.setCurrentVolume(10);
        rad.setIncreaseVolume();

        int expected = 10;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCheckTheLargestBorderVolume2() {
        Radio rad = new Radio();
        rad.setCurrentVolume(11);
        rad.setIncreaseVolume();

        int expected = 1;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

}


