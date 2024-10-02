package Методичка_JAVA;
import java.util.Scanner;

public class Zadacha_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер месяца:");
        int n = scanner.nextInt();
        while (n>12){
            System.out.println("Вы ввели месяц некорректно. Повторите попытку.");
            System.out.println("Введите номер месяца:");
            int m = scanner.nextInt();
            n=m;
        }
        int num = n / 4;
        int ost = n % 4;

        if (num == 0 && ost == 1){
            System.out.println("Месяц - Январь");
            System.out.println("Время года - Зима");}
        if (num == 0 && ost == 2){
            System.out.println("Месяц - Февраль");
            System.out.println("Время года - Зима");}
        if (num == 0 && ost == 3){
            System.out.println("Месяц - Март");
            System.out.println("Время года - Весна");}
        if (num == 1 && ost == 0){
            System.out.println("Месяц - Апрель");
            System.out.println("Время года - Весна");}
        if (num == 1 && ost == 1){
            System.out.println("Месяц - Май");
            System.out.println("Время года - Весна");}
        if (num == 1 && ost == 2){
            System.out.println("Месяц - Июнь");
            System.out.println("Время года - Лето");}
        if (num == 1 && ost == 3){
            System.out.println("Месяц - Июль");
            System.out.println("Время года - Лето");}
        if (num == 2 && ost == 0){
            System.out.println("Месяц - Август");
            System.out.println("Время года - Лето");}
        if (num == 2 && ost == 1){
            System.out.println("Месяц - Сентябрь");
            System.out.println("Время года - Осень");}
        if (num == 2 && ost == 2){
            System.out.println("Месяц - Октябрь");
            System.out.println("Время года - Осень");}
        if (num == 2 && ost == 3){
            System.out.println("Месяц - Ноябрь");
            System.out.println("Время года - Осень");}
        if (num == 3 && ost == 0){
            System.out.println("Месяц - Декабрь");
            System.out.println("Время года - Зима");}
    }
}
