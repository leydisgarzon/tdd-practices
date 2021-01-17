package com.example.enums;

import lombok.Getter;

@Getter
public enum RomanSymbols {
     
    TEN(10,"X"),
    FIVE(5,"V"),
    ONE(1,"I");

    private final int arabicNumber;
    private final String romanSymbol;

    RomanSymbols(int arabicNumber, String romanSymbol) {
        this.arabicNumber = arabicNumber;
        this.romanSymbol = romanSymbol;
    }
}
