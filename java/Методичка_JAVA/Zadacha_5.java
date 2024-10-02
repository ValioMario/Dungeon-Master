package Методичка_JAVA;
import java.util.Scanner;

public class Zadacha_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        String inputString = scanner.nextLine();

        boolean flg = false;

        char[] array = inputString.toCharArray();
        for (int i = 0; i < inputString.length(); i++) {
            if (array[i] == '0') {
                flg = true;
                break;
            }
        }
        if (flg) {
            System.out.println("Число имеет ноль");
        }
        else {
            System.out.println("Число НЕ содержит ноль");
        }
    }
}