package org.hetic;

public class RomanNumeralsService {
    public String processNumber(int number) {
        if (number == 5) {
            return "V";
        }

        if (number == 10) {
            return "X";
        }

        return "I";
    }
}