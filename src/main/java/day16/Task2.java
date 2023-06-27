package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        File file1 = new File("file1.txt");
        File file2 = new File("file2.txt");

        try {
            PrintWriter pw = new PrintWriter(file1);
            Random random = new Random();
            for(int i = 0; i < 1000; ++i) {
                pw.println(random.nextInt(100));
            }

            PrintWriter pw2 = new PrintWriter(file2);
            pw.close();
            Scanner scanner = new Scanner(file1);

            int counter = 0;
            int sum = 0;
            while(scanner.hasNextLine()) {
                sum += Integer.parseInt(scanner.nextLine());
                ++counter;

                if(counter == 20) {
                    double average = (double) sum / counter;
                    pw2.println(average);

                    counter = 0;
                    sum = 0;
                }
            }

            pw2.close();
            scanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }

        printResult(file2);


    }

    public static void printResult(File file) {
        try {
            Scanner scanner = new Scanner(file);
            double sum = 0;
            while(scanner.hasNextLine()) {
                sum += Double.parseDouble(scanner.nextLine());
            }

            System.out.println((int)sum);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }

    }
}
