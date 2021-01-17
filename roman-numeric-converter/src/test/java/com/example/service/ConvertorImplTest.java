package com.example.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ConvertorImplTest {
    @Autowired
    private IConvertorService convertorService;

    @Test
    void zeroShouldReturnEmptyString() {
        System.out.println(convertorService);
        String romanNumber = convertorService.convert(0);
        Assertions.assertEquals("",romanNumber);
    }

    @ParameterizedTest
    @CsvSource({"1,I", "2,II", "3,III"})
    void oneToThreeReturnCorrespondingAmountOfI(int arabicNumber, String expected) {
        System.out.println(convertorService);
        String romanNumber = convertorService.convert(arabicNumber);
        Assertions.assertEquals(expected,romanNumber);
    }

    @Test
    void fourShouldReturnIV() {
        System.out.println(convertorService);
        String romanNumber = convertorService.convert(4);
        Assertions.assertEquals("IV",romanNumber);
    }

    @Test
    void fiveShouldReturnV() {
        System.out.println(convertorService);
        String romanNumber = convertorService.convert(5);
        Assertions.assertEquals("V",romanNumber);
    }

    @ParameterizedTest
    @CsvSource({"6,VI", "7,VII", "8,VIII"})
    void sixToEightReturnCorrespondingAmountOfIAfterV(int arabicNumber, String expected) {
        System.out.println(convertorService);
        String romanNumber = convertorService.convert(arabicNumber);
        Assertions.assertEquals(expected,romanNumber);
    }

    @Test
    void nineShouldReturnIX() {
        System.out.println(convertorService);
        String romanNumber = convertorService.convert(9);
        Assertions.assertEquals("IX",romanNumber);
    }

    @Test
    void tenShouldReturnX() {
        System.out.println(convertorService);
        String romanNumber = convertorService.convert(10);
        Assertions.assertEquals("X",romanNumber);
    }
}