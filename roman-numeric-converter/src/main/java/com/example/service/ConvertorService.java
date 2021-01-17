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
        } else if (arabicNumber > 0){
            romanNumber = transformRepetitiveNumbers(arabicNumber, "I", 1);
        }
        return romanNumber;
    }

    private String transformRepetitiveNumbers(int arabicNumber, String symbol, int number) {
        String romanNumber = symbol;
        if (arabicNumber == number-1) {
            romanNumber = "I".concat(romanNumber);
        }
        while (arabicNumber-- > number) {
            romanNumber = romanNumber.concat("I");
        }
        return romanNumber;
    }
}
