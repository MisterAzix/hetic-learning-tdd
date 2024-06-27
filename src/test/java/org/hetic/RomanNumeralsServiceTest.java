package org.hetic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanNumeralsServiceTest {

    private final RomanNumeralsService romanNumeralsService;

    RomanNumeralsServiceTest() {
        romanNumeralsService = new RomanNumeralsService();
    }

    @Test
    void should_return_I_when_number_is_1() {
        // Given
        int number = 1;

        // When
        String result = romanNumeralsService.processNumber(number);

        // Then
        assertEquals("I", result);
    }

    @Test
    void should_return_V_when_number_is_5() {
        // Given
        int number = 5;

        // When
        String result = romanNumeralsService.processNumber(number);

        // Then
        assertEquals("V", result);
    }

    @Test
    void should_return_X_when_number_is_10() {
        // Given
        int number = 10;

        // When
        String result = romanNumeralsService.processNumber(number);

        // Then
        assertEquals("X", result);
    }

    @Test
    void should_return_II_when_number_is_2() {
        // Given
        int number = 2;

        // When
        String result = romanNumeralsService.processNumber(number);

        // Then
        assertEquals("II", result);
    }

    @Test
    void should_return_III_when_number_is_3() {
        // Given
        int number = 3;

        // When
        String result = romanNumeralsService.processNumber(number);

        // Then
        assertEquals("III", result);
    }

    @Test
    void should_return_IV_when_number_is_4() {
        // Given
        int number = 4;

        // When
        String result = romanNumeralsService.processNumber(number);

        // Then
        assertEquals("IV", result);
    }
}