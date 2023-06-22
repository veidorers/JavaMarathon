package day4;

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int[] arr = new int[100];
        Random random = new Random();

        for(int i = 0; i < 100; i++) {
            arr[i] = random.nextInt(10000);
        }

        System.out.println(Arrays.toString(arr));

        int maxIndex = 0;
        int maxSum = 0;
        int sum = 0;

        for(int i = 0; i < arr.length - 2; i++) {
            for(int j = i; j < i + 3; j++) {
                sum += arr[j];
            }
            if(sum > maxSum) {
                maxSum = sum;
                maxIndex = i;
            }

            sum = 0;
        }

        System.out.println(maxSum);
        System.out.println(maxIndex);
    }
}
