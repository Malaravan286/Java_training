import java.util.*;
import java.util.stream.*;

public class StudentDepartmentCount {
    static class Employee {
        String name;
        String department;
        double salary;

        Employee(String name, String department, double salary) {
            this.name = name;
            this.department = department;
            this.salary = salary;
        }

        public String toString() {
            return name + "-" + department + "-" + salary;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();
        System.out.println("Student Department Count");
        for (int i = 1; i <= 4; i++) {
            System.out.print("Enter employee name: ");
            String name = scanner.nextLine();
            System.out.print("Enter department: ");
            String department = scanner.nextLine();
            System.out.print("Enter salary/score: ");
            double salary = Double.parseDouble(scanner.nextLine());
            employees.add(new Employee(name, department, salary));
        }

        List<String> report = employees.stream()
                .filter(e -> e.salary >= 50000)
                .sorted(Comparator.comparingDouble(e -> -e.salary))
                .map(e -> e.name.toUpperCase())
                .distinct()
                .limit(3)
                .collect(Collectors.toList());

        Map<String, Long> departmentCount = employees.stream()
                .collect(Collectors.groupingBy(e -> e.department, Collectors.counting()));

        OptionalDouble minSalary = employees.stream().mapToDouble(e -> e.salary).min();
        OptionalDouble maxSalary = employees.stream().mapToDouble(e -> e.salary).max();

        System.out.println("Top filtered names: " + report);
        System.out.println("Department count: " + departmentCount);
        System.out.println("Minimum value: " + (minSalary.isPresent() ? minSalary.getAsDouble() : 0));
        System.out.println("Maximum value: " + (maxSalary.isPresent() ? maxSalary.getAsDouble() : 0));
    }
}
