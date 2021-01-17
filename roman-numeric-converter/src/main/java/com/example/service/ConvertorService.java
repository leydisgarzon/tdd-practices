package com.example.service;

import org.springframework.stereotype.Component;

@Component
public class ConvertorService implements IConvertorService {
    /**
     * {@inheritDoc}
     */
    @Override
    public String convert(int arabicNumber) {
        String romanNumber = "";
        while (arabicNumber-- > 0) {
            romanNumber = romanNumber.concat("I");
        }
        return romanNumber;
    }
}
