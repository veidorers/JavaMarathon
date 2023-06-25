package day11;

public class Courier implements Worker {
    private Warehouse warehouse;
    private int salary;

    public Courier(int salary, Warehouse warehouse) {
        this.salary = salary;
        this.warehouse = warehouse;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public void doWork() {
        salary += 100;
        warehouse.setBalance(warehouse.getBalance() + 1000);

        if(warehouse.getBalance() == 1000000) {
            bonus();
        }
    }

    @Override
    public void bonus() {
        salary *= 2;
    }
}
