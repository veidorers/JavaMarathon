package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        File file = new File("people.txt");
        System.out.println(parseFileToStringList(file));
    }

    public static List<String> parseFileToStringList(File file) {
        try {
            Scanner scanner = new Scanner(file);
            List<String> result = new ArrayList<>();

            while(scanner.hasNextLine()) {
                String s = scanner.nextLine();
                String[] person = s.split(" ");
                if(Integer.parseInt(person[1]) < 0) {
                    throw new IllegalArgumentException();
                }
                result.add(s);
            }
            scanner.close();
            return result;
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch(IllegalArgumentException e) {
            System.out.println("Некорректный входной файл");
        }


        return null;
    }
}

