package Методичка_JAVA;
import java.util.Scanner;
import java.util.Arrays;

public class Zadacha_7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку с первым числом:");
        String inputString1 = scanner.nextLine();
        System.out.println("Вы ввели следующее число: " + inputString1);

        int[] Array1 = new int[inputString1.length()];
        for (int i = 0; i < inputString1.length(); i++) {
            char ch = inputString1.charAt(i);
            Array1[i] = Character.getNumericValue(ch);
        }

        System.out.println("Введите строку со вторым числом:");
        String inputString2 = scanner.nextLine();
        System.out.println("Вы ввели следующее число: " + inputString2);

        int[] Array2 = new int[inputString2.length()];
        for (int i = 0; i < inputString2.length(); i++) {
            char ch = inputString2.charAt(i);
            Array2[i] = Character.getNumericValue(ch);
        }

        int n = inputString1.length();
        int m = inputString2.length();
        int g = n + m;
        int[] Array3 = new int[g];

        for (int i = 0; i < n; i++) {
            Array3[i] = Array1[i];
        }
        for (int i = 0; i < m; i++) {
            Array3[n+i] = Array2[i];
        }
        System.out.println("Итоговый массив чисел:" + Arrays.toString(Array3));
    }
}

