import java.util.*;
import java.util.function.*;

public class IntegerSortingDemo {
    static class Student implements Comparable<Student> {
        String name;
        int marks;

        Student(String name, int marks) {
            this.name = name;
            this.marks = marks;
        }

        public int compareTo(Student other) {
            return this.name.compareTo(other.name);
        }

        public String toString() {
            return name + "-" + marks;
        }
    }

    @FunctionalInterface
    interface Calculator {
        int calculate(int a, int b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> students = new ArrayList<>();
        System.out.println("Integer Sorting Demo");
        for (int i = 1; i <= 3; i++) {
            System.out.print("Enter student name: ");
            String name = scanner.nextLine();
            System.out.print("Enter marks: ");
            int marks = Integer.parseInt(scanner.nextLine());
            students.add(new Student(name, marks));
        }

        Collections.sort(students);
        System.out.println("Sorted by name using Comparable: " + students);

        students.sort(Comparator.comparingInt(s -> s.marks));
        System.out.println("Sorted by marks using Comparator and lambda: " + students);

        Calculator add = (a, b) -> a + b;
        Predicate<Student> passed = s -> s.marks >= 50;
        Consumer<Student> printer = s -> System.out.println(s.name + " pass status: " + passed.test(s));
        System.out.println("10 + 20 = " + add.calculate(10, 20));
        students.forEach(printer);
    }
}
