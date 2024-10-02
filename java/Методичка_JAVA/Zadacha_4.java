package Методичка_JAVA;
import java.util.Arrays;

public class Zadacha_4 {
    public static void main(String[] args) {
        int[] arr = {10, 9, 5, 0, 8, 4, 0, 8,};
        System.out.println("Введённый массив: " + Arrays.toString(arr));
        for (int i = 0; i<arr.length; i++) {
            if (arr[i] == 0) {
                System.out.println("Первый ноль имеет номер: " + (i + 1));
                break;
            }
        }
    }
}