package ru.netology.radio;

public class Radio {
    private int numberCurrentRadioStation;
    private int currentVolume;

    public int getNumberCurrentRadioStation() {

        return numberCurrentRadioStation;
    }

    public void setNumberCurrentRadioStation(int numberCurrentRadioStation) {

        if (numberCurrentRadioStation < 0 || numberCurrentRadioStation > 9) {
            return;
        }

        this.numberCurrentRadioStation = numberCurrentRadioStation;

    }

    public void setNextNumberRadioStation() {

        if (numberCurrentRadioStation >= 9) {
            setNumberCurrentRadioStation(0);
        } else {
            setNumberCurrentRadioStation(numberCurrentRadioStation + 1);
        }
    }


    public void setPrevNumberRadioStation() {

        if (numberCurrentRadioStation <= 0) {
            setNumberCurrentRadioStation(9);
        } else {
            setNumberCurrentRadioStation(numberCurrentRadioStation - 1);
        }
    }

    public void setToMaxNumberRadioStation() {
        numberCurrentRadioStation = 9;
    }

    public void setToMinNumberRadioStation() {
        numberCurrentRadioStation = 0;
    }


    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {

        if (currentVolume > 10 || currentVolume < 0) {
            return;
        }

        this.currentVolume = currentVolume;
    }

    public void setIncreaseVolume() {

        if (currentVolume < 10) {
            currentVolume++;
        }
    }

    public void setTurnDownTheVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }

    public void setToMaxVolume() {
        currentVolume = 10;
    }

    public void setToMinVolume() {
        currentVolume = 0;
    }
}