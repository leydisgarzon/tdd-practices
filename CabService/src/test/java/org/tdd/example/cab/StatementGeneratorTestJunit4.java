package org.tdd.example.cab;

/*import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.tdd.example.cab.controllers.StatementGenerator;
import org.tdd.example.cab.exceptions.CabException;*/

public class StatementGeneratorTestJunit4 {
    /*@Rule
    public ExpectedException exceptionRule = ExpectedException.none();

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

    @Test
    public void fareForAnyDistanceAndAnyTime() {
        StatementGenerator statementGenerator = new StatementGenerator();
        float fare = statementGenerator.calculateJournalFare(25, 12);
        Assert.assertEquals(262, fare,0);
    }

    //test an exception with junit 4
    @Test
    public void exceptionForAnyDistanceAndZeroTime() {
        exceptionRule.expect(CabException.class);
        exceptionRule.expectMessage("Time must be greater than zero.");
        StatementGenerator statementGenerator = new StatementGenerator();
        float fare = statementGenerator.calculateJournalFare(25, 0);
    }

    @Test
    public void exceptionForNegativeTime() {
        exceptionRule.expect(CabException.class);
        exceptionRule.expectMessage("Distance or time can't be negative.");
        StatementGenerator statementGenerator = new StatementGenerator();
        statementGenerator.calculateJournalFare(18, -21);
    }

    @Test
    public void exceptionForNegativeDistance() {
        exceptionRule.expect(CabException.class);
        exceptionRule.expectMessage("Distance or time can't be negative.");
        StatementGenerator statementGenerator = new StatementGenerator();
        statementGenerator.calculateJournalFare(-18, 21);
    }

    @Test
    public void exceptionForBothValuesNegative() {
        exceptionRule.expect(CabException.class);
        exceptionRule.expectMessage("Distance or time can't be negative.");
        StatementGenerator statementGenerator = new StatementGenerator();
        statementGenerator.calculateJournalFare(-18, -21);
    }*/

}