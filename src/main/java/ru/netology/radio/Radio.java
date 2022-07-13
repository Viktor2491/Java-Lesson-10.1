package ru.netology.radio;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class Radio {
    private int numberCurrentRadioStation;
    private int minNumberStation = 0;
    private int maxNumberStation = 9;
    private int countStation = 10;

    private int currentVolume;
    private int minVolue = 0;
    private int maxVolume = 100;


    public Radio(int countStation) {
        this.countStation = countStation;
    }


    public void setNumberCurrentRadioStation(int numberCurrentRadioStation) {

        if (numberCurrentRadioStation < minNumberStation || numberCurrentRadioStation > countStation - 1) {
            return;
        }

        this.numberCurrentRadioStation = numberCurrentRadioStation;

    }

    public void setNextNumberRadioStation() {

        if (numberCurrentRadioStation >= countStation - 1) {
            setNumberCurrentRadioStation(minNumberStation);
        } else {
            setNumberCurrentRadioStation(numberCurrentRadioStation + 1);
        }
    }


    public void setPrevNumberRadioStation() {

        if (numberCurrentRadioStation <= minNumberStation) {
            setNumberCurrentRadioStation(maxNumberStation);
        } else {
            setNumberCurrentRadioStation(numberCurrentRadioStation - 1);
        }
    }


    public void setCurrentVolume(int currentVolume) {

        if (currentVolume > maxVolume || currentVolume < minVolue) {
            return;
        }

        this.currentVolume = currentVolume;
    }

    public void setIncreaseVolume() {

        if (currentVolume < maxVolume) {
            currentVolume++;
        }
    }

    public void setTurnDownTheVolume() {
        if (currentVolume > minVolue) {
            currentVolume--;
        }
    }

}