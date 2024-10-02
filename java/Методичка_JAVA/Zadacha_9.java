package Методичка_JAVA;
import java.util.Scanner;

public class Zadacha_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите величину массива:");
        int n = scanner.nextInt();

        int[] Array = new int[n];
        for (int i = 0; i < Array.length; i++) {
            Array[i] = (int) (Math.random() * 100);
        }

        int min = Array[0];
        int max = Array[0];

        for (int i = 0; i < Array.length; i++){
            if (Array[i]<min){
                min=Array[i];
            }
            if (Array[i]>max){
                max=Array[i];
            }
        }
        int sr=(min+max)/2;
        System.out.println("Минимальное число массива: " + min);
        System.out.println("Максимальное число массива: " + max);
        System.out.println("Среднее значение: " + sr);
    }
}
