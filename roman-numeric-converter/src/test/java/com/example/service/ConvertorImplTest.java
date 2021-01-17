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

}