package ru.netology;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Radio {

    private int currentStation;
    private int currentVolume;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int maxStation = 10;
    private int minStation = 0;
    private int stationAtTheMomentOfSwitchingOn = 10;
    private boolean on;
    private String name;


    public void setCurrentStation(int station) {
        if (station > maxStation) {
            return;
        }
        if (station < minStation) {
            return;
        }
        this.currentStation = station;
    }

    public void nextStation() {
        int nextStation = currentStation + 1;
        if (nextStation > maxStation) {
            this.currentStation = minStation;
        } else {
            this.currentStation = nextStation;
        }
    }

    public void previousStation() {
        int prevStation = currentStation - 1;
        if (prevStation < minStation) {
            this.currentStation = maxStation;
        } else {
            this.currentStation = prevStation;
        }
    }

    public void setCurrentVolume(int volume) {
        if (volume > maxVolume) {
            return;
        }
        if (volume < minVolume) {
            return;
        }
        this.currentVolume = volume;
    }

    public void increaseCurrentVolume() {
        int nextVolume = currentVolume + 1;
        if (nextVolume > maxVolume) {
            return;
        }
        this.currentVolume = nextVolume;
    }

    public void decreaseCurrentVolume() {
        int prevVolume = currentVolume - 1;
        if (prevVolume < minVolume) {
            return;
        }
        this.currentVolume = prevVolume;
    }
}







