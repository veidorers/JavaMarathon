package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("AirBNB", 2022, 100, 1000000);

        airplane.setYear(2021);
        airplane.setLength(105);
        airplane.fillUp(100);
        airplane.fillUp(200);

        airplane.info();
    }
}
