import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class DepartmentStudent {
    private String name;
    private String department;

    DepartmentStudent(String name, String department) {
        this.name = name;
        this.department = department;
    }

    String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return name;
    }
}

public class StudentDepartmentGrouping {
    public static void main(String[] args) {
        List<DepartmentStudent> students = Arrays.asList(
                new DepartmentStudent("Anu", "CSE"),
                new DepartmentStudent("Bala", "ECE"),
                new DepartmentStudent("Charu", "CSE"),
                new DepartmentStudent("David", "EEE")
        );

        Map<String, List<DepartmentStudent>> groupedStudents = students.stream()
                .collect(Collectors.groupingBy(DepartmentStudent::getDepartment));

        System.out.println("Students grouped by department:");
        groupedStudents.forEach((department, studentList) ->
                System.out.println(department + ": " + studentList));
    }
}
