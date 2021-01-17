package com.example.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
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

    @Test
    void oneShouldReturnI() {
        System.out.println(convertorService);
        String romanNumber = convertorService.convert(1);
        Assertions.assertEquals("I",romanNumber);
    }

    @Test
    void twoShouldReturnII() {
        System.out.println(convertorService);
        String romanNumber = convertorService.convert(2);
        Assertions.assertEquals("II",romanNumber);
    }

}