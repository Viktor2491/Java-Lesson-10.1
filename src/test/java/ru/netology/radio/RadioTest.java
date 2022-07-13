package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio rad = new Radio();

    @Test
    public void shouldCheckBeDefaultNumberARadioStation() {

        int expected = 0;
        int actual = rad.getNumberCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldInstallNumberARadioStation() {
        rad.setNumberCurrentRadioStation(1);
        int expected = 1;
        int actual = rad.getNumberCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldNotSetNumberRadioStationAboveMax() {
        rad.setNumberCurrentRadioStation(10);

        int expected = 0;
        int actual = rad.getNumberCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetNumberRadioStationBelowMin() {
        rad.setNumberCurrentRadioStation(-1);

        int expected = 0;
        int actual = rad.getNumberCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToNextNumberARadioStation() {
        rad.setNumberCurrentRadioStation(1);
        rad.setNextNumberRadioStation();

        int expected = 2;
        int actual = rad.getNumberCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToPrevNumberARadioStation() {
        rad.setNumberCurrentRadioStation(3);
        rad.setPrevNumberRadioStation();

        int expected = 2;
        int actual = rad.getNumberCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCheckTheLargestBorderStation1() {
        rad.setNumberCurrentRadioStation(9);
        rad.setNextNumberRadioStation();

        int expected = 0;
        int actual = rad.getNumberCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCheckTheLargestBorderStation2() {
        rad.setNumberCurrentRadioStation(10);
        rad.setNextNumberRadioStation();

        int expected = 1;
        int actual = rad.getNumberCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCheckTheLargestBorderStation3() {
        Radio rad = new Radio(10);
        rad.setNumberCurrentRadioStation(9);
        rad.setNextNumberRadioStation();

        int expected = 0;
        int actual = rad.getNumberCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCheckTheSmallestBorderStation1() {
        rad.setNumberCurrentRadioStation(0);
        rad.setPrevNumberRadioStation();

        int expected = 9;
        int actual = rad.getNumberCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCheckTheSmallestBorderStation2() {
        rad.setNumberCurrentRadioStation(-1);
        rad.setPrevNumberRadioStation();

        int expected = 9;
        int actual = rad.getNumberCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCheckBeDefaultVolume() {
        int expected = 0;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetIncreaseVolume() {
        rad.setCurrentVolume(9);
        rad.setIncreaseVolume();

        int expected = 10;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetTurnDownTheVolume() {
        rad.setCurrentVolume(1);
        rad.setTurnDownTheVolume();

        int expected = 0;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeAboveMax() {
        rad.setCurrentVolume(100);

        int expected = 100;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeBelowMin() {
        rad.setCurrentVolume(-1);

        int expected = 0;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCheckTheSmallestBorderVolume1() {
        rad.setCurrentVolume(0);
        rad.setTurnDownTheVolume();

        int expected = 0;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCheckTheSmallestBorderVolume2() {
        rad.setCurrentVolume(-1);
        rad.setTurnDownTheVolume();

        int expected = 0;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCheckTheLargestBorderVolume1() {
        rad.setCurrentVolume(100);
        rad.setIncreaseVolume();

        int expected = 100;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCheckTheLargestBorderVolume2() {
        rad.setCurrentVolume(101);
        rad.setIncreaseVolume();

        int expected = 1;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

}


