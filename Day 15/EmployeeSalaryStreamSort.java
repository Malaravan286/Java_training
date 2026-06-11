import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class StreamEmployee {
    private String name;
    private double salary;

    StreamEmployee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return name + " - " + salary;
    }
}

public class EmployeeSalaryStreamSort {
    public static void main(String[] args) {
        List<StreamEmployee> employees = Arrays.asList(
                new StreamEmployee("Arun", 50000),
                new StreamEmployee("Divya", 65000),
                new StreamEmployee("Kiran", 45000)
        );

        List<StreamEmployee> sortedEmployees = employees.stream()
                .sorted(Comparator.comparingDouble(StreamEmployee::getSalary))
                .collect(Collectors.toList());

        System.out.println("Employees sorted by salary:");
        sortedEmployees.forEach(System.out::println);
    }
}
