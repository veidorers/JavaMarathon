package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setYear(2011);
        car.setColor("black");
        car.setModel("X5");

        System.out.println(car.getYear());
        System.out.println(car.getColor());
        System.out.println(car.getModel());
    }
}

class Car {
    private int year;
    private String color;
    private String model;

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return this.year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
