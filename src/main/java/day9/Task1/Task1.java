package day9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("John", "S123");
        Teacher teacher = new Teacher("Robert", "Computer Science");

        System.out.println(student.getGroup());
        System.out.println(teacher.getSubject());

        student.printInfo();
        teacher.printInfo();
    }
}
