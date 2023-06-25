package day11;

public class Task1 {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse(0, 0);
        Picker picker = new Picker(0, warehouse);
        Courier courier = new Courier(0, warehouse);

        for(int i = 0; i < 1500; i++) {
            picker.doWork();
        }
        for(int i = 0; i < 1000; i++) {
            courier.doWork();
        }

        System.out.println("***СКЛАД 1***");
        System.out.println(warehouse);
        System.out.println("Сборщик: " + picker.getSalary());
        System.out.println("Курьер: " + courier.getSalary());



        Warehouse warehouse2 = new Warehouse(0, 0);
        Picker picker2 = new Picker(0, warehouse2);
        Courier courier2 = new Courier(0, warehouse2);

        picker2.doWork();
        courier2.doWork();

        System.out.println("***СКЛАД 1***");
        System.out.println(warehouse);
        System.out.println("Сборщик: " + picker.getSalary());
        System.out.println("Курьер: " + courier.getSalary());
    }
}
