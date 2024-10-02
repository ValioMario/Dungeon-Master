package Практические_занятия;
import java.util.Arrays;

public class Z_1 {
    private int number;

    public Z_1 (int number){
        this.number=number;
    }
    public boolean isPalindrome (){
        String numberStr = Integer.toString(number);
        int[] arr1 = new int[numberStr.length()];

        for (int i = 0; i < numberStr.length(); i++) {
            arr1[i] = Character.getNumericValue(numberStr.charAt(i));
        }

        int[] arr2 = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[arr1.length - 1 - i];
        }

        if (Arrays.toString(arr1).equals(Arrays.toString(arr2))){
            return true;
        }
        else {
            return false;
        }
    }
    public int sumOfNumbers(){
        int sum = 0;
        int temp = number;

        // Извлекаем каждую цифру числа и суммируем их
        while (temp != 0) {
            sum += temp % 10; // Добавляем последнюю цифру к сумме
            temp /= 10; // Убираем последнюю цифру из числа
        }
        return sum; // Возвращаем сумму всех цифр
    }
}


