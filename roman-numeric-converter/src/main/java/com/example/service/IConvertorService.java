package com.example.service;

public interface IConvertorService {
    /**
     * Convert an arabic number to a roman number.
     * @param arabicNumber arabic number
     * @return roman number
     */
    String convert(Integer arabicNumber);
}
