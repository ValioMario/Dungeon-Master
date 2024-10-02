package Методичка_JAVA;
import java.util.Scanner;

public class Zadacha_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите степень:");
        int n = scanner.nextInt();

        System.out.println("Вы выбрали степень: " + n);

        for (int i=0; i<n; i++){
            int m = (int) Math.pow(2, i);//С помощью 'int' выделили место от -2^31 до 2^31-1
            System.out.println("Результат возведения в степень " + i + ": " + m);
        }
    }
}
