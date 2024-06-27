package org.hetic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberValueObjectTest {
    @Test
    void should_return_I_when_number_is_1() {
        // Given
        int number = 1;
        NumberValueObject numberValueObject = new NumberValueObject(number);

        // When
        String result = numberValueObject.toRoman();

        // Then
        assertEquals("I", result);
    }

    @Test
    void should_return_V_when_number_is_5() {
        // Given
        int number = 5;
        NumberValueObject numberValueObject = new NumberValueObject(number);

        // When
        String result = numberValueObject.toRoman();

        // Then
        assertEquals("V", result);
    }

    @Test
    void should_return_X_when_number_is_10() {
        // Given
        int number = 10;
        NumberValueObject numberValueObject = new NumberValueObject(number);

        // When
        String result = numberValueObject.toRoman();

        // Then
        assertEquals("X", result);
    }

    @Test
    void should_return_II_when_number_is_2() {
        // Given
        int number = 2;
        NumberValueObject numberValueObject = new NumberValueObject(number);

        // When
        String result = numberValueObject.toRoman();

        // Then
        assertEquals("II", result);
    }

    @Test
    void should_return_III_when_number_is_3() {
        // Given
        int number = 3;
        NumberValueObject numberValueObject = new NumberValueObject(number);

        // When
        String result = numberValueObject.toRoman();

        // Then
        assertEquals("III", result);
    }

    @Test
    void should_return_IV_when_number_is_4() {
        // Given
        int number = 4;
        NumberValueObject numberValueObject = new NumberValueObject(number);

        // When
        String result = numberValueObject.toRoman();

        // Then
        assertEquals("IV", result);
    }

    @Test
    void should_return_VI_when_number_is_6() {
        // Given
        int number = 6;
        NumberValueObject numberValueObject = new NumberValueObject(number);

        // When
        String result = numberValueObject.toRoman();

        // Then
        assertEquals("VI", result);
    }

    @Test
    void should_return_VII_when_number_is_7() {
        // Given
        int number = 7;
        NumberValueObject numberValueObject = new NumberValueObject(number);

        // When
        String result = numberValueObject.toRoman();

        // Then
        assertEquals("VII", result);
    }

    @Test
    void should_return_VIII_when_number_is_8() {
        // Given
        int number = 8;
        NumberValueObject numberValueObject = new NumberValueObject(number);

        // When
        String result = numberValueObject.toRoman();

        // Then
        assertEquals("VIII", result);
    }

    @Test
    void should_return_IX_when_number_is_9() {
        // Given
        int number = 9;
        NumberValueObject numberValueObject = new NumberValueObject(number);

        // When
        String result = numberValueObject.toRoman();

        // Then
        assertEquals("IX", result);
    }

    @Test
    void should_return_XI_when_number_is_11() {
        // Given
        int number = 11;
        NumberValueObject numberValueObject = new NumberValueObject(number);

        // When
        String result = numberValueObject.toRoman();

        // Then
        assertEquals("XI", result);
    }

    @Test
    void should_return_L_when_number_is_50() {
        // Given
        int number = 50;
        NumberValueObject numberValueObject = new NumberValueObject(number);

        // When
        String result = numberValueObject.toRoman();

        // Then
        assertEquals("L", result);
    }

    @Test
    void should_return_C_when_number_is_100() {
        // Given
        int number = 100;
        NumberValueObject numberValueObject = new NumberValueObject(number);

        // When
        String result = numberValueObject.toRoman();

        // Then
        assertEquals("C", result);
    }

    @Test
    void should_return_XCIX_when_number_is_99() {
        // Given
        int number = 99;
        NumberValueObject numberValueObject = new NumberValueObject(number);

        // When
        String result = numberValueObject.toRoman();

        // Then
        assertEquals("XCIX", result);
    }

    @Test
    void should_return_D_when_number_is_500() {
        // Given
        int number = 500;
        NumberValueObject numberValueObject = new NumberValueObject(number);

        // When
        String result = numberValueObject.toRoman();

        // Then
        assertEquals("D", result);
    }

    @Test
    void should_return_M_when_number_is_1000() {
        // Given
        int number = 1000;
        NumberValueObject numberValueObject = new NumberValueObject(number);

        // When
        String result = numberValueObject.toRoman();

        // Then
        assertEquals("M", result);
    }

    @Test
    void should_return_MCMXCIV_when_number_is_1994() {
        // Given
        int number = 1994;
        NumberValueObject numberValueObject = new NumberValueObject(number);

        // When
        String result = numberValueObject.toRoman();

        // Then
        assertEquals("MCMXCIV", result);
    }

    @Test
    void should_return_CDXC_when_number_is_490() {
        // Given
        int number = 490;
        NumberValueObject numberValueObject = new NumberValueObject(number);

        // When
        String result = numberValueObject.toRoman();

        // Then
        assertEquals("CDXC", result);
    }

    @Test
    void should_throw_exception_when_number_is_0() {
        // Given
        int number = 0;
        NumberValueObject numberValueObject = new NumberValueObject(number);

        // When
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, numberValueObject::toRoman);

        // Then
        assertEquals("Conversion failed: Romans never discovered the number 0", exception.getMessage());
    }

    @Test
    void should_throw_exception_when_number_is_negative() {
        // Given
        int number = -1;
        NumberValueObject numberValueObject = new NumberValueObject(number);

        // When
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, numberValueObject::toRoman);

        // Then
        assertEquals("Conversion failed: Negative numbers do not exist in Roman numerals", exception.getMessage());
    }
}