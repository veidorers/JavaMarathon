package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("test.txt");

        printSumDigits(file);
    }

    public static void printSumDigits(File file) {
        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] numbers = line.split(" ");
            int sum = 0;
            if(numbers.length != 10) {
                throw new IllegalArgumentException();
            }

            for(String number : numbers) {
                sum += Integer.parseInt(number);
            }
            scanner.close();
            System.out.println("Сумма = " + sum);

        } catch(FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException e) {
            System.out.println("Некорректный входной файл");
        }


    }
}
