package org.tdd.example.cab;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.tdd.example.cab.controllers.StatementGenerator;
import org.tdd.example.cab.dtos.Ride;
import org.tdd.example.cab.exceptions.CabException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class StatementGeneratorTestJunit5 {

    @Test
    void noDistanceAndNoTime() {
        StatementGenerator statementGenerator = new StatementGenerator();
        Ride ride = new Ride(0,0);
        float fare = statementGenerator.calculateJournalFare(Collections.singletonList(ride));
        Assertions.assertEquals(0, fare,0.01);
    }

    @Test
    void fareForNoDistanceAndAnyTime() {
        StatementGenerator statementGenerator = new StatementGenerator();
        Ride ride = new Ride(0, 15);
        float fare = statementGenerator.calculateJournalFare(Collections.singletonList(ride));
        Assertions.assertEquals(15, fare,0);
    }

    @Test
    void fareForAnyDistanceAndAnyTime() {
        StatementGenerator statementGenerator = new StatementGenerator();
        Ride ride = new Ride(25, 12);
        float fare = statementGenerator.calculateJournalFare(Collections.singletonList(ride));
        Assertions.assertEquals(262, fare,0);
    }

    @Test
    void exceptionForAnyDistanceAndZeroTime() {
        StatementGenerator statementGenerator = new StatementGenerator();
        Ride ride = new Ride(25, 0);
        List<Ride> rides = Collections.singletonList(ride);
        Exception exception = Assertions.assertThrows(CabException.class, () -> statementGenerator.calculateJournalFare(rides));
        String expectedMessage = "Time must be greater than zero.";
        String actualMessage = exception.getMessage();
        Assertions.assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    void exceptionForNegativeTime() {
        StatementGenerator statementGenerator = new StatementGenerator();
        Ride ride = new Ride(18, -21);
        List<Ride> rides = Collections.singletonList(ride);
        Exception exception = Assertions.assertThrows(CabException.class, () -> statementGenerator.calculateJournalFare(rides));
        String expectedMessage = "Distance or time can't be negative.";
        String actualMessage = exception.getMessage();
        Assertions.assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    void exceptionForNegativeDistance() {
        StatementGenerator statementGenerator = new StatementGenerator();
        Ride ride = new Ride(-18, 21);
        List<Ride> rides = Collections.singletonList(ride);
        Exception exception = Assertions.assertThrows(CabException.class, () -> statementGenerator.calculateJournalFare(rides));
        String expectedMessage = "Distance or time can't be negative.";
        String actualMessage = exception.getMessage();
        Assertions.assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    void exceptionForBothValuesNegative() {
        StatementGenerator statementGenerator = new StatementGenerator();
        Ride ride = new Ride(-18, -21);
        List<Ride> rides = Collections.singletonList(ride);
        Exception exception = Assertions.assertThrows(CabException.class, () -> statementGenerator.calculateJournalFare(rides));
        String expectedMessage = "Distance or time can't be negative.";
        String actualMessage = exception.getMessage();
        Assertions.assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    void returnZeroForEmptyRidesList() {
        StatementGenerator statementGenerator = new StatementGenerator();
        float fare = statementGenerator.calculateJournalFare(Collections.emptyList());
        Assertions.assertEquals(0, fare,0.01);
    }

    @Test
    void returnFareForMoreThanOneRide() {
        StatementGenerator statementGenerator = new StatementGenerator();
        List<Ride> rides = new ArrayList<>();
        rides.add(new Ride(10, 30));
        rides.add(new Ride(5, 20));
        float fare = statementGenerator.calculateJournalFare(rides);
        Assertions.assertEquals(200, fare,0.01);
    }
}