package Методичка_JAVA;
import java.util.Arrays;
import java.util.Scanner;

public class Zadacha_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество уровней: ");
        int n = scanner.nextInt();

        int[] kom = new int[n];//правильный код от дверей
        for (int i = 0; i < n; i++) {
            kom[i] = (int) (Math.random() * 10);//код от двери на этаже рандомится от 0 до 9
        }
        System.out.println("Правильный код: " + Arrays.toString(kom));
        System.out.println("Правильный путь сгенерирован");
        System.out.println();
        System.out.println("Вы начали игру. Выберите дверь:");

        for(int i = 0; i < n; i++){
            int y;//создаём комнату-ловушку
            do {
                y = (int) (Math.random() * 10);
            }
            while (y == kom[i]);
            System.out.println("Ловушка: " + y);

            int[] pust = new int[8];//создаём пустые комнаты
            for(int j = 0; j < 8; j++){
                int a;
                boolean flg;
                do{
                    a = (int) (Math.random() * 10); // Генерация случайного числа от 0 до 9
                    flg = true;
                    for(int l=0; l < j; l++){
                        if(pust[l] == a || a == kom[i] || a == y){
                            flg = false;
                            break;
                        }
                    }
                }
                while (!flg);
                pust[j]=a;
            }
            System.out.println("Пустые: " + Arrays.toString(pust));

            ////////////////////////////////////////////////////////////////
            int m;//выбираем дверь на этаже
            boolean flg2 = false;
            while (!flg2) {
                m = scanner.nextInt();
                if (m == kom[i]) {
                    System.out.println("Вы нашли дверь на следующий этаж");
                    flg2 = true;
                } else if (m == y) {
                    System.out.println("Вы попали в комнату с кругом телепортации и телепортировались в начало. Начните игру заново)");
                    return; // Завершаем игру
                } else {
                    System.out.println("Вы зашли в пустую комнату. Попробуйте ещё раз.");
                }
            }
        }
        System.out.println("Ооо... Кажется Вы вышли из лабиринта. Поздравляем! Игра окончена!");
    }
}
