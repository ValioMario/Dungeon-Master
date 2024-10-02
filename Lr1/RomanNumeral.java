package Lr1;

import java.util.HashMap;
import java.util.Map;

public class RomanNumeral {
    private static final Map<Character, Integer> romanToArabic = new HashMap<>();

    static {
        romanToArabic.put('I', 1);
        romanToArabic.put('V', 5);
        romanToArabic.put('X', 10);
    }

    public static int romanToArabic(String roman) {
        int result = 0;
        int prevValue = 0;
        for (int i = roman.length() - 1; i >= 0; i--) {
            int value = romanToArabic.get(roman.charAt(i));
            if (value < prevValue) {
                result -= value;
            } else {
                result += value;
            }
            prevValue = value;
        }
        return result;
    }

    public static String arabicToRoman(int arabic) {
        if (arabic == 100){
            return "C";
        }
        String numberString = String.valueOf(arabic);
        char[][] numberArray = new char[2][1];
        for (int i = 0; i < numberString.length(); i++) {
            numberArray[i][0] = numberString.charAt(numberString.length() - 1 - i);
        }
        String[][] romanSymbols = {
                {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"}, // Единицы
                {"X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"}  // Десятки
        };
        StringBuilder roman = new StringBuilder();
        for (int i = numberArray.length - 1; i >= 0; i--) {
            int digit = Character.getNumericValue(numberArray[i][0]);
            if (digit > 0) {
                roman.append(romanSymbols[i][digit - 1]);
            }
        }

        return roman.toString();
    }
}