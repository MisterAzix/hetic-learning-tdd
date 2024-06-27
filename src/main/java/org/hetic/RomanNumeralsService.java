package org.hetic;

import java.util.LinkedHashMap;
import java.util.Map;

public class RomanNumeralsService {
    private static final Map<Integer, String> romanNumerals = new LinkedHashMap<>();

    static {
        romanNumerals.put(1000, "M");
        romanNumerals.put(500, "D");
        romanNumerals.put(100, "C");
        romanNumerals.put(90, "XC");
        romanNumerals.put(50, "L");
        romanNumerals.put(10, "X");
        romanNumerals.put(9, "IX");
        romanNumerals.put(5, "V");
        romanNumerals.put(4, "IV");
        romanNumerals.put(1, "I");
    }

    public String processNumber(int number) {
        StringBuilder result = new StringBuilder();
        for (Map.Entry<Integer, String> entry : romanNumerals.entrySet()) {
            while (number >= entry.getKey()) {
                result.append(entry.getValue());
                number -= entry.getKey();
            }
        }
        return result.toString();
    }
}