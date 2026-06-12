import java.util.*; import java.util.stream.*;
public class UppercaseStringStream { public static void main(String[] args) { List<String> names = Arrays.asList("ravi", "meena", "john"); List<String> upper = names.stream().map(String::toUpperCase).collect(Collectors.toList()); System.out.println(upper); } }
