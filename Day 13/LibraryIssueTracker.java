import java.util.*;
public class LibraryIssueTracker { public static void main(String[] args) { Map<String, Set<String>> issued = new HashMap<>(); issued.put("Ravi", new LinkedHashSet<>(Arrays.asList("Java", "DBMS"))); issued.put("Meena", new LinkedHashSet<>(Arrays.asList("Python"))); System.out.println(issued); } }
