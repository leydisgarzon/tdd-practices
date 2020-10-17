package org.tdd.example.cab.dtos;

public class Ride {
    private float kilometers;
    private float minutes;

    public Ride(float kilometers, float minutes) {
        this.kilometers = kilometers;
        this.minutes = minutes;
    }

    public float getKilometers() {
        return kilometers;
    }

    public void setKilometers(float kilometers) {
        this.kilometers = kilometers;
    }

    public float getMinutes() {
        return minutes;
    }

    public void setMinutes(float minutes) {
        this.minutes = minutes;
    }
}
