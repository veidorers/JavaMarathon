package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        Random random = new Random();
        for(int i = 0; i < n; i++) {
            arr[i] = random.nextInt(10);
        }

        int length = arr.length;
        int moreEight = 0;
        int equalsOne = 0;
        int evenCount = 0;
        int noEvenCount = 0;
        int sum = 0;

        for(int i : arr) {
            sum += i;

            if(i > 8)
                moreEight++;
            if(i == 1)
                equalsOne++;
            if(i % 2 == 0)
                evenCount++;
            if(i % 2 == 1)
                noEvenCount++;
        }

        System.out.println(Arrays.toString(arr));
        System.out.println("Длина массива: " + arr.length);
        System.out.println("Количество чисел больше 8: " + moreEight);
        System.out.println("Количество чисел равных 1: " + equalsOne);
        System.out.println("Количество чётных чисел: " + evenCount);
        System.out.println("Количество нечётный чисел: " + noEvenCount);
        System.out.println("Сумма всех элементов массива: " + sum);
    }
}
