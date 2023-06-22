package day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Olga", "Math");
        Student student = new Student("Jack");

        teacher.evaluate(student);
    }
}
