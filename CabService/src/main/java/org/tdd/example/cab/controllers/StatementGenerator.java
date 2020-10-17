package org.tdd.example.cab.controllers;

import org.tdd.example.cab.dtos.Ride;
import org.tdd.example.cab.exceptions.CabException;

import java.util.List;

public class StatementGenerator {

    public static final int FARE_PER_KILOMETERS = 10;
    public static final int FARE_PER_MINUTES = 1;

    public float calculateJournalFare(List<Ride> rides) {
        float fare = 0;
        for(Ride ride : rides) {
            if (ride.getKilometers() < 0 || ride.getMinutes() < 0) {
                throw new CabException("Distance or time can't be negative.");
            }
            if (ride.getMinutes() == 0 && ride.getKilometers() != 0) {
                throw new CabException("Time must be greater than zero.");
            }
            fare += ride.getKilometers() * FARE_PER_KILOMETERS + ride.getMinutes() * FARE_PER_MINUTES;
        }
        return fare;
    }
}
