package Методичка_JAVA;
import java.util.Scanner;

public class Zadacha_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите величину массива:");
        int n = scanner.nextInt();
        System.out.println("Введите " + n + " элементов массива:");

        int[] Array = new int[n];
        for (int i = 0; i < Array.length; i++) {
            Array [i]= scanner.nextInt();
        }
        System.out.println("Вы ввели следующий массив:");
        for (int ch : Array) {
            System.out.print(ch + "; ");
        }
        boolean flg;
        for (int i = 0; i < n - 1; i++) {
            flg = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (Array[j] > Array[j + 1]) {
                    // Меняем местами array[j] и array[j + 1]
                    int temp = Array[j];
                    Array[j] = Array[j + 1];
                    Array[j + 1] = temp;
                    flg = true;
                }
            }
        }
        System.out.println();
        System.out.println("Отпузырькованный массив: ");
        for (int ch : Array) {
            System.out.print(ch + "; ");
        }
    }
}