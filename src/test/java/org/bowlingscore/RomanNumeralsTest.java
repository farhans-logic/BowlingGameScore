package org.bowlingscore;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanNumeralsTest {

    @Test
    void checkDecimalToRomanCoverts100() {
        //Arrange
        final int INPUT_DECIMAL = 100;
        final String EXPECTED = "C";
        // Act
        RomanNumerals romanNumerals = new RomanNumerals();
        //Assert
        assertEquals(EXPECTED,romanNumerals.decimalToRoman(INPUT_DECIMAL));
    }

    @Test
    void checkDecimalToRomanCoverts3000() {
        //Arrange
        final int INPUT_DECIMAL = 3000;
        final String EXPECTED = "MMM";
        // Act
        RomanNumerals romanNumerals = new RomanNumerals();
        //Assert
        assertEquals(EXPECTED,romanNumerals.decimalToRoman(INPUT_DECIMAL));
    }

    @Test
    void checkDecimalToRomanCoverts444() {
        //Arrange
        final int INPUT_DECIMAL = 444;
        final String EXPECTED = "CDXLIV";
        // Act
        RomanNumerals romanNumerals = new RomanNumerals();
        //Assert
        assertEquals(EXPECTED,romanNumerals.decimalToRoman(INPUT_DECIMAL));
    }

    @Test
    void checkDecimalToRomanCoverts9() {
        //Arrange
        final int INPUT_DECIMAL = 9;
        final String EXPECTED = "IX";
        // Act
        RomanNumerals romanNumerals = new RomanNumerals();
        //Assert
        assertEquals(EXPECTED,romanNumerals.decimalToRoman(INPUT_DECIMAL));
    }

    @Test
    void checkDecimalToRomanCoverts1111() {
        //Arrange
        final int INPUT_DECIMAL = 1111;
        final String EXPECTED = "MCXI";
        // Act
        RomanNumerals romanNumerals = new RomanNumerals();
        //Assert
        assertEquals(EXPECTED,romanNumerals.decimalToRoman(INPUT_DECIMAL));
    }
}