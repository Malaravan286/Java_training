import java.util.*;
public class CountGreaterThanValue { public static void main(String[] args) { List<Integer> numbers = Arrays.asList(10, 25, 30, 5, 40); long count = numbers.stream().filter(n -> n > 20).count(); System.out.println("Count greater than 20: " + count); } }
