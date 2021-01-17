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
            romanNumber = "X";
            if (arabicNumber == 9) {
                romanNumber = "I".concat(romanNumber);
            }
            while (arabicNumber-- > 10) {
                romanNumber = romanNumber.concat("I");
            }
        } else if (arabicNumber >= 4) {
            romanNumber = "V";
            if (arabicNumber == 4) {
                romanNumber = "I".concat(romanNumber);
            }
            while (arabicNumber-- > 5) {
                romanNumber = romanNumber.concat("I");
            }
        } else {
            while (arabicNumber-- > 0) {
                romanNumber = romanNumber.concat("I");
            }
        }
        return romanNumber;
    }
}
