package Методичка_JAVA;
import java.util.Scanner;

public class Zadacha_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        String inputString = scanner.nextLine();

        System.out.println("Вы ввели следующую строку: " + inputString);

        char[] array = inputString.toCharArray();
        char[] array2 = new char[array.length];

        for (int i = 0; i < array.length; i++) {
            array2[i] = array[array.length - 1 - i];
        }
        System.out.print("Строка наоборот: ");
        for (char ch : array2) {
            System.out.print(ch + "");

        }
    }
}