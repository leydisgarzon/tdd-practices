package org.tdd.example.cab.controllers;

public class StatementGenerator {

    public float calculateJournalFare(float kilometers, float minutes) {
        return kilometers * 10 + minutes;
    }
}
