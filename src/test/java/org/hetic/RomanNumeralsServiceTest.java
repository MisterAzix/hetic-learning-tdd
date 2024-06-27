package org.hetic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanNumeralsServiceTest {

    private final RomanNumeralsService romanNumeralsService;

    RomanNumeralsServiceTest() {
        romanNumeralsService = new RomanNumeralsService();
    }

    @Test
    void processNumber() {
        // Given
        int number = 1;

        // When
        String result = romanNumeralsService.processNumber(number);

        // Then
        assertEquals("I", result);
    }
}