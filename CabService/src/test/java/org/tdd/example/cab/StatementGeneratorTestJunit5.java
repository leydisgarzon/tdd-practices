package org.tdd.example.cab;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.tdd.example.cab.controllers.StatementGenerator;
import org.tdd.example.cab.exceptions.CabException;

class StatementGeneratorTestJunit5 {

    @Test
    void noDistanceAndNoTime() {
        StatementGenerator statementGenerator = new StatementGenerator();
        float fare = statementGenerator.calculateJournalFare(0, 0);
        Assertions.assertEquals(0, fare,0.01);
    }

    @Test
    void fareForNoDistanceAndAnyTime() {
        StatementGenerator statementGenerator = new StatementGenerator();
        float fare = statementGenerator.calculateJournalFare(0, 15);
        Assertions.assertEquals(15, fare,0);
    }

    @Test
    void fareForAnyDistanceAndAnyTime() {
        StatementGenerator statementGenerator = new StatementGenerator();
        float fare = statementGenerator.calculateJournalFare(25, 12);
        Assertions.assertEquals(262, fare,0);
    }

    @Test
    void exceptionForAnyDistanceAndZeroTime() {
        StatementGenerator statementGenerator = new StatementGenerator();
        Exception exception = Assertions.assertThrows(CabException.class, () -> {
            statementGenerator.calculateJournalFare(25, 0);
        });
        String expectedMessage = "Time must be greater than zero.";
        String actualMessage = exception.getMessage();
        Assertions.assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    void exceptionForNegativeTime() {
        StatementGenerator statementGenerator = new StatementGenerator();
        Exception exception = Assertions.assertThrows(CabException.class, () -> {
            statementGenerator.calculateJournalFare(18, -21);
        });
        String expectedMessage = "Distance or time can't be negative.";
        String actualMessage = exception.getMessage();
        Assertions.assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    void exceptionForNegativeDistance() {
        StatementGenerator statementGenerator = new StatementGenerator();
        Exception exception = Assertions.assertThrows(CabException.class, () -> {
            statementGenerator.calculateJournalFare(-18, 21);
        });
        String expectedMessage = "Distance or time can't be negative.";
        String actualMessage = exception.getMessage();
        Assertions.assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    void exceptionForBothValuesNegative() {
        StatementGenerator statementGenerator = new StatementGenerator();
        Exception exception = Assertions.assertThrows(CabException.class, () -> {
            statementGenerator.calculateJournalFare(-18, -21);
        });
        String expectedMessage = "Distance or time can't be negative.";
        String actualMessage = exception.getMessage();
        Assertions.assertTrue(actualMessage.contains(expectedMessage));
    }

}