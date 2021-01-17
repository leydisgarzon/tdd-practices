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
        return romanNumber;
    }
}
