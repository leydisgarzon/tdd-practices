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
        if(arabicNumber == 4) {
            romanNumber = "IV";
        } else {
            while (arabicNumber-- > 0) {
                romanNumber = romanNumber.concat("I");
            }
        }
        return romanNumber;
    }
}
