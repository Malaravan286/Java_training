import java.util.*;
public class StudentRankingSystem {
    static class Student { String name; int marks; Student(String name, int marks) { this.name = name; this.marks = marks; } }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); ArrayList<Student> students = new ArrayList<>();
        System.out.print("How many students? "); int n = sc.nextInt(); sc.nextLine();
        for (int i = 0; i < n; i++) { System.out.print("Name: "); String name = sc.nextLine(); System.out.print("Marks: "); int marks = sc.nextInt(); sc.nextLine(); students.add(new Student(name, marks)); }
        // Comparator sorts highest marks first.
        students.sort(Comparator.comparingInt((Student s) -> s.marks).reversed());
        for (Student s : students) System.out.println(s.name + " - " + s.marks); sc.close();
    }
}
