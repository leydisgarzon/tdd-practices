package org.tdd.example.cab;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StatementGeneratorTestJunit4 {
    @Test
    public void noDistanceAndNoTime() {
        StatementGenerator statementGenerator = new StatementGenerator();
        float fare = statementGenerator.calculateJournalFare(0, 0);
        Assert.assertEquals(0, fare,0.01);
    }

    @Test
    public void fareForNoDistanceAndAnyTime() {
        StatementGenerator statementGenerator = new StatementGenerator();
        float fare = statementGenerator.calculateJournalFare(0, 15);
        Assert.assertEquals(15, fare,0);
    }
}