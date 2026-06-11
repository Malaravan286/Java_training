class Employee {
    private String name;
    private double baseSalary;

    Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public double calculateSalary() {
        return baseSalary;
    }
}

class FullTimeEmployee extends Employee {
    FullTimeEmployee(String name, double baseSalary) {
        super(name, baseSalary);
    }

    public double calculateSalary() {
        return getBaseSalary() + 5000;
    }
}

class PartTimeEmployee extends Employee {
    private int hoursWorked;

    PartTimeEmployee(String name, double hourlyRate, int hoursWorked) {
        super(name, hourlyRate);
        this.hoursWorked = hoursWorked;
    }

    public double calculateSalary() {
        return getBaseSalary() * hoursWorked;
    }
}

public class EmployeeSalaryProcessing {
    public static void main(String[] args) {
        Employee[] employees = {
            new FullTimeEmployee("Kumar", 30000),
            new PartTimeEmployee("Priya", 300, 80)
        };

        for (Employee employee : employees) {
            System.out.println(employee.getName() + " salary: Rs." + employee.calculateSalary());
        }
    }
}
