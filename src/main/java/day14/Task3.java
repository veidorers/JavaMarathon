package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        File file = new File("people.txt");

        System.out.println(parseFileToObjList(file));
    }

    public static List<Person> parseFileToObjList(File file) {
        try {
            Scanner scanner = new Scanner(file);
            List<Person> result = new ArrayList<>();

            while(scanner.hasNextLine()) {
                String s = scanner.nextLine();
                String[] personArr = s.split(" ");
                String name = personArr[0];
                int age = Integer.parseInt(personArr[1]);

                if(age < 0) {
                    throw new IOException();
                }
                result.add(new Person(name, age));
            }
            scanner.close();
            return result;
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IOException e) {
            System.out.println("Некорректный входной файл");
        }

        return null;
    }
}
