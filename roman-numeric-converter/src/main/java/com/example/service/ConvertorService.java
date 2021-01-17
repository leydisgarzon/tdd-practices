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
        if (arabicNumber == 4) {
            romanNumber = "IV";
        } else if (arabicNumber >= 5) {
            romanNumber = "V";
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
