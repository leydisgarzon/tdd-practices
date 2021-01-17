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
        if(arabicNumber == 1){
            romanNumber = "I";
        }
        if(arabicNumber == 2){
            romanNumber = "II";
        }
        if(arabicNumber == 3){
            romanNumber = "III";
        }
        return romanNumber;
    }
}
