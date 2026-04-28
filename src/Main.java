import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Ayan", 3.7, 88));
        students.add(new Student("Dana", 3.9, 95));
        students.add(new Student("Dias", 3.2, 76));
        students.add(new Student("Miras", 3.5, 82));
        students.add(new Student("Aliya", 4.0, 98));

        System.out.println("GPA бойынша сұрыптау:");
        Collections.sort(students);

        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println();

        System.out.println("Балл бойынша сұрыптау:");
        students.sort(Comparator.comparingInt(Student::getScore).reversed());

        for (Student student : students) {
            System.out.println(student);
        }
    }
}