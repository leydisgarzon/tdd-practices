package org.tdd.example.cab.controllers;

import org.tdd.example.cab.exceptions.CabException;

public class StatementGenerator {

    public static final int FARE_PER_KILOMETERS = 10;
    public static final int FARE_PER_MINUTES = 1;

    public float calculateJournalFare(float kilometers, float minutes) {
        if (kilometers < 0 || minutes < 0) {
            throw new CabException("Distance or time can't be negative.");
        }
        if (minutes == 0 && kilometers != 0) {
            throw new CabException("Time must be greater than zero.");
        }
        return kilometers * FARE_PER_KILOMETERS + minutes * FARE_PER_MINUTES;
    }
}
