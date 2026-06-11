import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

public class StudentRankingSystem {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student("Anu", 88));
        students.add(new Student("Bala", 95));
        students.add(new Student("Charu", 91));

        Collections.sort(students, new Comparator<Student>() {
            public int compare(Student first, Student second) {
                return second.marks - first.marks;
            }
        });

        int rank = 1;
        for (Student student : students) {
            System.out.println("Rank " + rank + ": " + student.name + " - " + student.marks);
            rank++;
        }
    }
}
