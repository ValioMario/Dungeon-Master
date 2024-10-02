package Lr1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите выражение Ваше выражение:");
        String expression = scanner.nextLine().trim();

        // Разделяем выражение на числа и операцию
        Pattern pattern = Pattern.compile("(\\d+|[IVXLCDM]+)\\s*([+\\-*/])\\s*(\\d+|[IVXLCDM]+)");
        Matcher matcher = pattern.matcher(expression);

        if (!matcher.matches()) {
            System.out.println("Неверный формат выражения.");
            return;
        }

        String num1Str = matcher.group(1);
        char operation = matcher.group(2).charAt(0);
        String num2Str = matcher.group(3);

        int num1 = NumberIdentifier.isArabicNumber(num1Str) ? Integer.parseInt(num1Str) : RomanNumeral.romanToArabic(num1Str);
        int num2 = NumberIdentifier.isArabicNumber(num2Str) ? Integer.parseInt(num2Str) : RomanNumeral.romanToArabic(num2Str);

        if (num1 < 1 || num1 > 10 || num2 < 1 || num2 > 10) {
            System.out.println("Вводимые числа должны быть в диапазоне от 1 до 10.");
            return;
        }

        Calculations calculator;
        if (NumberIdentifier.isArabicNumber(num1Str) && NumberIdentifier.isArabicNumber(num2Str)) {
            calculator = new ArabicCalcs(num1, num2);
        } else if (NumberIdentifier.isRomanNumber(num1Str) && NumberIdentifier.isRomanNumber(num2Str)) {
            calculator = new RomanCalcs(num1, num2);
        } else {
            System.out.println("Оба числа должны быть в одной системе счисления.");
            return;
        }

        int result = 0;
        switch (operation) {
            case '+':
                result = calculator.addition();
                break;
            case '-':
                result = calculator.subtraction();
                break;
            case '*':
                result = calculator.multiplication();
                break;
            case '/':
                result = calculator.division();
                break;
            default:
                System.out.println("Неверная операция.");
                return;
        }

        if (calculator instanceof RomanCalcs) {
            if (result > 0) {
                System.out.println("Результат: " + ((RomanCalcs) calculator).getRomanResult(result));
            } else {
                System.out.println("Результат не может быть представлен римскими цифрами.");
            }
        } else {
            System.out.println("Результат: " + result);
        }
    }
}