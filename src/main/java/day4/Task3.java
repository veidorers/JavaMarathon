package day4;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int m = 12, n = 8;
        int[][] matrix = new int[m][n];
        Random random = new Random();

        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(50);
            }
        }
        for(int i = 0; i < m; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }

        int maxIndex = 0;
        int maxSum = 0;

        for(int i = 0; i < matrix.length; i++) {
            int sum = 0;
            for(int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
            if(sum >= maxSum) {
                maxSum = sum;
                maxIndex = i;
            }
        }

        System.out.println(maxIndex);
    }
}
