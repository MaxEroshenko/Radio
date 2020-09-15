package ru.netology;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio radio = new Radio();
    @Test
    public void desiredStation() {
        radio.setCurrentStation(2);
        assertEquals(2, radio.getCurrentStation());
    }

    @Test
    public void maximumStation() {
        radio.setCurrentStation(0);
        assertEquals(10, radio.getMaxStation());
    }

    @Test
    public void noStationChangePlus() {
        radio.setCurrentStation(11);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void withoutChangingStationMinus() {
        radio.setCurrentStation(-1);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void minimumStation() {
        radio.setCurrentStation(9);
        assertEquals(0, radio.getMinStation());
    }

    @Test
    public void stationIncrease() {
        radio.setCurrentStation(4);
        radio.nextStation();
        assertEquals(5, radio.getCurrentStation());
    }

    @Test
    public void decreaseStation() {
        radio.setCurrentStation(9);
        radio.previousStation();
        assertEquals(8, radio.getCurrentStation());
    }

    @Test
    public void withoutIncreasingTheStation() {
        radio.setCurrentStation(10);
        radio.nextStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void withoutStationDescent() {
        radio.setCurrentStation(0);
        radio.previousStation();
        assertEquals(10, radio.getCurrentStation());
    }

    @Test
    public void moreMaximum() {
        radio.setCurrentVolume(101);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void belowTheMinimum() {
        radio.setCurrentVolume(-1);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetVolume() {
        radio.setCurrentVolume(56);
        assertEquals(56, radio.getCurrentVolume());
    }

    @Test
    public void volumeIncrease() {
        radio.setCurrentVolume(34);
        radio.increaseCurrentVolume();
        assertEquals(35, radio.getCurrentVolume());
    }

    @Test
    public void withoutIncreasingTheVolume() {
        radio.setCurrentVolume(100);
        radio.increaseCurrentVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void decreaseVolumeByOne() {
        radio.setCurrentVolume(100);
        radio.decreaseCurrentVolume();
        assertEquals(99, radio.getCurrentVolume());
    }

    @Test
    public void withoutDecreasingDown() {
        radio.setCurrentVolume(0);
        radio.decreaseCurrentVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void maximumVolumeIcrease() {
        radio.setCurrentVolume(0);
        assertEquals(100, radio.getMaxVolume());
    }

    @Test
    public void minimumVolumeReduction() {
        radio.setCurrentVolume(100);
        assertEquals(0, radio.getMinVolume());
    }
}