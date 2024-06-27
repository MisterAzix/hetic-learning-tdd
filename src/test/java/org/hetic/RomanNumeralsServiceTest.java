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
}