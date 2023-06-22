package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setYear(2015);
        car.setColor("yellow");
        car.setModel("audi");

        Motorbike motorbike = new Motorbike(2022, "blue", "kawasaki");

        car.info();
        motorbike.info();

        System.out.println(car.yearDifference(2023));
        System.out.println(motorbike.yearDifference(2000));
    }
}
