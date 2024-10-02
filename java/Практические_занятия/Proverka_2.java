package Практические_занятия;

public class Proverka_2 {
    public static void main(String[] args) {

        Z_1 promt1 = new Z_1(12321);
        // Проверяем, является ли number палиндромом и выводим результат
        System.out.println("Является ли число полиномом: " + promt1.isPalindrome());
        // Выводим сумму всех цифр number
        System.out.println("Сумма цифр в числе: " + promt1.sumOfNumbers());


        Z_1 promt2 = new Z_1(123456);
        // Проверяем, является ли новое значение number палиндромом и выводим результат
        System.out.println("Является ли число полиномом: " + promt2.isPalindrome());
        // Выводим сумму всех цифр нового значения number
        System.out.println("Сумма цифр в числе: " + promt2.sumOfNumbers());
    }
}
