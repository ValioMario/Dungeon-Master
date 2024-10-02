package Методичка_JAVA;
import java.util.Scanner;
import java.util.Arrays;

public class Zadacha_8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        String inputString = scanner.nextLine();

        System.out.println("Вы ввели следующую строку: " + inputString);

        char[] array1 = inputString.toCharArray();
        char[] array2 = new char[array1.length];

        for (int i = 0; i < array1.length; i++) {
            array2[i] = array1[array1.length - 1 - i];
        }
        if (Arrays.toString(array1).equals(Arrays.toString(array2))) {
            System.out.println("Введённая строка является палиндромом");
        } else {
            System.out.println("Введённая строка НЕ ЯВЛЯЕТСЯ палиндромом");
        }
    }
}

