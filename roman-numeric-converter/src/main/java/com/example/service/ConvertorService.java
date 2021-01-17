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
        if (arabicNumber >= 9) {
            romanNumber = transformRepetitiveNumbers(arabicNumber, "X", 10);
        } else if (arabicNumber >= 4) {
            romanNumber = transformRepetitiveNumbers(arabicNumber, "V", 5);
        } else {
            while (arabicNumber-- > 0) {
                romanNumber = romanNumber.concat("I");
            }
        }
        return romanNumber;
    }

    private String transformRepetitiveNumbers(int arabicNumber, String x, int i) {
        String romanNumber;
        romanNumber = x;
        if (arabicNumber == i-1) {
            romanNumber = "I".concat(romanNumber);
        }
        while (arabicNumber-- > i) {
            romanNumber = romanNumber.concat("I");
        }
        return romanNumber;
    }
}
