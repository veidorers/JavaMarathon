package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("test.txt");

        printResult(file);
    }
    public static void printResult(File file) {
        try {
            Scanner scanner = new Scanner(file);

            int sum = 0;
            String line = scanner.nextLine();
            String[] numbers = line.split(" ");

            for(String s : numbers) {
                sum += Integer.parseInt(s);
            }

            double average = (double) sum / numbers.length;
            System.out.println(average);
            System.out.printf("%.3f", average);

        } catch (FileNotFoundException e) {
            System.out.println("���� �� ������");;
        }
    }
}
