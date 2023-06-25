package day12;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> cars = new LinkedList<>(Arrays.asList("Audi", "Ford", "Toyota", "Volkswagen", "Tesla"));

        System.out.println(cars);
        cars.add(cars.size() / 2, "BMW");
        cars.remove(0);
        System.out.println(cars);
    }
}
