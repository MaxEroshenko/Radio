package ru.netology;

public class Radio {
    private int station;
    private int volume;
    private int minVolume;
    private int maxVolume;
    private int minStation;
    private int maxStation;
    private boolean on;
    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCurrentStation() {
        return station;
    }

    public void setCurrentStation(int station) {
        if (station > maxStation) {
            return;
        }
        if (station < minStation) {
            return;
        }
        this.station = station;
    }

    public void nextStation() {
        int nextStation = station + 1;
        if (nextStation > maxStation) {
            this.station = minStation;
        } else {
            this.station = nextStation;
        }
    }

    public void previousStation() {
        int prevStation = station - 1;
        if (prevStation < minStation) {
            this.station = maxStation;
        } else {
            this.station = prevStation;
        }
    }

    public int getMaxStation() {
        return maxStation;
    }

    public void setMaxStation(int maxStation) {
        this.maxStation = maxStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public void setMinStation(int minStation) {
        this.minStation = minStation;
    }

    public int getCurrentVolume() {
        return volume;
    }

    public void setCurrentVolume(int volume) {
        if (volume > maxVolume) {
            return;
        }
        if (volume < minVolume) {
            return;
        }
        this.volume = volume;
    }

    public void increaseCurrentVolume() {
        int nextVolume = volume + 1;
        if (nextVolume > maxVolume) {
            return;
        }
        this.volume = nextVolume;
    }

    public void decreaseCurrentVolume() {
        int prevVolume = volume - 1;
        if (prevVolume < minVolume) {
            return;
        }
        this.volume = prevVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }
}
