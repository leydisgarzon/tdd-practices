package com.example.service;

import com.example.enums.RomanSymbols;
import org.springframework.stereotype.Component;

@Component
public class ConvertorService implements IConvertorService {
    /**
     * {@inheritDoc}
     */
    @Override
    public String convert(int arabicNumber) {
        String romanNumber = "";
        if (arabicNumber > 0) {
            for (RomanSymbols romanSymbols : RomanSymbols.values()) {
                if (arabicNumber >= romanSymbols.getArabicNumber()) {
                    romanNumber = transformRepetitiveNumbers(arabicNumber, romanSymbols.getRomanSymbol(), romanSymbols.getArabicNumber());
                    break;
                }
            }
        }
        return romanNumber;
    }

    private String transformRepetitiveNumbers(int arabicNumber, String symbol, int number) {
        String romanNumber = symbol;
        while (arabicNumber-- > number) {
            romanNumber = romanNumber.concat("I");
        }
        return romanNumber;
    }
}
