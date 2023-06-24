package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("Boeing", 2022, 105, 10000);
        Airplane airplane2 = new Airplane("Boeing", 2022, 125, 10000);

        Airplane.compareAirplanes(airplane1, airplane2);
    }
}
