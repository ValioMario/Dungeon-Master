package Методичка_JAVA;
import java.util.Scanner;
import java.util.Arrays;

public class Zadacha_6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        String inputString = scanner.nextLine();
        System.out.println("Вы ввели следующее число: " + inputString);

        int[] narray = new int[inputString.length()];
        for (int i = 0; i < inputString.length(); i++) {
            char ch = inputString.charAt(i);
            narray[i] = Character.getNumericValue(ch);
        }
        System.out.println("Массив чисел:" + Arrays.toString(narray));
    }
}

