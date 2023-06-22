package day4;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] arr = new int[100];
        Random random = new Random();
        for(int i = 0; i < 100; i++) {
            arr[i] = random.nextInt(10000);
        }

        int min = arr[0];
        int max = arr[0];
        int endZeroCounter = 0;
        int endZeroSum = 0;

        for(int i : arr) {
            if(i < min)
                min = i;
            if(i > max)
                max = i;

            if(i % 10 == 0) {
                endZeroCounter++;
                endZeroSum += i;
            }
        }

        System.out.println(Arrays.toString(arr));
        System.out.println("Наибольший элемент: " + max);
        System.out.println("Наименьший элемент: " + min);
        System.out.println("Количество элементов, оканчивающихся на 0: " + endZeroCounter);
        System.out.println("Сумма элементов, оканчивающихся на 0: " + endZeroSum);
    }
}
