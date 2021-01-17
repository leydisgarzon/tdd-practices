package com.example.enums;

import lombok.Getter;

@Getter
public enum RomanSymbols {
     
    TEN(10,"X"),
    NINE(9,"IX"),
    FIVE(5,"V"),
    FOUR(4,"IV"),
    ONE(1,"I");

    private final int arabicNumber;
    private final String romanSymbol;

    RomanSymbols(int arabicNumber, String romanSymbol) {
        this.arabicNumber = arabicNumber;
        this.romanSymbol = romanSymbol;
    }
}
