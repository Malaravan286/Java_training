import java.util.*;
public class StudentListOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); List<String> students = new ArrayList<>(); int choice;
        do { System.out.println("1 Add 2 Remove 3 Show 4 Exit"); choice = sc.nextInt(); sc.nextLine(); if (choice == 1) { System.out.print("Name: "); students.add(sc.nextLine()); } else if (choice == 2) { System.out.print("Name: "); students.remove(sc.nextLine()); } else if (choice == 3) System.out.println(students); } while (choice != 4); sc.close();
    }
}
