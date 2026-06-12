import java.util.*;
public class EmployeeDirectory { public static void main(String[] args) { Map<Integer, String> employees = new HashMap<>(); employees.put(101, "Ravi"); employees.put(102, "Priya"); employees.put(103, "John"); System.out.println("Employee 102: " + employees.get(102)); } }
