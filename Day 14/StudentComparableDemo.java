import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student> {
    private int rollNumber;
    private String name;

    Student(int rollNumber, String name) {
        this.rollNumber = rollNumber;
        this.name = name;
    }

    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.rollNumber, other.rollNumber);
    }

    @Override
    public String toString() {
        return rollNumber + " - " + name;
    }
}

public class StudentComparableDemo {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(103, "Anu"));
        students.add(new Student(101, "Bala"));
        students.add(new Student(102, "Charu"));

        Collections.sort(students);
        System.out.println("Students sorted by roll number:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
