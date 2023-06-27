package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args)  {
        String path1 = "src/main/resources/shoes.csv";
        String path2 = "src/main/resources/missing_shoes.txt";

        File inputFile = new File(path1);
        File outputFile = new File(path2);

        try {
            Scanner scanner = new Scanner(inputFile);
            PrintWriter pw = new PrintWriter(outputFile);

            if(inputFile.length() == 0) {
                System.out.println("Файл пустой");
            }
            if(inputFile.length() == 0) {
                throw new EmptyFileException("Файл пустой");
            }

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] shoe = line.split(";");
                if(shoe.length != 3) throw new ArrayIndexOutOfBoundsException();
                if (Integer.parseInt(shoe[2]) == 0) {
                    pw.println(line);
                }
            }

            scanner.close();
            pw.close();
        } catch(FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (EmptyFileException e) {
            System.out.println("Файл пустой");
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("В файле не три столбца");
        }
    }
}
