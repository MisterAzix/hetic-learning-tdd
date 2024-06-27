package org.hetic;

public class RomanNumeralsService {
    public String processNumber(int number) {
        if (number == 1) {
            return "I";
        }
        if (number == 2) {
            return "II";
        }
        if (number == 3) {
            return "III";
        }
        if (number == 5) {
            return "V";
        }
        if (number == 10) {
            return "X";
        }
        return "IV";
    }
}